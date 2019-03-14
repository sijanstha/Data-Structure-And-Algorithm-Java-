package com.sijan.algorithm;

import com.sijan.algorithm.doublylinkedlist.DoublyLinkedList;
import com.sijan.algorithm.linkedlist.LinkedList;

public class MainTest {

	public static void main(String args[]) {
		
		int[] test = {4,6,7,2,8,100,5,32,78,39,4};
		
		Algorithms algo = new Algorithms();
		int result = algo.getSecondMaxNumber(test);
		System.out.println(result);
		
		LinkedList list = new LinkedList();
		list.insert(3);
		list.insert(5);
		list.insert(6);
		list.insert(77);
		list.insertAtStart(100);
		list.deleteAt(2);
		list.show();
		
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.insert(1);
		dlist.insert(2);
		dlist.insert(4);
		dlist.insert(5);
		dlist.insertAt(2,3);
		dlist.insertAtStart(0);
		dlist.deleteAt(2);
		dlist.show();
	}
}
