package com.Practice.arraypuzzle;

import java.util.HashMap;
import java.util.Map;

import com.Practice.util.ArrayUtil;

public class PairGivenIntegerX {
	
	public static Map<Integer,Integer> getNumHighComp(int arr[], int sum){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int nsum;
		
		for( int i = 0 ; i < arr.length ; i++){
			for( int j = i+1 ; j < arr.length ; j++ ){
				nsum = arr[i] + arr[j];
				if( nsum == sum)
					map.put(arr[i], arr[j]);
			}
		}
		
		return map;
	}
	
	
	public static Map<Integer,Integer> getNumSorted(int arr[], int sum){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArraySort.getBubbleSort(arr);
		ArrayUtil.showArray(arr);
		int init, end, nsum, nend;
		
		init = 0 ;
		end= arr.length-1;
		
		while( init < end){
			nsum = arr[init] + arr[end]; 
			if( nsum == sum ){
				map.put(arr[init], arr[end]);
				init++;
				end--;
			}
			else if( nsum < sum){
			   	init++;
			}
		     else
				end--;
		}
		
		return map;
		
	}
	
	
	public static void main(String args[]){
		
		int arr[] = {1,10,5,6};
		//Map<Integer, Integer> map = PairGivenIntegerX.getNumHighComp(arr, 11);
		Map<Integer, Integer> map = PairGivenIntegerX.getNumSorted(arr, 11);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
