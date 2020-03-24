package com.hr.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.hr.dto.EngageAnswerDetailAndEngageSubjects;
import com.hr.mapper.EngageAnswerDetailsMapper;
import com.hr.mapper.EngageAnswerMapper;
import com.hr.mapper.EngageExamDetailsMapper;
import com.hr.mapper.EngageExamMapper;
import com.hr.mapper.EngageSubjectsMapper;
import com.hr.pojo.EngageAnswer;
import com.hr.pojo.EngageAnswerDetails;
import com.hr.pojo.EngageExam;
import com.hr.pojo.EngageExamDetails;
import com.hr.pojo.EngageResume;
import com.hr.pojo.EngageSubjects;
import com.hr.service.EngageSubjectsService;
import com.hr.service.ToExamService;
import com.hr.util.Get16UUID;
import com.hr.util.ProjectToMapUtil;
import com.hr.util.RandomOfInt;
import com.hr.util.ResumeState;

@Service
public class ToExamServiceImpl implements ToExamService {
	@Autowired
	EngageAnswerMapper engageAnswerMapper;
	@Autowired
	EngageExamMapper engageExamMapper;
	@Autowired
	EngageExamDetailsMapper engageExamDetailsMapper;
	@Autowired
	EngageSubjectsMapper engageSubjectsMapper;
	@Autowired
	EngageAnswerDetailsMapper engageAnswerDetailsMapper;
	@Autowired
	com.hr.mapper.EngageResumeMapper engageResumeMapper;
	@Override
	public Map<String, Object> changetoExam(String humanName, String humanIdcard, String humanMajorKindName,
			String humanMajorName) {
		Map<String,Object> returnMap = new HashMap<>();
		Map<String,String> map = new HashMap<String,String>();
		map.put("humanName", humanName);
		map.put("humanIdcard", humanIdcard);
		map.put("humanMajorKindName", humanMajorKindName);
		map.put("humanMajorName", humanMajorName);
		EngageResume er = engageResumeMapper.findEngageExamByhumanNameAndhumanIdcard(map);
		System.out.println(er);
		if(er.getCheckStatus()==ResumeState.RECOMMEND_TEST){
			if(er.getTestAmount()==null||"".equals(er.getTestAmount())){
				er.setTestAmount(1);
				engageResumeMapper.updateEngageResume(ProjectToMapUtil.toMap(er));
				
				EngageAnswer ea = engageAnswerMapper.findEngageAnswerByEngageInterviewAndEngageResume(map);
				String answerNumber = Get16UUID.getUUID().trim();
				ea.setAnswerNumber(answerNumber);
				List<EngageExam> eelist = engageExamMapper.findEngageExamBymajorkindnameAndmajorname(map);
				int i = RandomOfInt.rand(eelist.size());
				String examNumber = eelist.get(i).getExamNumber();
				ea.setExamNumber(examNumber);
				engageAnswerMapper.insertEngageAnswer(ea);
				System.out.println(ea);
				//获取题目
				List<EngageExamDetails> eedlist = engageExamDetailsMapper.findEngageExamDetailsByExamNumber(ea.getExamNumber());
				Map<String,Object> map1 = new HashMap<String,Object>();
				List<EngageSubjects> subjects = new ArrayList<EngageSubjects>();
				int shu = 0;
				for (EngageExamDetails engageExamDetails : eedlist) {
					map1.put("firstKindName", engageExamDetails.getFirstKindName());
					map1.put("secondKindName", engageExamDetails.getSecondKindName());
					map1.put("tiaoshu", engageExamDetails.getQuestionAmount());
					shu+=engageExamDetails.getQuestionAmount();
					subjects.addAll(engageSubjectsMapper.findEngageSubjectsBysuiji(map1));
				}
				for (EngageSubjects engageSubjects : subjects) {
					System.out.println(engageSubjects);
					EngageAnswerDetails engageAnswerDetails = new EngageAnswerDetails();
					engageAnswerDetails.setAnswerNumber(answerNumber);
					engageAnswerDetails.setSubjectId(engageSubjects.getSubId());
					engageAnswerDetailsMapper.insertEngageAnswerDetails(engageAnswerDetails);
				}
				returnMap.put("humanName", humanName);
				returnMap.put("humanIdcard", humanIdcard);
				returnMap.put("shu", shu);
				returnMap.put("ee", eelist.get(i));
				returnMap.put("subjects", subjects);
				returnMap.put("answerNumber", answerNumber);
				returnMap.put("return", "1");
			}else{
				er.setTestAmount(er.getTestAmount()+1);
				engageResumeMapper.updateEngageResume(ProjectToMapUtil.toMap(er));
				
				EngageAnswer ea = engageAnswerMapper.findEngageAnswerByResumeId(er.getResId()+"");
				String answerNumber = Get16UUID.getUUID().trim();
				ea.setAnswerNumber(answerNumber);
				List<EngageExam> eelist = engageExamMapper.findEngageExamBymajorkindnameAndmajorname(map);
				int i = RandomOfInt.rand(eelist.size());
				String examNumber = eelist.get(i).getExamNumber();
				ea.setExamNumber(examNumber);
				engageAnswerMapper.updateEngageAnswer(ProjectToMapUtil.toMap(ea));
				//获取题目
				List<EngageExamDetails> eedlist = engageExamDetailsMapper.findEngageExamDetailsByExamNumber(ea.getExamNumber());
				Map<String,Object> map1 = new HashMap<String,Object>();
				List<EngageSubjects> subjects = new ArrayList<EngageSubjects>();
				int shu = 0;
				for (EngageExamDetails engageExamDetails : eedlist) {
					map1.put("firstKindName", engageExamDetails.getFirstKindName());
					map1.put("secondKindName", engageExamDetails.getSecondKindName());
					map1.put("tiaoshu", engageExamDetails.getQuestionAmount());
					shu+=engageExamDetails.getQuestionAmount();
					subjects.addAll(engageSubjectsMapper.findEngageSubjectsBysuiji(map1));
				}
				for (EngageSubjects engageSubjects : subjects) {
					EngageAnswerDetails engageAnswerDetails = new EngageAnswerDetails();
					engageAnswerDetails.setAnswerNumber(answerNumber);
					engageAnswerDetails.setSubjectId(engageSubjects.getSubId());
					engageAnswerDetailsMapper.insertEngageAnswerDetails(engageAnswerDetails);
				}
				returnMap.put("humanName", humanName);
				returnMap.put("humanIdcard", humanIdcard);
				returnMap.put("shu", shu);
				returnMap.put("ee", eelist.get(i));
				returnMap.put("subjects", subjects);
				returnMap.put("answerNumber", answerNumber);
				returnMap.put("return", "2");
			}
		}else{
			returnMap.put("return", "3");
		}
		return returnMap;
	}
	
	@Override
	public boolean changeexamResult(String humanName, String humanIdcard, String examNumber,String answerNumber, String testTime, Model model,
			HttpServletRequest requset) {
		List<EngageSubjects> subjects = (List<EngageSubjects>) requset.getSession().getAttribute("subjectslist");
		Map<String,String> mm = new HashMap<>();
		mm.put("answerNumber", answerNumber);
		System.out.println(answerNumber);
		int num = 0;
		for (EngageSubjects engageSubjects : subjects) {
			String key = requset.getParameter(engageSubjects.getSubId()+"");
			mm.put("answer", key);
			mm.put("subjectId",engageSubjects.getSubId()+"");
			if(key.equalsIgnoreCase(engageSubjects.getCorrectKey())){
				num++;
			}
			engageAnswerDetailsMapper.updateEngageAnswerDetailsBysubjectIdAndanswerNumber(mm);
		}
		int k = 100*num/subjects.size();
		Map<String,String> map = new HashMap<>();
		map.put("answerNumber", answerNumber);
		map.put("totalPoint", k+"");
		map.put("useTime", testTime);
		engageAnswerMapper.updateEngageAnswerByanswerNumber(map);
		Map<String,String> map1 = new HashMap<>();
		map1.put("humanIdcard", humanIdcard);
		map1.put("testCheckTime", new Timestamp(System.currentTimeMillis()).toString());
		map1.put("checkStatus", ResumeState.RECOMMEND_TESTED+"");
		map1.put("totalPoints", k+"");
		engageResumeMapper.updateEngageResumeByhumanIdcard(map1);
		return true;
	}
	@Override
	public Map<String, Object> findExam(String resId){
		List<String> list = new ArrayList<>();
		list.add(resId);
		List<EngageResume> erlist = engageResumeMapper.findEngageResumeByIds(list);
		EngageResume er = erlist.get(0);
		EngageAnswer ea = engageAnswerMapper.findEngageAnswerByResumeId(resId);
		List<EngageExamDetails> eadlist = engageExamDetailsMapper.findEngageExamDetailsByExamNumber(ea.getExamNumber());
		int i = 0;
		for (EngageExamDetails engageExamDetails : eadlist) {
			i+=engageExamDetails.getQuestionAmount();
		}
		List<EngageAnswerDetailAndEngageSubjects> eadaes = engageAnswerDetailsMapper.findengageAnswerDetailAndEngageSubjectsByanswerNumber(ea.getAnswerNumber());
		EngageExam ee = engageExamMapper.findEngageExamByexamNumber(ea.getExamNumber());
		Map<String, Object> map = new HashMap<>();
		map.put("er",er);
		map.put("ea",ea);
		map.put("ee",ee);
		map.put("shu",i);
		map.put("eadaes",eadaes);
		return map;
	}
}
