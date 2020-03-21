package com.hr.util;

public class PrimaryKeyToDBfieldUtil {

	public static String ToDBfield(String str){
		char[] s = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : s) {
			if((int) c <= 90){
				sb.append("_");
				sb.append((char)(c+32));
			}else{
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
