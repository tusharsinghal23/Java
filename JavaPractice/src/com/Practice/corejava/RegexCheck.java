package com.Practice.corejava;

public class RegexCheck {
	
	public static void doCheck(String str){

		System.out.println(str.matches("^[tT]his\\sis\\s[tT]est"));
	}

	public static void main(String args[]){
		RegexCheck.doCheck("this is Test");
	}
}
