package com.interview;

import java.util.Arrays;

public class Novell {
	
	public static boolean checkAnagramUsingSubString(String str1, String str2){
		
		if( str1.length() != str2.length() || str1.length() == 0 || str2.length() == 0) 
			return false;
		
		for( int  i = 0 ; i < str1.length() ; i++ ){
			
			Character ch = str1.charAt(i);
			
			if(str2.indexOf(ch) != -1){
				str2 = str2.substring(0, str2.indexOf(ch))+ str2.substring(str2.indexOf(ch)+1,str2.length());
			}else{
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkAnagramUsingSort(String str1, String str2){
		
		if( str1.length() != str2.length() || str1.length() == 0 || str2.length() == 0) 
			return false;
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for( int i = 0 ; i < ch1.length ; i++){
			if( ch1[i] != ch2[i])
				return false;
		}
		return true;
	}
	
	
	public static void permuteString(String beginningString, String endingString) {
	    if (endingString.length() <= 1)
	      System.out.println(beginningString + endingString);
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

	          permuteString(beginningString + endingString.charAt(i), newString);
	        } catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	  }
	
	
	public static void main(String args[]){
		
		System.out.println("Novell Interview Question :: ");
		System.out.println("Q1 : Find Anagram ?");
		
		String str1 = "mAAR";
		String str2 = "aAmR";
		//checkAnagramUsingSubString(str1, str2)
		if( checkAnagramUsingSort(str1, str2) )
			System.out.println("Ans : String is Anagram");
		else
			System.out.println("Ans : String is not Anagram");
		
		System.out.println("\nQ2 : Print combination of sequence ?");
		permuteString("", "ABC");
	}
}
