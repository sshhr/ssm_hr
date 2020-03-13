package com.hr.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hr.mapper.BonusMapper;
import com.hr.pojo.Bonus;
import com.hr.pojo.ConfigFileFirstKind;
import com.hr.pojo.ConfigFileSecondKind;
import com.hr.pojo.ConfigFileThirdKind;
import com.hr.pojo.ConfigMajor;
import com.hr.service.BonusService;
import com.hr.service.ConfigFileFirstKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileThirdKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.impl.BonusServiceImpl;
import com.hr.service.impl.ConfigFileFirstKindServiceImpl;


public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
//		BonusService impl = (BonusService) context.getBean("bonusServiceImpl");
////		List<Bonus> list = impl.findBonusAll();
//		
////		List<Integer> ll = new ArrayList<>();
////		ll.add(1);
////		List<Bonus> list = impl.findBonusByIds(ll);
////		for (Bonus Bonus : list) {
////			System.out.println(Bonus.getMajorId());
////		}
////		
//		
////		impl.removeBonusById("1");
//		
//		Bonus b = new Bonus();
//		b.setHumanName("sjh");
//		impl.saveBonus(b);
		
		
//		ConfigFileFirstKindService impl = (ConfigFileFirstKindService) context.getBean("configFileFirstKindServiceImpl");
//		
//		List<ConfigFileFirstKind> list = impl.findConfigFileFirstKindAll();
//		
//		for (ConfigFileFirstKind Bonus : list) {
//			System.out.println(Bonus.getFirstKindName());
//		}
		
//		ConfigFileSecondKindService impl = (ConfigFileSecondKindService) context.getBean("configFileSecondKindServiceImpl");
//		
//		List<ConfigFileSecondKind> list = impl.findConfigFileSecondKindAll();
//		
//		for (ConfigFileSecondKind Bonus : list) {
//			System.out.println(Bonus.getSecondKindName());
//		}
	
		
//		ConfigFileThirdKindService impl = (ConfigFileThirdKindService) context.getBean("configFileThirdKindServiceImpl");
//		
//		List<ConfigFileThirdKind> list = impl.findConfigFileThirdKindAll();
//		
//		for (ConfigFileThirdKind Bonus : list) {
//			System.out.println(Bonus.getThirdKindName());
//		}
		
		ConfigMajorService impl = (ConfigMajorService) context.getBean("configMajorServiceImpl");
		
		List<ConfigMajor> list = impl.findConfigMajorAll();
		
		for (ConfigMajor Bonus : list) {
			System.out.println(Bonus.getMajorName());
		}
	}
}	
