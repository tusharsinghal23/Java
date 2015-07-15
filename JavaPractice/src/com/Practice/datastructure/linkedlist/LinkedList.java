package com.Practice.datastructure.linkedlist;

/**
 * @author tushars5
 *
 *   size(Node node)
 *   printList()
 *   insertData(Node node, int data);
 *   reverseList(Node node)
 *   
 *   
 */
public class LinkedList {
	
	public static int size(Node node){
		if(node == null)
			return 0;
		return 1 + size(node.next);
		
	}
	
	public static void printList(Node node){
		
		if(node != null){
			System.out.print(node.data+" ");
			printList(node.next);
		}
	}
	
	public static Node insertData(Node node, int data){
		
		if(node == null)
			return new Node(data);
		else{
			Node temp = node;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
		return node;
	}
	
	public static void swapNode(Node a, Node b){
		Node temp = new Node(a.data);
		temp.next = a.next;
		
	}
	
	public static Node reverseList(Node node){
		Node temp;
		Node temp2;
		temp = node;
		node = node.next;
		temp.next = null;
		while(node.next != null){
			temp2 = node;
			node = node.next;
			temp2.next = temp;
			temp = temp2;
		}
		
		node.next = temp;
		return node;
	}
	
	
	
	public static void main(String args[]){
		Node node = new Node(200);
		node = insertData(node, 10);
		node = insertData(node, -1000);
		node = insertData(node, 100);
		node = insertData(node, 200);
		node = insertData(node, 300);
		//System.out.println(size(node));
		System.out.println("List is ");
		printList(node);
		node = reverseList(node);
		System.out.println("\nReverse list is ");
		printList(node);
	}

}

class Node{
	Node next;
	int data;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}