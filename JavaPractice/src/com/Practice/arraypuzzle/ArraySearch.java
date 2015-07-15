package com.Practice.arraypuzzle;

import java.util.Arrays;

import com.Practice.util.ArrayUtil;
import com.Practice.util.Logger;

public class ArraySearch {
	
	private static Logger log = Logger.getInstance(ArraySearch.class.getName());
	
	public static int getSimpleSearch(int arr[], int key){
		
		for( int  i = 0 ; i < arr.length ; i++ )
			if(arr[i] == key)
				return (i+1);
		return -1;
	}
	
	public static int getRecBinarySearch(int arr[], int key, int low, int high){
		
		int mid = (low + high)/2;
		
		if( arr[mid] < key ){
			return getRecBinarySearch(arr, key, mid, high);
		}
		else if(arr[mid] > key){
			return getRecBinarySearch(arr, key, low, mid);
		}
		else
			return mid;
		
	}
	
	public static int getItrBinarySearch(int arr[], int key){
		
		log.debug("Key = "+key);
		
		ArraySort.getBubbleSort(arr);
		
		int low = 0, high = arr.length, mid = 0; 
		
		while(low < high){
			
			mid =(low + high)/2;
			
			log.debug("Mid = "+mid);
			if(key > arr[mid])
				low = mid;
			else if(key < arr[mid])
				high = mid;
			else
				return mid;	
			
		}
	   	
		return -1;
	}
	
	public static void main(String args[]){
		
		int arr[] = {2,3,4,1};
		int arr2[] = {6,8,2,3,7};
		int key = 2;
		System.out.println(ArraySearch.getSimpleSearch(arr, key));
		//System.out.println((ArraySearch.getRecBinarySearch(arr2, key,0,arr2.length))+1);
		//int result = ArraySearch.getItrBinarySearch(arr, key);
		//System.out.println( result == -1 ? "Result not found ": "Key is at "+(result+1));
		
	}
}
