package com.Practice.corejava;

public class StaticOverload extends StaticParent{
	
	public static void main(String args[]){
		System.out.println(StaticParent.class.getName());
	}
	
	public static void show(){
		
		
		
	}

}

class StaticParent{
	public static void show(){
		System.out.println("We are in Parent show");
	}
}
