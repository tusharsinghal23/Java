package com.Practice.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import com.Practice.util.IntegerUtil;

public class StringUtil {
	
	final private static Logger log = Logger.getInstance(StringUtil.class.getName());
	private static int itrCounter = 0;
	
	public static void reverseStr(String str){
		
		int len = str.length();
		char arr[] = new char[len];
				
		for( int i = 0 ; i < len ; i++)
			arr[i] = str.charAt(i);	
			
		for( int i = 0 ; i < len/2 ; i++){
			char temp = arr[i];
			arr[i] = arr[len - i -1];
			arr[len - i -1] = temp;
		}
		
		for( int i = 0 ; i < len ; i++)
			System.out.print(arr[i]);	
	}
	
	public static void reverseSen(String str){
		
	}
	
	public static int getStringRank(String str){
		
		str = str.toUpperCase();
		
		if(str.length() == 0)
			return 0;
		
		int count = 0;
		
		log.debug("Comparing Charater");
		
		for( int i = 1 ; i < str.length() ; i++ ){
			if(str.charAt(0) > str.charAt(i)){
				log.debug(str.charAt(i));
				count++;
			}
		}
		
		if(itrCounter++ == 0)
			return (count * IntegerUtil.fact(str.length()-1)) + getStringRank(str.substring(1))+1;
		else
			return (count * IntegerUtil.fact(str.length()-1)) + getStringRank(str.substring(1));
		
	}
	
	public static String reverseString(String str){
		String newStr[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for( int i = newStr.length-1 ; i >= 0 ; i--){
			sb.append(newStr[i]);
			if(i != 0)
				sb.append(" ");
		}
		
		return sb.toString();
	}

	public boolean checkPalindrome(String str){
		
		boolean flag = true;
		int len = str.length();
				
		for( int  i = 0 ; i < len/2 ; i++)
		if(str.charAt(i) != str.charAt(len-i-1)){
			flag = false;
		     break;
		}
		
		return flag;
	}
	
	public String removeChar(String str, char ch){
		return str.replaceAll(Character.toString(ch), "");
	}
	
	public String[] splitString(String str, String delimiter){
		
		return str.split(delimiter);
	}
	
	public String[] splitTokenizer(String str, String delimiter ){
		
		StringTokenizer stringTokenizer = new StringTokenizer(str,delimiter);
		String temp[] = new String[stringTokenizer.countTokens()];
		int i = 0 ;
		
		while(stringTokenizer.hasMoreTokens()){
			temp[i] = stringTokenizer.nextToken();
			i++;
		}
		
		return temp;
	}
	
	
	public static void main(String args[]){
		
		reverseStr("Microsoft Azure is one of the best Cloud solutions");
		// Code to test the String Split
		/*String str = "Tushar Singhal Awesome";
		String temp[];
		String delimiter = " ";
		temp = new StringUtil().splitString(str, delimiter);
		System.out.println("Length of the String : "+temp.length);
		
		// Code to test the String Tokenizer
		temp = new StringUtil().splitTokenizer(str, delimiter);
		System.out.println("Length of the String : "+temp.length);
		
		// Code to test the converson of String to Array of Character
		char ch[] = "Tushar".toCharArray();
		System.out.println(ch[3]);
		
		// Code to test the Palindrome in String
		System.out.println(new StringUtil().checkPalindrome("TuT"));
		
		// Code to test the removal of char in the String
		System.out.println(new StringUtil().removeChar("TuTusharT", 'T'));
		
		log.switchOn();
		System.out.println(getStringRank("SAT"));
		
		String str2= "Hello How Are You !!!";
		System.out.println(str2);
		System.out.println(reverseString(str2));*/
		
	}
}
