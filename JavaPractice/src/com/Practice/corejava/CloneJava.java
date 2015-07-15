package com.Practice.corejava;

import java.util.HashMap;
import java.util.Map;

public class CloneJava implements Cloneable {
	
		int i;
		String name;
		
		public int getI() {
			return i;
		}
		
		public void setI(int i) {
			this.i = i;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public Object clone() throws CloneNotSupportedException{
			   			   	return super.clone();
		 }
}

class CloneTest2
{
	public static void main(String args[]) throws CloneNotSupportedException{
		
		 CloneJava cloneJava = new CloneJava();
		 cloneJava.setName("Object 1");
		 CloneJava cloneJava2 = (CloneJava)cloneJava.clone();
		 System.out.println(cloneJava2.getName());
	}
}
