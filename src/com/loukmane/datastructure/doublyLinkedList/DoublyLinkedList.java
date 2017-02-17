package com.loukmane.datastructure.doublyLinkedList;

import com.loukmane.datastructure.singlylinkedlist.Node;

public class DoublyLinkedList {
	private DoublyNode head;
	private DoublyNode tail;
	
	
	
	public DoublyLinkedList(DoublyNode head, DoublyNode tail) {
		this.head = head;
		this.tail = tail;
	}

	public void add(int value){
		DoublyNode n = new DoublyNode(value);
		if(head == null){
			head = n;
			tail = n;
		}
		else{
			tail.setNext(n);
			n.setPrevious(tail);
			tail = n;
		}
	}
	
	public void printItReverseOptimised(){
		DoublyNode n = tail;
		while(n != null){
			n.printIt();
			n = n.getPrevious();
		}
	}
	
	public void printItOptimised(){
		DoublyNode n = head;
		while(n != null){
			n.printIt();
			n = n.getNext();
		}
	}
	
	public Boolean remove(int value){
		if(head == null)
			return false;
		else{
			if(head.getValue() == value){
				if(head == tail){
					head = null;
					tail = null;
				}
				else {
					head = head.getNext();
					head.setPrevious(null);
				}
				return true;
			}
			DoublyNode n = head.getNext();
			while(n!=null && n.getValue() != value){
				n = n.getNext();
			}
			if(n == tail) {
				tail = n.getPrevious();
				tail.setNext(null);
				return true;
			} 
			else if (n!= null){
				n.getPrevious().setNext(n.getNext());
				n.getNext().setPrevious(n.getPrevious());
				return true;
			}
			return false;
		}
	}
}
