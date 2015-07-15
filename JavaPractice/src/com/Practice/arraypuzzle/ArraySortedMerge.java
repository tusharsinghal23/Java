package com.Practice.arraypuzzle;

import com.Practice.util.ArrayUtil;
import com.Practice.util.Logger;

public class ArraySortedMerge {
	
	private final static Logger log = Logger.getInstance(ArraySortedMerge.class.getName(),false);
	
	public static int[] getArray(int[] arr, int[] arr1){
		
		if(!ArrayUtil.isArraySorted(arr))
			ArraySort.getBubbleSort(arr);
		
		
		if(!ArrayUtil.isArraySorted(arr1))
			ArraySort.getBubbleSort(arr1);
		
		int len = arr.length + arr1.length;
		int result[] = new int[len];
		int i = 0, j = 0, k = 0;
        
		while( j < arr.length && k < arr1.length){
			if(arr[j] < arr1[k]){
				result[i] = arr[j];
				log.debug(result[i]);
				j++; i++;
			}
			else if( arr[j] > arr1[k]){
				result[i] = arr1[k];
				log.debug(result[i]);
				k++; i++;
			}
			else{
					result[i] = arr[j];
					log.debug(result[i]);
					i++;
					result[i] = arr1[k];
					j++; k++; i++;
					
			}
		}
		
		if(arr.length > arr1.length){
			while( j < arr.length){
				result[i] = arr[j];
				i++; j++;
			}
		}
		else{
			while( k < arr1.length){
			result[i] = arr1[k];
			i++; k++;
		}
		}
								
		return result;			
	}
	
	public static void main(String args[]){
		int arr[] = { 2,3,4,8,9};
		int arr1[] = {4,6,7};
		ArrayUtil.showArray(getArray(arr, arr1));
	}

}
