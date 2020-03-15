package com.hr.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.mapper.ConfigFileFirstKindMapper;
import com.hr.mapper.ConfigFileSecondKindMapper;
import com.hr.mapper.ConfigFileThirdKindMapper;
import com.hr.pojo.ConfigFileFirstKind;
import com.hr.pojo.ConfigFileSecondKind;
import com.hr.pojo.ConfigFileThirdKind;
import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.EngageMajorRelease;
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.EngageMajorReleaseService;
import com.hr.util.ProjectToMapUtil;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/position")
public class PositionController {
	@Autowired
	ConfigFileFirstKindService firstService;
	@Autowired
	ConfigFileSecondKindService  secondService;
	@Autowired
	ConfigFileThirdKindService thirdService;
	@Autowired
	ConfigMajorKindService majorKindService;
	@Autowired
	ConfigMajorService majorService;
	@Autowired
	EngageMajorReleaseService majorReleaseService;
	
	//第一次进职位登记 获取信息
	@RequestMapping("first.do")
	public String positionRegisterFirst(Model model){
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		List<ConfigMajorKind> mlist = majorKindService.findConfigMajorKindAll();
		model.addAttribute("flist",list);
		model.addAttribute("mlist",mlist);
		return "forward:/page/recruit/position/position_register.jsp";
	}
	//联动的二级机构
	@RequestMapping(value="second.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String positionRegisterSecond(String fid){
		if(fid!=null&&!"".equals(fid)){
			List<ConfigFileSecondKind> list = secondService.findConfigFileSecondKindByFirstId(fid);
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return "";
		}
	}
	//联动的三级机构
	@RequestMapping(value="third.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String positionRegisterThird(String fid,String sid){
		if(fid!=null&&!"".equals(fid)&&sid!=null&&!"".equals(sid)){
			Map<String, String> map = new HashMap<String, String>();
			map.put("fid", fid);
			map.put("sid", sid);
			List<ConfigFileThirdKind> list = thirdService.findConfigFileThirdKindByFirstIdAndSecondId(map);
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return "";
		}
		
	}
	//职位的联动
	@RequestMapping(value="ByIdQueryMajor.do",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String byIdQueryMajor(String mid){
		if(mid!=null&&!"".equals(mid)){
			List<ConfigMajor> list = majorService.findConfigMajorByMajorKindId(mid);
			JSONArray jsonarr = JSONArray.fromObject(list);
			return jsonarr.toString();
		}else{
			return "";
		}
		
	}
	
	//登记保存
	@RequestMapping("savepositionRegister.do")
	public String savepositionRegister(@ModelAttribute EngageMajorRelease majorRelease){
		if(majorRelease!=null&&!"".equals(majorRelease)){
			int i = majorReleaseService.saveEngageMajorRelease(majorRelease);
			if(i!=0){
				return "redirect:/position/positionChangeUpdate.do";
			}else{
				return "redirect:/position/first.do";
			}
		}else{
			return "";
		}
	}
	//修改的主页
	@RequestMapping("positionChangeUpdate.do")
	public String positionChangeUpdate(Model model){
		List<EngageMajorRelease> list = majorReleaseService.findEngageMajorReleaseAll();
		model.addAttribute("mrlist", list);
		return "forward:/page/recruit/position/position_change_update.jsp";
	}
	//删除发布的职位
	@RequestMapping("deleteMajorRelease.do")
	@ResponseBody
	public String deleteMajorRelease(String mid){
		System.out.println(mid);
		int i = majorReleaseService.removeEngageMajorReleaseById(mid);
		if(i==1){
			return "ok";
		}else{
			return "shibai";
		}
	}
	
	//修改的编辑页面
	@RequestMapping("queryByIdMajorRelease.do")
	public String queryByIdMajorRelease(String mid,Model model){
		if(mid!=null&&!"".equals(mid)){
			List<String> mids = new ArrayList<String>();
			mids.add(mid);
			List<EngageMajorRelease> list = majorReleaseService.findEngageMajorReleaseByIds(mids);
			if(list.size()==1){
				model.addAttribute("mr", list.get(0));
				return "forward:/page/recruit/position/position_release_change.jsp";
			}else{
				return "";
			}
		}else{
			return "";
		}
	}
	
	//修改
	@RequestMapping("updateMajorRelease.do")
	public String updateMajorRelease(@ModelAttribute EngageMajorRelease majorRelease,Model model){
		if(majorRelease!=null&&!"".equals(majorRelease)){
			Map map = ProjectToMapUtil.toMap(majorRelease);
			majorReleaseService.changeEngageMajorRelease(map);
			model.addAttribute("mr", majorRelease);
			return "forward:/page/recruit/position/position_release_change.jsp";
		}else{
			return "";
		}
	}
	
	//职位发布查询
	@RequestMapping("positionReleaseSearch.do")
	public String positionReleaseSearch(Model model){
		List<EngageMajorRelease> list = majorReleaseService.findEngageMajorReleaseAll();
		model.addAttribute("mrlist", list);
		return "forward:/page/recruit/position/position_release_search.jsp";
	}
	//查看职位详细信息
	@RequestMapping("queryByIdMajorReleaseToDetails.do")
	public String queryByIdMajorReleaseToDetails(String mid,Model model){
		if(mid!=null&&!"".equals(mid)){
			List<String> mids = new ArrayList<String>();
			mids.add(mid);
			List<EngageMajorRelease> list = majorReleaseService.findEngageMajorReleaseByIds(mids);
			if(list.size()==1){
				model.addAttribute("mr", list.get(0));
				return "forward:/page/recruit/position/position_release_details.jsp";
			}else{
				return "";
			}
		}else{
			return "";
		}
	}
	
}
