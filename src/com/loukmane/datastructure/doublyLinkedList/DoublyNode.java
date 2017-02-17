package com.loukmane.datastructure.doublyLinkedList;

import com.loukmane.datastructure.singlylinkedlist.Node;

public class DoublyNode {

	private int value;
	private DoublyNode previous;
	private DoublyNode next;
	
	public DoublyNode(int value, Node next, Node previous) {
		
	}
	public DoublyNode(int value) {
		previous = null;
		next = null;
		this.value = value;
	}
	
	public void printIt(){
		System.out.println(value);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public DoublyNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoublyNode previous) {
		this.previous = previous;
	}
	public DoublyNode getNext() {
		return next;
	}
	public void setNext(DoublyNode next) {
		this.next = next;
	}
	
	
	
}
