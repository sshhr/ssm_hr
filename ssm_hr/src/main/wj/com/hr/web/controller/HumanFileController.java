package com.hr.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.mapper.CheckStatus;
import com.hr.mapper.HumanFileStatus;
import com.hr.pojo.ConfigFileFirstKind;
import com.hr.pojo.ConfigMajorKind;
import com.hr.pojo.HumanFile;
import com.hr.pojo.SalaryStandard;
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.ConfigPublicCharServiceSjh;
import com.hr.service.HumanFileService;
import com.hr.service.SalaryStandardService;
import com.hr.util.ProjectToMapUtil;

import net.sf.json.JSONArray;


@Controller
@RequestMapping("/humanresources")
public class HumanFileController {
	
	@Autowired
	ConfigFileFirstKindService firstService;//一级机构
	@Autowired
	ConfigFileSecondKindService  secondService;//二级机构
	@Autowired
	ConfigFileThirdKindService thirdService;//三级机构
	@Autowired
	ConfigMajorKindService majorKindService;//职位种类
	@Autowired
	ConfigMajorService majorService;//职称
	@Autowired
	private HumanFileService humanfileservice;//人档案
	@Autowired
	private ConfigPublicCharServiceSjh configPublicCharServiceSjh;//公共字段
	@Autowired
	private SalaryStandardService salarystandardservice;//薪资标准
	
	@RequestMapping("humanRegist.do")
	public String human_regist(Model model) {
		List<HumanFile> hlist=humanfileservice.findHumanFileByHumanStatus(HumanFileStatus.INIT,CheckStatus.NO);
		model.addAttribute("hlist",hlist);
		model.addAttribute("count", hlist.size());
		return "forward:/page/humanResources/regist_list.jsp";
	}
	//登记界面
	@RequestMapping("jumpHuman.do")
	public String jumpHuman(String humanid,Model model) {
		System.out.println(humanid);
		if(humanid!=null&&!"".equals(humanid)){
			List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
			List<ConfigMajorKind> zwlist = majorKindService.findConfigMajorKindAll();
			model.addAttribute("flist",list);
			model.addAttribute("zwlist",zwlist);
			HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
			List<String> zclist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("职称");
			List<String> glist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("国籍");
			List<String> mlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("民族");
			List<String> zlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("宗教信仰");
			List<String> zzlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("政治面貌");
			List<String> xlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("学历");
			List<String> jlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("教育年限");
			List<String> xlzylist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("专业");
			List<String> tlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("特长");
			List<String> alist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("爱好");
			List<SalaryStandard> xclist = salarystandardservice.findSalaryStandardAll();
	//		System.out.println(xclist);
			model.addAttribute("zclist", zclist);
			model.addAttribute("glist", glist);
			model.addAttribute("mlist", mlist);
			model.addAttribute("zlist", zlist);
			model.addAttribute("zzlist", zzlist);
			model.addAttribute("xlist", xlist);
			model.addAttribute("jlist", jlist);
			model.addAttribute("xlzylist", xlzylist);
			model.addAttribute("tlist", tlist);
			model.addAttribute("alist", alist);
			model.addAttribute("xclist", xclist);
			model.addAttribute("human", human);
			return "forward:/page/humanResources/human_register.jsp";
		}
		return " ";
		
	}
	//点击登记保存
	@RequestMapping("saveHumanRegister.do")
	public String saveHumanFile(@ModelAttribute HumanFile humanfile) {
		humanfile.setHumanFileStatus(HumanFileStatus.YES);
//		System.out.println(humanfile.toString());
		Map<String,String> map = ProjectToMapUtil.toMap(humanfile);
		humanfileservice.changeHumanFile(map);
			//通过humanId查询出humanfile
//			humanfile = humanfileservice.findHumanFileByHumanId(humanId);
//			model.addAttribute("hufId", humanfile.getHufId());
			return "forward:/page/humanResources/success.jsp";
		
	}
	//列出待复核的所有人资档案
	@RequestMapping("humanFileCheckList.do")
	  public String humanFileCheckList(@ModelAttribute HumanFile humanfile,Model model){
		List<HumanFile> checklist=humanfileservice.findHumanFileByStatus(CheckStatus.NO);
		model.addAttribute("checklist", checklist);
		model.addAttribute("count", checklist.size());
		return "forward:/page/humanResources/check_list.jsp";
		
	}
	
	
	//某个待复核的人资档案
	@RequestMapping(value="humanFileCheck.do")
	public String humanFileCheck(String humanid,Model model) {
//		System.out.println(humanid);
		if(humanid!=null&&!"".equals(humanid)){
			HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
//			System.out.println(human.getHumanId());
			List<String> zclist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("职称");
			List<String> glist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("国籍");
			List<String> mlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("民族");
			List<String> zlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("宗教信仰");
			List<String> zzlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("政治面貌");
			List<String> xlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("学历");
			List<String> jlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("教育年限");
			List<String> xlzylist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("专业");
			List<String> tlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("特长");
			List<String> alist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("爱好");
			List<SalaryStandard> xclist = salarystandardservice.findSalaryStandardAll();
			model.addAttribute("zclist", zclist);
			model.addAttribute("glist", glist);
			model.addAttribute("mlist", mlist);
			model.addAttribute("zlist", zlist);
			model.addAttribute("zzlist", zzlist);
			model.addAttribute("xlist", xlist);
			model.addAttribute("jlist", jlist);
			model.addAttribute("xlzylist", xlzylist);
			model.addAttribute("tlist", tlist);
			model.addAttribute("alist", alist);
			model.addAttribute("xclist", xclist);
			model.addAttribute("human", human);
			return "forward:/page/humanResources/human_check.jsp";
	}else {
		return "shibai";
	}
	}
	//某个待复核的人资档案通过审核
	@RequestMapping("humanFileCheckPass.do")
	public String humanFileCheckPass(@ModelAttribute HumanFile humanfile) {
		humanfile.setCheckStatus(CheckStatus.YES);
//		System.out.println(humanfile.toString());
		Map<String,String> map = ProjectToMapUtil.toMap(humanfile);
		humanfileservice.changeHumanFile(map);
		return "forward:/page/humanResources/success.jsp";
	}

	//查询
	@RequestMapping("queryHumanFile.do")
	public String queryHumanFile(Model model) {
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		List<ConfigMajorKind> zwlist = majorKindService.findConfigMajorKindAll();
		model.addAttribute("flist",list);
		model.addAttribute("zwlist",zwlist);
		return "forward:/page/humanResources/query_locate.jsp";
		
	}
	//符合查询条件的人  多条件查询
	@RequestMapping("queryList.do")
	public String queryList(String firstKindId,String secondKindId,String thirdKindId,String humanMajorKindId,String humanMajorId,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(firstKindId!=null&&!"".equals(firstKindId)){
			map.put("firstKindId",firstKindId);
		}
		if(secondKindId!=null&&!"".equals(secondKindId)){
			map.put("secondKindId", secondKindId);
		}
		if(thirdKindId!=null&&!"".equals(thirdKindId)){
			map.put("thirdKindId",thirdKindId);
		}
		if(humanMajorKindId!=null&&!"".equals(humanMajorKindId)){
			map.put("humanMajorKindId", humanMajorKindId);
		}
		if(humanMajorId!=null&&!"".equals(humanMajorId)){
			map.put("humanMajorId", humanMajorId);
		}
		if(startdate!=null&&!"".equals(startdate)){
			map.put("startdate", startdate);
		}
		if(enddate!=null&&!"".equals(enddate)){
			map.put("enddate", enddate);
		}
		List<HumanFile> hlist=humanfileservice.querysLocate(map);
//		System.out.println(firstKindId);
//		System.out.println(secondKindId);
//		System.out.println(thirdKindId);
//		System.out.println(humanMajorKindId);
//		System.out.println(humanMajorId);
		model.addAttribute("hlist", hlist);
		model.addAttribute("count",hlist.size());//查询条数
		return "forward:/page/humanResources/query_list.jsp";
		
	}
	//人资档案明细
	@RequestMapping(value="humanFileInfo.do")
	public String humanFileInfo(String humanid,Model model) {
		if(humanid!=null&&!"".equals(humanid)){
			HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
			model.addAttribute("human", human);
			return "forward:/page/humanResources/query_list_information.jsp";
	}else {
		return "shibai";
	}
	}	
	//关键字搜索
		@RequestMapping("toquerySearch.do")
		public String toquerySearch(){
			return "forward:/page/humanResources/query_keywords.jsp";
			
		}
	//关键字搜索的
	@RequestMapping("querySearch.do")
	public String querys_search(@RequestParam Map map,Model model){
		List<HumanFile> hlist=humanfileservice.querysSearch(map);
		model.addAttribute("primarykey",map.get("primaryKey"));
		model.addAttribute("hlist", hlist);
		model.addAttribute("count",hlist.size());
		return "forward:/page/humanResources/query_list.jsp";
	}
	
	//档案变更
	@RequestMapping("humanUpdate.do")
	public String humanUpdate(Model model){
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		List<ConfigMajorKind> rlist = majorKindService.findConfigMajorKindAll();
		model.addAttribute("flist",list);
		model.addAttribute("rlist",rlist);
		return "forward:/page/humanResources/change_locate.jsp";
	}
	//符合查询条件的人  多条件查询
	@RequestMapping("changeList.do")
	public String changeList(String firstKindId,String secondKindId,String thirdKindId,String humanMajorKindId,String humanMajorId,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(firstKindId!=null&&!"".equals(firstKindId)){
			map.put("firstKindId",firstKindId);
		}
		if(secondKindId!=null&&!"".equals(secondKindId)){
			map.put("secondKindId", secondKindId);
		}
		if(thirdKindId!=null&&!"".equals(thirdKindId)){
			map.put("thirdKindId",thirdKindId);
		}
		if(humanMajorKindId!=null&&!"".equals(humanMajorKindId)){
			map.put("humanMajorKindId", humanMajorKindId);
		}
		if(humanMajorId!=null&&!"".equals(humanMajorId)){
			map.put("humanMajorId", humanMajorId);
		}
		if(startdate!=null&&!"".equals(startdate)){
			map.put("startdate", startdate);
		}
		if(enddate!=null&&!"".equals(enddate)){
			map.put("enddate", enddate);
		}
		List<HumanFile> hlist=humanfileservice.removeLocate(map);
		model.addAttribute("hlist", hlist);
		model.addAttribute("count",hlist.size());//查询条数
		return "forward:/page/humanResources/change_list.jsp";
		
	}
	//人资档案详情信息更改
	@RequestMapping("updateHumanFile.do")
	public String updateHumanFile(String humanid,Model model) {
		if(humanid!=null&&!"".equals(humanid)){
			HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
			List<String> zclist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("职称");
			List<String> glist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("国籍");
			List<String> mlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("民族");
			List<String> zlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("宗教信仰");
			List<String> zzlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("政治面貌");
			List<String> xlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("学历");
			List<String> jlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("教育年限");
			List<String> xlzylist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("专业");
			List<String> tlist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("特长");
			List<String> alist = configPublicCharServiceSjh.findConfigPublicCharByAttributeKind("爱好");
			List<SalaryStandard> xclist = salarystandardservice.findSalaryStandardAll();
			model.addAttribute("zclist", zclist);
			model.addAttribute("glist", glist);
			model.addAttribute("mlist", mlist);
			model.addAttribute("zlist", zlist);
			model.addAttribute("zzlist", zzlist);
			model.addAttribute("xlist", xlist);
			model.addAttribute("jlist", jlist);
			model.addAttribute("xlzylist", xlzylist);
			model.addAttribute("tlist", tlist);
			model.addAttribute("alist", alist);
			model.addAttribute("xclist", xclist);
			model.addAttribute("human", human);
			return "forward:/page/humanResources/change_list_information.jsp";
	}else {
		return "shibai";
	}
	}
	//关键字搜索
	@RequestMapping("changeSearchPage.do")
	public String changeSearchPage(){
		return "forward:/page/humanResources/change_keywords.jsp";
		
	}
	//关键字搜索的
	@RequestMapping("changeSearch.do")
	public String changeSearch(@RequestParam Map map,Model model){
		List<HumanFile> hlist=humanfileservice.removeSearch(map);
		model.addAttribute("primarykey",map.get("primaryKey"));
		model.addAttribute("hlist", hlist);
		model.addAttribute("count",hlist.size());
		return "forward:/page/humanResources/change_list.jsp";
	}
	
	//某个人资档案已变更，待复核
	@RequestMapping("humanFileUpdate.do")
	public String humanFileUpdate(@ModelAttribute HumanFile human) {
		human.setCheckStatus(CheckStatus.NO);
//		System.out.println(human.toString());
		Map<String,String> map = ProjectToMapUtil.toMap(human);
		humanfileservice.changeHumanFile(map);
		return "forward:/page/humanResources/success.jsp";
	}
	
//	删除
	//查询界面
	@RequestMapping("deleteLocate.do")
	public String deleteLocate(Model model) {
		List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
		List<ConfigMajorKind> zwlist = majorKindService.findConfigMajorKindAll();
		model.addAttribute("flist",list);
		model.addAttribute("zwlist",zwlist);
		return "forward:/page/humanResources/delete_locate.jsp";
		
	}
	//符合查询条件的人  多条件查询
	@RequestMapping("deleteList.do")
	public String deleteList(String firstKindId,String secondKindId,String thirdKindId,String humanMajorKindId,String humanMajorId,String startdate,String enddate,Model model){
		Map<String,Object> map = new HashMap<>();
		if(firstKindId!=null&&!"".equals(firstKindId)){
			map.put("firstKindId",firstKindId);
		}
		if(secondKindId!=null&&!"".equals(secondKindId)){
			map.put("secondKindId", secondKindId);
		}
		if(thirdKindId!=null&&!"".equals(thirdKindId)){
			map.put("thirdKindId",thirdKindId);
		}
		if(humanMajorKindId!=null&&!"".equals(humanMajorKindId)){
			map.put("humanMajorKindId", humanMajorKindId);
		}
		if(humanMajorId!=null&&!"".equals(humanMajorId)){
			map.put("humanMajorId", humanMajorId);
		}
		if(startdate!=null&&!"".equals(startdate)){
			map.put("startdate", startdate);
		}
		if(enddate!=null&&!"".equals(enddate)){
			map.put("enddate", enddate);
		}
		List<HumanFile> hlist=humanfileservice.removeLocate(map);
		model.addAttribute("hlist", hlist);
		model.addAttribute("count",hlist.size());//查询条数
		return "forward:/page/humanResources/delete_list.jsp";
		
	}
	//人资档案明细
	@RequestMapping(value="humanFileDelInfo.do")
	public String humanFileDelInfo(String humanid,Model model) {
		if(humanid!=null&&!"".equals(humanid)){
			HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
			model.addAttribute("human", human);
			return "forward:/page/humanResources/delete_list_information.jsp";
	}else {
		return "shibai";
	}
	}
//	某个人资档案已删除
	@RequestMapping("humanFileDel.do")
	public String humanFileDel(@ModelAttribute HumanFile human) {
		human.setHumanFileStatus(HumanFileStatus.NO);
		System.out.println(human.toString());
		Map<String,String> map = ProjectToMapUtil.toMap(human);
		humanfileservice.changeHumanFile(map);
		return "forward:/page/humanResources/success.jsp";
	}
	//关键字搜索
		@RequestMapping("deleteSearchPage.do")
		public String deleteSearchPage(){
			return "forward:/page/humanResources/delete_keywords.jsp";
			
		}
		//关键字搜索的
		@RequestMapping("deleteSearch.do")
		public String deleteSearch(@RequestParam Map map,Model model){
			List<HumanFile> hlist=humanfileservice.removeSearch(map);
			model.addAttribute("primarykey",map.get("primaryKey"));
			model.addAttribute("hlist", hlist);
			model.addAttribute("count",hlist.size());
			return "forward:/page/humanResources/delete_list.jsp";
		}
		
//		恢复删除
		//查询界面
		@RequestMapping("recoveryLocate.do")
		public String recoveryLocate(Model model) {
			List<ConfigFileFirstKind> list = firstService.findConfigFileFirstKindAll();
			List<ConfigMajorKind> zwlist = majorKindService.findConfigMajorKindAll();
			model.addAttribute("flist",list);
			model.addAttribute("zwlist",zwlist);
			return "forward:/page/humanResources/recovery_locate.jsp";
			
		}
	
		//符合查询条件的人  多条件查询
		@RequestMapping("recoveryList.do")
		public String recoveryList(String firstKindId,String secondKindId,String thirdKindId,String humanMajorKindId,String humanMajorId,String startdate,String enddate,Model model){
			Map<String,Object> map = new HashMap<>();
			if(firstKindId!=null&&!"".equals(firstKindId)){
				map.put("firstKindId",firstKindId);
			}
			if(secondKindId!=null&&!"".equals(secondKindId)){
				map.put("secondKindId", secondKindId);
			}
			if(thirdKindId!=null&&!"".equals(thirdKindId)){
				map.put("thirdKindId",thirdKindId);
			}
			if(humanMajorKindId!=null&&!"".equals(humanMajorKindId)){
				map.put("humanMajorKindId", humanMajorKindId);
			}
			if(humanMajorId!=null&&!"".equals(humanMajorId)){
				map.put("humanMajorId", humanMajorId);
			}
			if(startdate!=null&&!"".equals(startdate)){
				map.put("startdate", startdate);
			}
			if(enddate!=null&&!"".equals(enddate)){
				map.put("enddate", enddate);
			}
			List<HumanFile> hlist=humanfileservice.recoveryLocate(map);
			model.addAttribute("hlist", hlist);
			model.addAttribute("count",hlist.size());//查询条数
			return "forward:/page/humanResources/recovery_list.jsp";
			
		}
	
		//人资档案明细
		@RequestMapping(value="recoveryHumanFile.do")
		public String recoveryHumanFile(String humanid,Model model) {
			if(humanid!=null&&!"".equals(humanid)){
				HumanFile human =humanfileservice.findHumanFileByHumanId(humanid);
				model.addAttribute("human", human);
				return "forward:/page/humanResources/recovery_list_information.jsp";
		}else {
			return "shibai";
		}
		}
//		某个人资档案恢复
		@RequestMapping("humanFileRecovery.do")
		public String humanFileRecovery(@ModelAttribute HumanFile human) {
			human.setHumanFileStatus(HumanFileStatus.YES);
//			System.out.println(human.toString());
			Map<String,String> map = ProjectToMapUtil.toMap(human);
			humanfileservice.changeHumanFile(map);
			return "forward:/page/humanResources/success.jsp";
		}
		//关键字搜索
		@RequestMapping("recoverySearchPage.do")
		public String recoverySearchPage(){
			return "forward:/page/humanResources/recovery_keywords.jsp";
			
		}
		//关键字搜索的
		@RequestMapping("recoverySearch.do")
		public String recoverySearch(@RequestParam Map map,Model model){
			List<HumanFile> hlist=humanfileservice.recoverySearch(map);
			model.addAttribute("primarykey",map.get("primaryKey"));
			model.addAttribute("hlist", hlist);
			model.addAttribute("count",hlist.size());
			return "forward:/page/humanResources/recovery_list.jsp";
		}
		
		//永久删除 列表
		@RequestMapping("deleteForeverList.do")
		public String deleteForeverList(@RequestParam Map map,Model model){
			List<HumanFile> foreverlist=humanfileservice.findHumanFileByHumanStatus(HumanFileStatus.NO,CheckStatus.YES);
			model.addAttribute("foreverlist", foreverlist);
			model.addAttribute("count", foreverlist.size());
			return "forward:/page/humanResources/delete_forever_list.jsp";
		}
//	 点击删除
		@RequestMapping("deleteForever.do")
		@ResponseBody
		public String deleteForever(String humanid){
//			System.out.println(humanid);
			HumanFile humanfile=humanfileservice.findHumanFileByHumanId(humanid);
//			System.out.println(humanfile.getHufId());
			int i=humanfileservice.removeHumanFileById(humanfile.getHufId());
			if (i!=0) {
				JSONArray jsonarr = JSONArray.fromObject(i);
				return jsonarr.toString();
			}else {
				JSONArray jsonarr = JSONArray.fromObject(0);
				return jsonarr.toString();
			}
		}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//上传照片、附件
//	@RequestMapping("uploadPictureFile.do")
//	public String savePictureFile(HttpServletRequest request,MultipartFile picFile,MultipartFile accFile,@ModelAttribute HumanFile humanfile) throws Exception {
//		String humanpicture=picFile.getOriginalFilename();
//		BufferedOutputStream os = null;
//		if(humanpicture!=null && !humanpicture.equals("")){
//			// 上传
//			String filepath = request.getContextPath()+"/page/humanResources/img/" + humanpicture;
//			String dir = request.getSession().getServletContext().getRealPath("/page/humanResources/img/")+ humanpicture;
//			System.out.println(filepath);
//			File file = new File(dir);
//			if(!file.exists()){
//				file.createNewFile();
//			}
//			os = new BufferedOutputStream(new FileOutputStream(file));
//			os.write(picFile.getBytes());
//			os.flush();
//			humanfile.setHumanPicture(filepath);
//			System.out.println(humanfile.getHumanPicture());
//			
//		}
//		// 获取附件名称
//		String attachmentname=accFile.getOriginalFilename();
//		if(attachmentname!=null && !attachmentname.equals("")){
//			// 上传
//			String filepath1 = request.getContextPath()+"/page/humanResources/img/" + attachmentname;
//			String dir1 = request.getSession().getServletContext().getRealPath("/page/humanResources/img/")+ attachmentname;
//			System.out.println(filepath1);
//			File file = new File(dir1);
//			if(!file.exists()){
//				file.createNewFile();
//			}
//			os = new BufferedOutputStream(new FileOutputStream(file));
//			os.write(accFile.getBytes());
//			os.flush();
//		    humanfile.setAttachmentName(filepath1);
//		}
//		Map<String,String> map = ProjectToMapUtil.toMap(humanfile);
//		humanfileservice.changeHumanFile(map);
//		try {
//			if(os!=null){
//				os.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return "";
//	}	

}

