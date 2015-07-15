package com.Practice.arraypuzzle;

import static com.Practice.util.ArrayUtil.searchArray;

import com.Practice.util.*;

import java.util.*;

import org.apache.commons.lang.ArrayUtils;

import com.Practice.algorithm.*;
import com.Practice.util.ArrayUtil;

public class ArrayIntersection {
	
	private static Logger log = Logger.getInstance(ArrayIntersection.class.getName());
	

	public static int[] getSortedArray(int[] arr, int[] arr1){
		
		List<Integer> temp = new ArrayList<Integer>();
	
		/*int[] temp = new int[arr.length > arr1.length ? arr1.length : arr.length];*/
		int j = 0, k = 0, i = 0;
		
		ArraySort.getBubbleSort(arr1);
		ArraySort.getBubbleSort(arr);
		ArrayUtil.showArray(arr,"arr");
        ArrayUtil.showArray(arr1,"arr1");
        
		while( j < arr.length && k < arr1.length ){
			if( arr[j] > arr1[k])
				k++;
			else if(arr[j] < arr1[k])
				j++;
			else{
				temp.add(arr[j]);
				log.debug(arr[j]);
				j++;
				k++;
				i++;
			}
			
			
		}
		return ArrayUtils.toPrimitive(temp.toArray(new Integer[temp.size()]));
		
	}
	
	public static int[] getArray(int[] arr, int[] arr1){
			
		List<Integer> temp = new ArrayList<Integer>();
		
		for( int i = 0 ; i < arr.length ; i++){
			
			if(searchArray(arr1, arr[i]) == true)
				temp.add(arr[i]); 
			}
		
		    return ArrayUtils.toPrimitive(temp.toArray(new Integer[temp.size()]));
		 
	}
	
	public static void main(String args[]){
		
		int arr[] = {3,2,5,2,7,8};
		int arr1[] = {2,2,4,5};
		int cache[] = getArray(arr, arr1);
		ArrayUtil.showArray(cache);
        ArrayUtil.showArray(getSortedArray(arr, arr1));
		
		
	}
	
}
