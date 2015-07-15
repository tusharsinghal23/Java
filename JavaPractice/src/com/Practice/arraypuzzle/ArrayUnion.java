package com.Practice.arraypuzzle;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import com.Practice.util.ArrayUtil;
import com.Practice.util.Logger;

public class ArrayUnion {
	
	private static Logger log = Logger.getInstance(ArrayUnion.class.getName());
	
	public static int[] getSortedArray(int[] arr, int[] arr1){
		
		List<Integer> temp = new ArrayList<Integer>();
		
        int j = 0, k = 0;
		
		ArraySort.getBubbleSort(arr1);
		ArraySort.getBubbleSort(arr);
		
		ArrayUtil.showArray(arr,"arr");
        ArrayUtil.showArray(arr1,"arr1");
        
		while( j < arr.length && k < arr1.length ){
			if( arr[j] > arr1[k]){
				temp.add(arr1[k]);
				log.debug(arr1[k]);
				k++;
				
			}
			else if(arr[j] < arr1[k]){
				temp.add(arr[j]);
				log.debug(arr[j]);
				j++;
			}
			else{
				temp.add(arr[j]);
				log.debug(arr[j]);
				j++;
				k++;
			}
		}
			
		if(arr.length > arr1.length)
			while( j < arr.length){
				temp.add(arr[j]);
				j++;
			}
		else if( arr.length < arr1.length)
			while(k < arr1.length){
				temp.add(arr1[k]);
				k++;
	        }
	
		return ArrayUtils.toPrimitive(temp.toArray(new Integer[temp.size()]));
		
    }
	
public static void main(String args[]){
		
		int arr[] = {3,2,5,2,7,8};
		int arr1[] = {2,2,4,5};
		
        ArrayUtil.showArray(getSortedArray(arr, arr1));
	}	
}
