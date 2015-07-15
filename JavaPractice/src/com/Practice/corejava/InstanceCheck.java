package com.Practice.corejava;

public class InstanceCheck {
	
	public static void main(String args[]){
		
		Animal animal = new Dog();
		
		Animal animal2 = new Animal();
		
		if( animal instanceof Dog)
			System.out.println("It's a Dog");
		
		if( animal2 instanceof Animal)
			System.out.println("It's a Dog");
		
	}

}

class Animal{
	
}

class Dog extends Animal{
	
}
