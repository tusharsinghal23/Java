package com.Practice.datastructure.tree;

import javax.swing.text.Position.Bias;

import com.Practice.util.Logger;

public class BinaryTree {
	
	private int value;
	private BinaryTree left = null;
	private BinaryTree right = null;
	private final static Logger log = Logger.getInstance(BinaryTree.class.getName()); 
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	public boolean hasLeft(){
		if(this.getLeft() != null)
			return true;
		else
			return false;
	}
	
	public boolean hasRight(){
		if(this.getRight() != null)
			return true;
		else
			return false;
	}
	
	
	
	public BinaryTree facadeSet(int value, BinaryTree left, BinaryTree right){
		this.setLeft(left);
		this.setValue(value);
		this.setRight(right);
		return this;
	}
	
	public static void facadePrintPreorder(BinaryTree binaryTree){
			log.switchOn();
			log.switchLogTextOff();
			log.debug("Preorder is ");
			log.debug(printTreePreorder(binaryTree));
			log.switchLogTextOn();
			log.switchOff();
}
	
	public static void facadePrintInorder(BinaryTree binaryTree){
			log.switchOn();
			log.switchLogTextOff();
			log.debug("Inorder is ");
			//log.switchLogTextOn();
			printTreeInorder(binaryTree);
			log.switchOff();
	}
	
	public int lowestCommonAncestor(int value1, int value2){
		log.debug(value1+" "+ value2 +" "+this.getValue());
		
		if(this == null){
			return -1;
		}
		else if(this.getValue() > value1 && this.getValue() > value2 && this.getLeft() != null){
			log.debug("Left="+this.getLeft().getValue());
			return this.getLeft().lowestCommonAncestor(value1, value2);
		}
		else if(this.getValue() < value1 && this.getValue() < value2 && this.getRight() != null){
			log.debug("Right "+this.getRight().getValue());
			return this.getRight().lowestCommonAncestor(value1, value2);
		}
		
		
		return this.getValue();
	}
	
	public static void facadePrintPostorder(BinaryTree binaryTree){
			log.switchOn();
			log.switchLogTextOff();
			log.debug("Post order is ");
			log.switchLogTextOn();
			printTreePostorder(binaryTree);
			log.switchOff();
    }
	
	public static int sizeofTree(BinaryTree binaryTree){
		if(binaryTree != null){
			return 1 + sizeofTree(binaryTree.getLeft()) + sizeofTree(binaryTree.getRight()); 
		}
		else
			return 0;
	}
	
	
	public int localSizeofTree(){
		int size;
		if(this != null){
			size = 1;
			if(this.getLeft() !=null)
				size = size + this.getLeft().localSizeofTree();
			
			if(this.getRight() != null)
			    size = size + this.getRight().localSizeofTree();
		}
		else
			size = 0;
		return size;
	}
	
	
	public int heightTree(){
		int height = 0;
		int l_height = 0;
		int r_height = 0;
		
		if(this == null)
			return 0;
		
		if(this.getLeft() != null)
			l_height = 1 + this.getLeft().heightTree();	
		
		if(this.getRight() != null)
			r_height = 1 + this.getRight().heightTree();
		
		return (l_height >= r_height ? l_height : r_height);
	}
	
	public static BinaryTree deleteTree(BinaryTree binaryTree){
		log.switchLogTextOn();
		if(binaryTree.getLeft() != null){
			log.debug(binaryTree.getLeft().getValue());
			binaryTree.setLeft(deleteTree(binaryTree.getLeft()));
		}
			
	     if(binaryTree.getRight() != null){
	    	 log.debug(binaryTree.getRight().getValue());
			binaryTree.setRight(deleteTree(binaryTree.getRight()));
	     }
	     
	     log.debug("Removing Node having value : "+binaryTree.getValue());
		return null;
		
	}

	public BinaryTree mirrorTree(){
		 
			 BinaryTree binaryTree = nodeCreate(this.getValue());
			 log.debug("Value inserted : "+this.getValue());
		 
		 
		 if(this.getLeft() != null ){
			 log.debug("Value inserted : "+this.getLeft().getValue());
			 binaryTree.setRight(this.getLeft().mirrorTree());
		 }
		 
		 if(this.getRight() != null){
			 log.debug("Value inserted : "+this.getRight().getValue());
			 binaryTree.setLeft(this.getRight().mirrorTree());
		 }
		 
		 return binaryTree;
		 
	}
	
	public void swapToMirror(){
		
		if(this != null){
			BinaryTree temp = this.getLeft();
			this.setLeft(this.getRight());
			this.setRight(temp);
		}
		
		if(this.getLeft() != null){
			this.getLeft().swapToMirror();
		}
		
		if(this.getRight() != null){
			this.getRight().swapToMirror();
		}
		
		
		
	}
		
	public boolean isTreeIdentical(BinaryTree binaryTree){
		
		boolean flag;
		
		if(this.getValue() == binaryTree.getValue() && this.hasLeft()== binaryTree.hasLeft() && this.hasRight() == binaryTree.hasRight()){
			flag = true;
			if(this.getLeft() != null ){
				flag = flag && this.getLeft().isTreeIdentical(binaryTree.getLeft());
			}
			
			if(this.getRight() != null){
				flag = flag && this.getRight().isTreeIdentical(binaryTree.getRight());
			}
			return flag;
		}
		else
		return false;
	}
	
	public static BinaryTree nodeCreate(int value){
			return new BinaryTree().facadeSet(value, null, null);
	}
	
	public static BinaryTree insertNode(BinaryTree binaryTree,int value){
		
		log.debug("Value is "+value);
		if(binaryTree == null){
			log.debug("New Node created");
			binaryTree = nodeCreate(value);
		}
		else{
		    	  if( binaryTree.getValue() > value ){
		    		    log.debug("Value is less than Node");
		    		    if(binaryTree.getLeft() == null)
		    		    	binaryTree.setLeft(insertNode(binaryTree.getLeft(), value));
		    		    else
		    		    	insertNode(binaryTree.getLeft(), value);
				  }
				  else if( binaryTree.getValue() < value ){
					  log.debug("Value is Greater than Node");
		    		    if(binaryTree.getRight() == null)
		    		    	binaryTree.setRight(insertNode(binaryTree.getRight(), value));
		    		    else
		    		    	insertNode(binaryTree.getRight(), value);
				  }					  
			  }
		return binaryTree;
	}
	
	public static String printTreePreorder(BinaryTree binaryTree){
			
		StringBuilder sb = new StringBuilder();
			
		try{				
				if(binaryTree.getLeft() != null){
					sb.append(printTreePreorder(binaryTree.getLeft()));
					sb.append(" ");
				}			
				if(binaryTree != null){
					sb.append(binaryTree.getValue());
					sb.append(" ");
				}
								
				if(binaryTree.getRight() != null){
					sb.append(printTreePreorder(binaryTree.getRight()));
					sb.append(" ");
				}
				
			}
			catch(NullPointerException ex){
				log.debug("Tree Inorder giving error");
			}
			finally{
				return sb.toString();
			}
			
			//return sb.toString();
		}
	
	public static String printTreeInorder(BinaryTree binaryTree){
		
		StringBuilder sb = new StringBuilder();
		
		try{
			if(binaryTree != null){
				sb.append(binaryTree.getValue());
				sb.append(" ");
			}
			
			
			if(binaryTree.getLeft() != null){
				sb.append(printTreeInorder(binaryTree.getLeft()));
				sb.append(" ");
			}
			
			
			if(binaryTree.getRight() != null){
				sb.append(printTreeInorder(binaryTree.getRight()));
				sb.append(" ");
			}
		}
		catch(NullPointerException ex){
			log.debug("Tree Inorder giving error");
		}
		finally{
			return sb.toString();
		}
	}
	
	public static String printTreePostorder(BinaryTree binaryTree){
			
		StringBuilder sb = new StringBuilder();
		
			try{
				
				if(binaryTree.getRight() != null){
					sb.append(printTreePostorder(binaryTree.getRight()));
					sb.append(" ");
					
				}
				
				if(binaryTree.getLeft() != null){
					sb.append(printTreePostorder(binaryTree.getLeft()));
					sb.append(" ");
				}	
				
				if(binaryTree != null){
					sb.append(binaryTree.getValue());
					sb.append(" ");
				}
		    }
			catch(NullPointerException ex){
				log.debug("Tree Inorder giving error");
				
			}
			finally{
				return sb.toString();
			}
		}
		
	public static void main(String args[]){
		
		BinaryTree binaryTree = null;
		BinaryTree binaryTree2 = null;
		log.switchOff();
		binaryTree = BinaryTree.insertNode(binaryTree, 100);
		binaryTree = BinaryTree.insertNode(binaryTree, 98);
		binaryTree = BinaryTree.insertNode(binaryTree, 102);
		binaryTree = BinaryTree.insertNode(binaryTree, 10);
		binaryTree = BinaryTree.insertNode(binaryTree, 15);
		binaryTree = BinaryTree.insertNode(binaryTree, 113);
		binaryTree = BinaryTree.insertNode(binaryTree, 200);
		binaryTree = BinaryTree.insertNode(binaryTree, 1);
		binaryTree = BinaryTree.insertNode(binaryTree, 1000);
		
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 100);
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 98);
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 102);
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 10);
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 110);
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 120);
		binaryTree2 = BinaryTree.insertNode(binaryTree2, 130);
		
		facadePrintInorder(binaryTree);
		System.out.println();
		facadePrintPreorder(binaryTree);
		System.out.println();
		facadePrintPostorder(binaryTree);
		System.out.println("Tree Pre order "+ printTreePreorder(binaryTree));
		
		facadePrintInorder(binaryTree2);
		
		log.switchOn();
		log.switchLogTextOff();
		System.out.println();
		log.debug("size of the Tree : " + sizeofTree(binaryTree));
		System.out.println();
		log.debug("Is tree identical  : " + binaryTree.isTreeIdentical(binaryTree2));
		System.out.println();
		log.debug("Size of local tree : "+binaryTree.localSizeofTree()+", Size of static Tree = "+sizeofTree(binaryTree));
		log.debug("Size of local tree : "+binaryTree2.localSizeofTree()+", Size of static Tree = "+sizeofTree(binaryTree2));
		System.out.println();
		log.debug("Height of Tree : "+binaryTree2.heightTree());
		System.out.println();
		log.debug("Remov11ing Tree...");
		System.out.println();
		
		/* binaryTree = deleteTree(binaryTree); */
		if(binaryTree == null)
			log.debug("Tree deleted");
		
		BinaryTree binaryTree3 = binaryTree2.mirrorTree();
		log.debug("Inorder Tree 3: "+printTreePreorder(binaryTree3)+" Inorder Tree 2: "+printTreePreorder(binaryTree2));
		
		binaryTree2.swapToMirror();
		log.debug("Inorder Tree 2: "+printTreePreorder(binaryTree2));
		
		binaryTree2.swapToMirror();
		
		System.out.println("Value of the log = "+binaryTree2.lowestCommonAncestor(110, 130));
		
	}
}
