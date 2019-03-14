package com.sijan.algorithm.doublylinkedlist;

public class DoublyLinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev = n;
		}
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = null;

		if(index == 0) {
			insertAtStart(data);
		}else {
			Node n = head;
			Node previousNode;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			previousNode = n.next;
			node.prev = n;
			node.next = previousNode;
			n.next = node;
			previousNode.prev = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = null;
		
		node.next = head;
		head.prev = node;
		head = node;
	}
	
	public void deleteAt(int index) {
		Node n = head;
		for(int i=0; i<index-1; i++) {
			n = n.next;
		}
		Node previousNode = n.next;
		
		n.next = previousNode.next;
		previousNode.next.prev = n;
		
		previousNode = null;
	}

	public void show() {
		Node n = head;
		System.out.println("List in forward direction: ");
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
		
		System.out.println("List in backward direction: ");
		while (n.prev != null) {
			System.out.println(n.data);
			n = n.prev;
		}
		System.out.println(n.data);
	}

}
