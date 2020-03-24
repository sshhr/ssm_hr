package com.hr.util;

import java.util.Random;

public class RandomOfInt {
	
	public static int rand(int i){
		Random r = new Random();
		return r.nextInt(i);
	}
}
