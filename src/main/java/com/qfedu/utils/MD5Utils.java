package com.qfedu.utils;

import org.springframework.util.DigestUtils;

public class MD5Utils {
	public static String getMd5(String oldStr){
		String str = DigestUtils.md5DigestAsHex(oldStr.getBytes());
		String childStr = str.substring(7,8);
		String salt = "xian";
		String newStr =str+childStr+salt;
		return DigestUtils.md5DigestAsHex(newStr.getBytes()) ;
	}
	
	
	public static void main(String[] args) {
		  String passMi = 	DigestUtils.md5DigestAsHex("12345z".getBytes());
		System.out.println(passMi);
		  System.out.println(passMi.length());
		 System.out.println(getMd5("admin")+"加密");
		 
	}

}
