package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Jonex {
	
	public static void printRepeat(String str){
		String arr[] = str.split(" ");
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		
		for( int i = 0 ; i < arr.length ; i++){
			if( !map.containsKey(arr[i]))
				map.put(arr[i],1);
			else
				map.put(arr[i], map.get(arr[i])+1);
				
		}
		
		for( Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+entry.getValue());
		}
		
	}
	
	public static void main(String args[]){
		String str = "str1 str2 str3 str1 str2 str4";
		printRepeat(str);
	}

}
