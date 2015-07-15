package com.Practice.designpattern.behavioural;

public class NewStrategyPattern {

	public static void main(String args[]){
		
		HPDuck tusharDuck = new HPDuck();
		tusharDuck.performfly();
		tusharDuck.performQuack();
		
		KPITDuck kpitDuck = new KPITDuck();
		kpitDuck.performfly();
		kpitDuck.performQuack();
		
	}
}

class KPITDuck extends MainDuck{
	
	KPITDuck(){
		
		flyBehaviour = new NoFly();
		quackBehaviour = new Sweak();
	
	}
		
	public void performQuack(){
		quackBehaviour.quack();
		
	}
	
	public void performfly(){
		flyBehaviour.fly();
	}
	
	public void display(){
		System.out.println("TusharDuck !!!");
	}
	
}

class HPDuck extends MainDuck{
	
	HPDuck(){
		
		flyBehaviour = new FlywithWings();
		quackBehaviour = new Quack();
	
	}
		
	public void performQuack(){
		quackBehaviour.quack();
		
	}
	
	public void performfly(){
		flyBehaviour.fly();
	}
	
	public void display(){
		System.out.println("TusharDuck !!!");
	}
	
}

abstract class MainDuck{
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	abstract public void display();
	abstract public void performQuack();
	abstract public void performfly();
	
}

interface FlyBehaviour {
		public void fly();
 }

interface QuackBehaviour {
	public void quack();
	
}

class FlywithWings implements FlyBehaviour{
	
	public void fly(){
		System.out.println("Fly");
	}
}

class NoFly implements FlyBehaviour{
	
	public void fly(){
		System.out.println("No Fly");
	}
}

class Quack implements QuackBehaviour{
	
	public void quack(){
		System.out.println("Quack");
	}
}

class Sweak implements QuackBehaviour{
	
	public void quack(){
		System.out.println("Sweak");
	}
}
