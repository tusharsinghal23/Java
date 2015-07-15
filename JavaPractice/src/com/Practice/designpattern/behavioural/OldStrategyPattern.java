package com.Practice.designpattern.behavioural;

public class OldStrategyPattern {
	
	public static void main(String args[]){
		
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
	}

}

interface Duck {
	public void display();
	
}

interface Flyable{
	public void fly();
}

interface Quackable{
	public void quack();
}

class MallardDuck implements Duck, Flyable, Quackable {
	
	public void fly(){
		
		System.out.println("Flyable ");
	}

	public void quack(){
		
		System.out.println("Quackable ");
		
	}
	
	public void display(){
		
		System.out.println("I am Mallard Duck ");
		
	}
	
}