package com.Practice.stringexercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.Practice.util.Logger;

public class printStingRepeat {
	
	private static final Logger log = Logger.getInstance(printStingRepeat.class.getName());
	
	public static void printString(List<String> list){
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for( int i = 0 ; i < list.size() ; i++){
			int count = 0;
			log.debug(list.get(i));
		 if(!map.containsKey(list.get(i))){
			 for( int j = i ; j < list.size() ; j++){
				 if(list.get(i).equals(list.get(j)))
				 count++;
				 log.debug(count);
			 }
			 map.put(list.get(i), count);
		}
     }
		
		for(Map.Entry entry : map.entrySet())
		System.out.println(entry.getKey()+ " " + entry.getValue());
		
}
	
	public static void main(String args[]){
		
		String str = "str4 str1 str2 str4 str1 str1 str2 str3 str1";
		List<String> list = new ArrayList<String>();
		String arr[] = str.split(" ");
		
		for( int i = 0 ; i < arr.length ; i++)
			list.add(arr[i]);
		
		printString(list);
	
		
	}

}
