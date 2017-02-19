package com.loukmane.datastructure.queues;

import java.util.ArrayList;

public class Queue {

	ArrayList<Integer> elemList;
	
	
	
	public Queue() {
		this.elemList = new ArrayList<>();
	}

	public void Enqueue(int value){
		this.elemList.add(value);
	}
	
	public int Dequeue(){
		int element = this.Peek();
		this.elemList.remove(0);
		return element;
	}
	
	public int Peek(){
		if(elemList.size() == 0)
			throw new NullPointerException("The queue is empty, you can't dequeue");
		int element = this.elemList.get(0);
		return element;
	}
	
	public void printIt(){
		System.out.print("{ ");
		for(Integer elem: elemList){
			System.out.print(elem + "; ");
		}
		System.out.println(" }");
	}
}
