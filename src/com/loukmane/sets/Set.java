package com.loukmane.sets;

import java.util.ArrayList;

public class Set {

	public ArrayList<Integer> elemList;

	
	public static Set union(Set set1, Set set2){
		Set union = new Set();
		for(int elem : set1.getElemList()){
			union.add(elem);
		}
		//There is no risk in adding the element 
		//without checking if they are already present in the set, 
		//as we already check it during insertion
		for(int elem : set2.getElemList()){
			union.add(elem);
		}
		return union;
	}
	
	public static Set intersection(Set set1, Set set2){
		Set intersect = new Set();
		Set smallerSet;
		if(set1.getElemList().size() > set2.getElemList().size())
			smallerSet = set2;
		else
			smallerSet = set1;
		
		for(int elem : smallerSet.getElemList()){
			if(set1.contains(elem) && set2.contains(elem)){
				intersect.add(elem);
			}
		}
		return intersect;
	}
	
	
	public Set() {
		elemList = new ArrayList<>();
	}
	
	//A set contains only element that doesn't exist in the set
	//Complexity is (O(n))
	public Boolean add(int value) {
		
		for (Integer elem : elemList) {
			if (elem == value)
				return false;
		}
		this.elemList.add(value);
		return true;
	}

	public ArrayList<Integer> getElemList() {
		return elemList;
	}

	public void setElemList(ArrayList<Integer> elemList) {
		this.elemList = elemList;
	}
	
	public Boolean contains(int value){
		for (Integer elem : elemList) {
			if (elem == value)
				return true;
		}
		return false;
	}
	
	public void printIt(){
		System.out.print("{ ");
		for(Integer elem: elemList){
			System.out.print(elem + "; ");
		}
		System.out.println(" }");
	}
	
	
	
}
