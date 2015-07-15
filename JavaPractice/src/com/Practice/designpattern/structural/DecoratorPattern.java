package com.Practice.designpattern.structural;

public class DecoratorPattern {
	
	public static void main(String args[]){
		
		Beverage beverage = new ButterMilk();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.cost());
		System.out.println(beverage.description());
		
	}

}

interface Beverage{
	public String description();
	public double cost();
}

abstract class BeverageDecorator implements Beverage{

}

class Whip extends BeverageDecorator{
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		
		this.beverage = beverage;		
	}
	
	public String description(){
		return  beverage.description()+" Whip";
	}
	
	public double cost(){
		
		return beverage.cost() * 11;
	}
	
}

class Mocha extends BeverageDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		
		this.beverage = beverage;		
	}
	
	public String description(){
		return  beverage.description()+" Mocha";
	}
	
	public double cost(){
		
		return beverage.cost() * 10;
	}
	
}

class ButterMilk implements Beverage{
	
	public String description(){
		
		return "ButterMilk";
		
	}
	
	public double cost(){
		return 14.00;
	}
}

 