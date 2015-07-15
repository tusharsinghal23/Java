package com.Practice.arraypuzzle;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
	
	public static int getElement(int arr[]){
		 
		ArraySort.getBubbleSort(arr);
		
		for( int  i = 0 ; i < arr.length/2 ; i++)
               if( arr[i] == arr[arr.length/2 + i] )
            	   return arr[i];
		
		return -1;
		
	}
	
	static int getOddOccurrence(int ar[])
	{
	     int i;
	     int res = 0; 
	     for (i=0; i < ar.length; i++){     
	        
	    	 res = res ^ ar[i];
	    	 System.out.println("Res aftre iternation = " +(i+1)+" "+res);
	   }
	      
	     return res;
	}
	
	
	
	public static void main(String args[]){
	    int arr[] = { 2,3,3,3,2,6,2};
	    System.out.println(5/2);
		System.out.println(getElement(arr));
		System.out.println(getOddOccurrence(arr));
	}

}
