package com.loukmane.datastructure.heap;

import java.util.Arrays;

public class Heap {

	int[] array;

	public Heap() {
		this.array = new int[0];
	}
	
	public void insert(int value){
		resizeArray(array.length);
		array[array.length-1] = value;
		minHeapify();
	}
	
	public Boolean remove(int value){
		int removeIndex = findIndex(value);
		
		//if item is not in the heap
		if(removeIndex < 0)
			return false;

		array[removeIndex] = array[array.length-1];
		//set element to null for garbage collector (can't be done with primitive int, but could be with Integer)
		//array[array.length-1] = null;
		int[]  arrayReplace = new int[array.length-1];
		System.arraycopy(array, 0, arrayReplace, 0, array.length-1);
		
		array = arrayReplace;
		
		while(indexLeft(removeIndex) < array.length-1 && (array[removeIndex] > array[indexLeft(removeIndex)] || array[removeIndex] > array[indexRight(removeIndex)])){
			if(array[indexLeft(removeIndex)] < array[indexRight(removeIndex)]){
				swapElements(indexLeft(removeIndex), removeIndex);
				removeIndex = indexLeft(removeIndex);
			}
			else
				swapElements(indexRight(removeIndex), removeIndex);
				removeIndex = indexRight(removeIndex);
		}
		
		
		return true;
	}
	
	public Boolean containsNotOptimised(int value){
		int i = 0;
		while(i<array.length && array[i] != value)
		{
			i++;
		}
		if(i<array.length)
			return true;
		return false;
	}
	
/*	public Boolean containsOptimised(int value){
		
	}
	*/
	public Boolean swapElements(int indexA, int indexB){
		if(indexA > array.length-1 && indexB > array.length-1)
			return false;
		
		int valueIndexA = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = valueIndexA;
		return true;
	}
	
	public int indexLeft(int i){
		return 2 * i + 1;
	}
	
	public int indexRight(int i){
		return 2 * i + 2;
	}
	
	public int findIndex(int value){
		for(int i = 0; i<array.length-1;i++) {
			if(array[i] == value)
				return i;
		}
		return -1;
	}
	
	public void minHeapify(){
		int i = array.length - 1;
		while( i > 0 && array[i] < array[(i-1)/2]){
			int tempValue = array[i];
			array[i] = array[(i-1)/2];
			array[(i-1)/2] = tempValue;
			i = (i-1)/2;
		}
	}
	
	public void printIt(){
		for(int i = 0; i<=array.length-1; i++){
			System.out.println(array[i]);
		}
	}
	
	public void resizeArray(int size){
		array = Arrays.copyOf(array, size+1);
	}
	
	
}
