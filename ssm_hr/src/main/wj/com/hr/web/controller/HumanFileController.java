package com.hr.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hr.pojo.ConfigPublicChar;
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.HumanFileService;
import com.hr.service.SalaryStandardService;

@Controller
public class HumanFileController {
	
	@Autowired
	private HumanFileService humanfileservice;//人档案
	@Autowired
	private ConfigFileFirstKindService firstKindservice;//一级机构
	@Autowired
	private ConfigFileSecondKindService secondservice;//二级机构
	@Autowired
	private ConfigFileThirdKindService thirdservice;//三级机构
//	@Autowired
//	private ConfigPublicCharService configpubliccharservice;//公共字段
	@Autowired
	private ConfigMajorKindService configmajorkindservice;//职位种类
	@Autowired
	private ConfigMajorService configmajorservice;//职称
	@Autowired
	private SalaryStandardService salarystandardservice;//薪资标准
	
	
	public String human_regist(Map map) {
//		List<ConfigPublicChar> clist=configpubliccharservice.queryzc();//职称
//		map.put("clist", clist);
//		List<ConfigPublicChar> hobby=configpubliccharservice.queryah();//爱好
//		map.put("hobby", hobby);
//		List<ConfigPublicChar> glist=configpubliccharservice.querygj();//国籍
//		map.put("glist", glist);
//		List<ConfigPublicChar> mlist=configpubliccharservice.querymz();//民族
//		map.put("mlist", mlist);
//		List<ConfigPublicChar> zlist=configpubliccharservice.queryzjxy();//宗教信仰
//		map.put("zlist", zlist);
//		List<ConfigPublicChar> zzlist=configpubliccharservice.queryzzmm();//政治面貌
//		map.put("zzlist", zzlist);
//		List<ConfigPublicChar> xlist=configpubliccharservice.queryxl();//学历
//		map.put("xlist", xlist);
//		List<ConfigPublicChar> jlist=configpubliccharservice.queryjynx();//教育年限
//		map.put("jlist", jlist);
//		List<ConfigPublicChar> xlzylist=configpubliccharservice.queryxlzy();//学历专业
//		map.put("xlzylist", xlzylist);
//		List<ConfigPublicChar> tlist=configpubliccharservice.querytc();//特长
//		map.put("tlist", tlist);
//		List<SalaryStandard> slist=configpubliccharservice.queryAll();//薪酬标准
//		map.put("slist", slist);
		return null;
		
	}
	
	
	
	
	

}
