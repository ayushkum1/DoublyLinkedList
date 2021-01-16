package com.app.doublylinkedlist;

import java.util.Scanner;

/*
	PLS ADD INTERFACE
*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		System.out.println("*************adding at front*************");
		doublyLinkedList.addAtFront(10);
		doublyLinkedList.addAtFront(9);
		doublyLinkedList.addAtFront(6);
		doublyLinkedList.addAtFront(7);
		doublyLinkedList.addAtFront(6);
		doublyLinkedList.addAtFront(16);
		doublyLinkedList.addAtFront(26);
		
		System.out.println("*************adding at back*************");
		doublyLinkedList.addAtEnd(22);
		doublyLinkedList.addAtEnd(23);
		doublyLinkedList.addAtEnd(24);
		doublyLinkedList.addAtEnd(25);
		
		System.out.println("*************printing*************");
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(26));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(25));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(106));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(6));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(6));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(7));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(10));
		doublyLinkedList.printList();
		System.out.println("Popped Element is " + doublyLinkedList.pop(22));
		doublyLinkedList.printList();
	}
	
}
