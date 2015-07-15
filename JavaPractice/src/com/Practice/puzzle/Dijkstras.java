package com.Practice.puzzle;

import java.io.IOException;
import java.util.Stack;

import javax.swing.undo.CannotUndoException;

public class Dijkstras {
	
	public static void test(){
		
	}
	
	public static void main(String args[]){
		
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		double v = 0;
		
		for( int i = 0 ; i < args.length ; i++){
			System.out.print(args[i]);
		}
		
          for( int i = 0 ; i < args.length ; i++){
        	  if (args[i].equals("(")) ;
        	  else if (args[i].equals("+")) ops.push(args[i]);
        	  else if (args[i].equals("-")) ops.push(args[i]);
        	  else if (args[i].equals("@")) ops.push(args[i]);
        	  else if (args[i].equals("/")) ops.push(args[i]);
        	  else if (args[i].equals("sqrt")) ops.push(args[i]);
        	  else if (args[i].equals(")")){
        		  String op = ops.pop();
        		  v = vals.pop();
        		  if(op.equals("+")) v = vals.pop() + v;
        		  if(op.equals("@")) v = vals.pop() * v;
        		  if(op.equals("-")) v = vals.pop() - v;
        		  if(op.equals("/")) v = vals.pop() / v;
        		  if(op.equals("sqrt")) v = Math.sqrt(v);
        		  vals.push(v);
        	  }
        	  else vals.push(Double.parseDouble(args[i]));
          }
			
		System.out.println("\nValue of the Expression="+v);
	
	}
}


