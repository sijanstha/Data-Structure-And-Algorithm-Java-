package com.sijan.algorithm.linkedlist;

public class LinkedList {

	Node head;

	// Worst Case: O(n)
	// Best Case: O(1)
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {

			Node n = head; // For iteration
			while (n.next != null) {
				n = n.next;
			}

			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}

	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			Node n = head;
			Node prev = null;
			
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			prev = n.next;
			n.next = prev.next;
			prev = null; 
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
