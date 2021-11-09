package com.example.springboot;

import org.apache.commons.lang3.StringUtils;


public class textUtils{
	public static String getText(){
		String [] array = new String[]{"we","used","stringUtils","library"};
		String result = StringUtils.concat(array);
		return result;
	}
}
