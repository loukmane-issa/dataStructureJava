package com.loukmane.datastructure.BinarySearchTree;

import java.util.ArrayList;
import java.util.Queue;

public class BinarySearchTree {

	Node root;
	int count;
	
	public BinarySearchTree() {
		count = 0;
	}

	public Node getRoot() {
		return root;
	}



	public void setRoot(Node root) {
		this.root = root;
	}



	public void insert(int value){
		count++;
		if(root == null)
			root = new Node(value);
		else
			insertNode(root, value);
	}
	
	public void insertNode(Node current, int value){
		if(value < current.getValue()){
			if(current.getLeft() == null){
				current.setLeft(new Node(value));
			}
			else
				insertNode(current.getLeft(), value);
		}
		else{
			if(current.getRight() == null){
				current.setRight(new Node(value));
			}
			else
				insertNode(current.getRight(), value);
		}
	}
	
	public Boolean Contains(Node n, int value){
		if(n == null)
			return false;
		else{
			if(n.getValue() == value)
				return true;
			else if (value < n.getValue()){
				System.out.println(n.getValue() + " -> Go left");
				return Contains(n.getLeft(), value);
			}
			else{
				System.out.println(n.getValue() + " -> Go right");
				return Contains(n.getRight(), value);
			}
		}
	}
	
	public Node FindParent(Node n, int value){
		if(root == null)
			return null;
		else{
			if(value == n.getValue()){
				return null;
			}
			else if(value < n.getValue()){
				if(n.getLeft() == null)
					return null;
				else if(n.getLeft().getValue() == value)
					return n;
				else
					return FindParent(n.getLeft(), value);
			}
			else {
				if(n.getRight() == null)
					return null;
				else if(n.getRight().getValue() == value)
					return n;
				else
					return FindParent(n.getRight(), value);
			}
		}
	}
	
	public Node FindNode(Node n, int value){
		if(n == null)
			return null;
		else{
			if(n.getValue() == value)
				return n;
			else if (value < n.getValue()){
				return FindNode(n.getLeft(), value);
			}
			else{
				return FindNode(n.getRight(), value);
			}
		}
	}
	
	public Boolean remove(int value){
		Node nodeToRemove = FindNode(root, value);
		//If cannot find the node to remove, return false
		if(nodeToRemove == null)
			return false;
		//The node to remove has been found
		else{
			//Find parent of node to remove
			Node parent = FindParent(root, value);
			
			//If the node has no parent (it's the root)
			if(count == 0)
				root = null;
			
			//If the node has a parent, but no childs
			else if (nodeToRemove.left == null && nodeToRemove.right == null){
				if(nodeToRemove.value < parent.value)
					parent.left = null;
				else
					parent.right = null;
			}
			//If the node has a parent, no child on the left, but childs on the right
			else if (nodeToRemove.left == null && nodeToRemove.right != null){
				//if the node to remove is on the left or on the right...
				if(nodeToRemove.value < parent.value)
					parent.left = nodeToRemove.right;
				else
					parent.right = nodeToRemove.right;
			}
			else if (nodeToRemove.left != null && nodeToRemove.right == null){
				//if the node to remove is on the left or on the right...
				if(nodeToRemove.value < parent.value)
					parent.left = nodeToRemove.left;
				else
					parent.right = nodeToRemove.left;
			}
			//If the node has a parent, and a child on the left and a child on the right
			else{
				//find largest value in left node tree
				Node largestValue = nodeToRemove.getLeft();
				while(largestValue.getRight()!=null){
					largestValue = largestValue.getRight();
				}
				FindParent(root, largestValue.getValue()).setRight(null);
				nodeToRemove.setValue(largestValue.value);
			}
			count--;
			return true;
		}
		
				
	}
	
	public int findMin(Node root) {
		if(count == 0)
			return -1;
		else {
			if(root.left == null)
				return root.value;
			else
				return findMin(root.left);
		}
	}
	
	public int findMax(Node root) {
		if(count == 0)
			return -1;
		else {
			if(root.right == null)
				return root.value;
			else
				return findMax(root.right);
		}
	}
	
	public void preOrder(Node n){
		if(n!=null){
			System.out.println(n.getValue());
			preOrder(n.getLeft());
			preOrder(n.getRight());
		}
	}
	
	
	public void postOrder(Node n){
		if(n!=null){
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.value);
		}
	}

	public void inOrder(Node n){
		if(n!=null){
			inOrder(n.left);
			System.out.println(n.value);
			inOrder(n.right);
		}
	}
	
/*	public void breadthFirst(Node n){
		ArrayList<Node> queue = new ArrayList<>();
		
		while(n != null){
			if(n.left != null){
				queue.add(n.left);
			}
			if(n.right != null){
				queue.add(n.right);
			}
			if(queue.isEmpty()){
				
			}
		}
		
		if(n != null){
			for (Node node : queue) {
				if(node.left != null){
					System.out.println(node.left.value);
				}
			}
		}
	}*/

	
	public class Node {
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}
	
}
