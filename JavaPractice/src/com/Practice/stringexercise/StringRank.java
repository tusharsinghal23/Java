package com.Practice.stringexercise;

import java.util.Arrays;

public class StringRank {
	
	public static int findRank(String str){
		
		
		if( str.length() == 1)
			return 1;
		
		char ch = str.charAt(0);
        int num = 1;
        int i = 0;
		
		char ch1[] = str.toCharArray();
 		
		Arrays.sort(ch1);
		
		for(  i = 0 ; i < ch1.length ; i++)
			if( ch1[i] == ch)
				break;
		
		int len = str.length() - 1;
		while( len > 0 ){
			num = num * len;
			len--;
		}
		
		return (num * i) + findRank(str.substring(1));
					
		}
	
	public static void main(String args[]){
		System.out.println("Rank is "+(findRank("STRING")));
	}

}
