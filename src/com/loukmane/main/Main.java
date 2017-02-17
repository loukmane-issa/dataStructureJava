package com.loukmane.main;

import com.loukmane.datastructure.BinarySearchTree.BinarySearchTree;
import com.loukmane.datastructure.doublyLinkedList.DoublyLinkedList;
import com.loukmane.datastructure.singlylinkedlist.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree binary = new BinarySearchTree();
/*		binary.insert(18);
		binary.insert(14);
		binary.insert(23);
		binary.insert(17);
		binary.insert(8);
		binary.insert(12);
		binary.insert(5);
		binary.insert(6);
		binary.insert(2);*/
		binary.insert(23);
		binary.insert(14);
		binary.insert(31);
		binary.insert(17);
		binary.insert(7);
		binary.insert(9);
		binary.inOrder(binary.getRoot());
	}

}