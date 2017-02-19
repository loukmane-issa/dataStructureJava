package com.loukmane.main;

import com.loukmane.datastructure.BinarySearchTree.BinarySearchTree;
import com.loukmane.datastructure.doublyLinkedList.DoublyLinkedList;
import com.loukmane.datastructure.heap.Heap;
import com.loukmane.datastructure.queues.Queue;
import com.loukmane.datastructure.singlylinkedlist.LinkedList;
import com.loukmane.sets.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
/*		binary.insert(18);
		binary.insert(14);
		binary.insert(23);
		binary.insert(17);
		binary.insert(8);
		binary.insert(12);
		binary.insert(5);
		binary.insert(6);
		binary.insert(2);*/
		queue.Enqueue(1);
		queue.Enqueue(3);
		queue.Enqueue(4);
		queue.Enqueue(6);
		queue.Enqueue(1);
		queue.Enqueue(3);
		queue.Enqueue(2);
		queue.printIt();
		queue.Dequeue();
		System.out.println(queue.Peek());
		queue.Dequeue();
		queue.printIt();
	}

}