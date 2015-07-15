package com.Practice.arraypuzzle;

import com.Practice.util.ArrayUtil;
import com.Practice.util.Logger;

public class ArraySlotFill {
	
	final static Logger log = Logger.getInstance(ArraySlotFill.class.getName());
	
	public static void fill(int arr[], int[] arr1) throws InterruptedException  {
		
		int len = (arr.length % 5 == 0) ? arr.length/5 : (arr.length/5)+1;
		int j = 0;
		
		for( int i = 0 ; i < len ; i++){
			if(i == len -1 ){
		    	   	 while( j < arr.length){
		    		 arr1[j] = arr[j];
		    	 	 j++;
		    	 }
		     }
		     else{
		    	 for(int k = 0 ; k < 5 ; k++){
		    		 arr1[j] = arr[j];
		    		 j++;
		    	 }
		    	 Thread.sleep(5000);
		     }
		}
		
	}
	
	public static void main(String args[]) throws InterruptedException{
		int arr[] = {2,4,5,6};
		int arr1[] = new int[arr.length];
		ArraySlotFill.fill(arr, arr1);
		ArrayUtil.showArray(arr1);
	}

}
