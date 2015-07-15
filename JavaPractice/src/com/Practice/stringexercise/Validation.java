package com.Practice.stringexercise;

public class Validation {

	public static boolean getEmailvalidator(String emailString){
		final String REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"; 
	    
		return emailString.matches(REGEX);
	}
	
	public static boolean getIpvalidator(String ipString){
		final String IP_REGEX = "([01]?[0-9]?[0-9]?\\.|2[0-5]?[0-5]?\\.){3}([01]?[0-9]?[0-9]?|2[0-5]?[0-5]?)"; 
	    
		return ipString.matches(IP_REGEX);
	}
	
	public static void main(String args[]){
		System.out.println(Validation.getEmailvalidator("tushar@gmail.com"));
		System.out.println(Validation.getEmailvalidator("tushargmail.com"));
		System.out.println(Validation.getEmailvalidator("%%tusha@a.com"));
		System.out.println(Validation.getIpvalidator("1.1.1.1"));
		System.out.println(Validation.getIpvalidator("255.255.255.255"));
		System.out.println(Validation.getIpvalidator("10.10.1.1"));
		System.out.println(Validation.getIpvalidator("132.254.111.10"));
		System.out.println(Validation.getIpvalidator("222.299.299.299"));
		System.out.println(Validation.getIpvalidator("25.25.25.25"));
	}
}
