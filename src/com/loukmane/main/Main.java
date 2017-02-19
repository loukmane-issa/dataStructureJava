package com.loukmane.main;

import com.loukmane.datastructure.BinarySearchTree.BinarySearchTree;
import com.loukmane.datastructure.doublyLinkedList.DoublyLinkedList;
import com.loukmane.datastructure.heap.Heap;
import com.loukmane.datastructure.singlylinkedlist.LinkedList;
import com.loukmane.sets.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set1 = new Set();
		Set set2 = new Set();
/*		binary.insert(18);
		binary.insert(14);
		binary.insert(23);
		binary.insert(17);
		binary.insert(8);
		binary.insert(12);
		binary.insert(5);
		binary.insert(6);
		binary.insert(2);*/
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set2.add(1);
		set2.add(3);
		set2.add(2);
		
		set1.printIt();
		set2.printIt();
		Set.union(set1, set2).printIt();
		Set.intersection(set1, set2).printIt();
	}

}