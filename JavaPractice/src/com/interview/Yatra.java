package com.interview;

import com.Practice.util.ArrayUtil;

public class Yatra {

	public void prob1(String str){
		
		int i = 1;
		int count = 1;
		char charch = 'a';
		
		if( str.length() > 0 ){
			charch = str.charAt(0);
		}
		
		while( i < str.length()){
		  
			char curch = str.charAt(i);
			
			if( charch == curch){
				count++;
			}else{
			      	System.out.print(charch+""+count);
					count = 1;
					charch = curch;

		   	}
			
			if((i+1) == str.length())
				System.out.println(charch+""+count);
			i++;
			
		}
		
		
		
	}
	
	public void prob2(int arr[]){
		
		int li  = 0 , hi = 0;
		if( arr.length != 0){
		
			li = 0;
			
			hi = arr.length - 1;
			
			while(li < hi){
				if(arr[li] == 0)
					li++;
				else{
					int temp = arr[li];
					arr[li] = arr[hi];
					arr[hi] = temp;
					hi--;
				}
			}
		}
	}
	
	public void prob3(String str){
		
		StringBuilder sb = new StringBuilder();
		int i = 1;
		char charch = 'a';
		
		if( str.length() > 0 ){
			charch = str.charAt(0);
			sb.append(charch);
		}
		
		while( i < str.length()){
		   
			char curch = str.charAt(i);
			if( charch != curch){
				sb.append(curch);
				charch = curch;
			}
			i++;
			
		}
		System.out.println("\nString is "+sb);
	}
	
	public void removeAdjacent(String str){
		
	}
	
	public static void main(String args[]){
		System.out.println("Interview Yatra :::: ");
		int arr[] = {1,0,0,1,1,1,0};
		new Yatra().prob1("aeebbbccaabbcc");
		new Yatra().prob2(arr);
		new Yatra().prob3("aeeb");
		ArrayUtil.showArray(arr);
	}
	
}
