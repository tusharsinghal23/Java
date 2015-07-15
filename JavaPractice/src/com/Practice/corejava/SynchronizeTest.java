package com.Practice.corejava;

public class SynchronizeTest extends Thread {
	
	public void run(){
		System.out.println("Print Message");
		
		try{
		Thread.sleep(5000);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("hello"+Thread.currentThread().getName());
		synchronized(this){
		notify();
		}
			
	}
	
	public static void main(String args[]){
		
		SynchronizeTest a = new SynchronizeTest();
		SynchronizeTest b = new SynchronizeTest();
		
		a.start();
		b.start();
		
		
		synchronized (a) {
			try{
			a.wait();
			}
			catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("Wait is over");
			
	}
		
		
	}

}
