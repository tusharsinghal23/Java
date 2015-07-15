package com.Practice.arraypuzzle;
import static com.Practice.util.IntegerUtil.*;
import com.Practice.util.*;

public class MaxSumNonConsecutive {
	
	public static int getResult(int arr[]){
		int sum = 0;
		
		int inc = arr[0];
		int exc = 0;
		int temp = 0;
		
		for(int i = 1 ; i < arr.length ; i++){
			temp = getMax(inc, exc);
			inc = exc + arr[i];
			exc = temp;
		}
		return getMax(inc, exc);
	}
	
	public static void main(String args[]){
		
		// This can be replaced by System.in to get the Dynamic value
		int arr[] = {3,2,7,8,5,6};
		
		Logger log = Logger.getInstance(MaxSumNonConsecutive.class.getName());
		
		log.debug("Max sum = "+getResult(arr));
		
	}
}
