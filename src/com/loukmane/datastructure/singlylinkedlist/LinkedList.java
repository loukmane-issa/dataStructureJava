package com.loukmane.datastructure.singlylinkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList(Node head, Node queue) {
		this.head = head;
		this.tail = queue;
	}
	
	public void add(int value){
		Node n = new Node(value, null);
		if(this.head == null){
			this.head = n;
			this.tail = n;
		}
		else{
			this.tail.setNext(n);
			this.tail = n;
		}
	}
	
	
	public Boolean contains(int value){
		Node n = head;
		while(n != null && n.getValue() != value){
			n = n.getNext();
		}
		if(n==null) {
			return false;
		}
		return true;
	}
	
	public Boolean deleteOne(int value){
		
		Node n = head;
		
		if(head == null)
			return false;
		
		if(n.getValue() == value){
			if(head == tail){
				head = null;
				tail = null;
			}
			else
				head = n.getNext();	
			return true;
		}
		
		while(n != null && n.getNext().getValue() != value){
			n = n.getNext();
		}
		if(n != null){
			if (n.getNext()==tail){
				n.setNext(null);
				tail = n;
			}
			else
				n.setNext(n.getNext().getNext());
			return true;
		}
		return false;
	}
	

	public int search(int value){
		int position = 0;
		Node iteratorNode = head;
		while(true){
			if(iteratorNode == null) {
				position = -1;
				break;
			}
			else{
				position++;
				if(iteratorNode.getValue() == value)
					break;
				else
					iteratorNode = iteratorNode.getNext();
			}
		}
		return position;
	}
	
	
	public void printItOptimised(){
		Node n = head;
		while(n != null){
			n.printIt();
			n = n.getNext();
		}
	}
	
	public void printItReverse(){
		Node curr = tail;
		if(tail != null){
			while(curr != head){
				Node prev = head;
				while(prev.getNext() != curr){
					prev = prev.getNext();
				}
				System.out.println(curr.getValue());
				curr = prev;
			}
			System.out.println(curr.getValue());
		}
		else
			System.out.println("Sorry empty list");
	}
	
	public void printIt(){
		Node iteratorNode = head;
		if(head!=null){
			head.printIt();
			while(iteratorNode.getNext()!=null){
				iteratorNode = iteratorNode.getNext();
				iteratorNode.printIt();
			}
		}
		else
			System.out.println("Sorry, your list is empty");
	}
}
