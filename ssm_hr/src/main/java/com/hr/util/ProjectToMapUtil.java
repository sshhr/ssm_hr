package com.hr.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.hr.pojo.EngageMajorRelease;

public class ProjectToMapUtil {

//	public static void main(String[] args) {
//		EngageMajorRelease emr = new EngageMajorRelease();
//		emr.setHumanAmount(20);
//		Map map = toMap(emr);
//		System.out.println(map.size());
//	}
	
	public static Map toMap(Object obj){
		Map map = new HashMap<String, String>();
		Class cla = obj.getClass();
		Field[] fies = cla.getDeclaredFields();
		boolean flag = true;
		for (Field field : fies) {
			if(flag){
				flag=false;
				continue;
			}
			field.setAccessible(true);
			try {
				if(field.get(obj)!=null){
					map.put(field.getName(), field.get(obj));
//					System.out.println(field.getName()+"---"+field.get(obj));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}

}
