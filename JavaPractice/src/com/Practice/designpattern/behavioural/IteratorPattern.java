package com.Practice.designpattern.behavioural;

import java.util.ArrayList;
import java.util.List;

interface Container<T>{
	public Iterator getIterator();
	public void add(T o);
}

interface Iterator<T>{
	public boolean hasNext();
	public T next();
}

class ListContainer<T> implements Container<T>{
	
	List<T> lt = new ArrayList<T>();
	public Iterator getIterator(){
		return new ListIterator<T>(this.lt);
	}
	
	public void add(T o){
		lt.add(o);
	}
}

class ListIterator<T> implements Iterator<T>{
	
	private List<T> lt;
	private static int count;
	
	public ListIterator(List<T> lt) {
		this.lt = lt;
		count = 0;
	}
	
	public boolean hasNext(){
		return lt.size() - 1 >= count ? true : false;
	}
	
	public T next(){
		T str = lt.get(count);
		count++;
		return str;
	}
}

public class IteratorPattern {
	
	public String toString(){
		return ""+hashCode();
	}
	
	public static void main(String args[]){
		Container<Boolean> c = new ListContainer<Boolean>();
		c.add(true);
		c.add(false);
		
		Iterator it = c.getIterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
