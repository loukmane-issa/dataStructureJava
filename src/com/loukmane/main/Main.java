package com.loukmane.main;

import com.loukmane.datastructure.BinarySearchTree.BinarySearchTree;
import com.loukmane.datastructure.doublyLinkedList.DoublyLinkedList;
import com.loukmane.datastructure.heap.Heap;
import com.loukmane.datastructure.singlylinkedlist.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap = new Heap();
/*		binary.insert(18);
		binary.insert(14);
		binary.insert(23);
		binary.insert(17);
		binary.insert(8);
		binary.insert(12);
		binary.insert(5);
		binary.insert(6);
		binary.insert(2);*/
		heap.insert(23);
		heap.insert(14);
		heap.insert(31);
		heap.insert(17);
		heap.insert(7);
		heap.insert(9);
		heap.printIt();
		heap.remove(14);
		heap.printIt();
	}

}