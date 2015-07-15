package com.Practice.arraypuzzle;

import com.Practice.util.ArrayUtil;

public class DutchNational {
	
	public static void threeNumberSort( int arr[]){
		
		int li = 0 , mi = 0 , hi = arr.length - 1;
		
		while( mi < hi){
			if( arr[mi] == 0){
				
				int temp = arr[li];
				arr[li] = arr[mi];
				arr[mi] = temp;
				li++;
				mi++;				
			}
			else if( arr[mi] == 1){
				mi++;
			}
			else{
				int temp = arr[mi];
				arr[mi] = arr[hi];
				arr[hi] = temp;
				hi--;
				
			}
		}
	}
	
	public static void twoNumberSort( int arr[]){
		int li = 0, hi = arr.length - 1;
		
		while(li < hi){
			
			if(arr[li] == 0){
				li++;
			}
			else{
				int temp = arr[li];
				arr[li] = arr[hi];
				arr[hi] = temp;
				hi--;
			}
				
			
			
		}
	}
	
	public static void main(String args[]){
		
		int arr[] = {0,1,1,0,0,2,2,0};
		threeNumberSort(arr);
		ArrayUtil.showArray(arr);
		int arr2[] = {0,1,1,0,0};
		twoNumberSort(arr2);
		ArrayUtil.showArray(arr2);
	}

}
