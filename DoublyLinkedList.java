package com.app.doublylinkedlist;

public class DoublyLinkedList {

	DListNode head;
	DListNode tail;//for end track
	
	public class DListNode{
		int data;
		DListNode next, previous;
	}

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void addAtFront(int num) {
		
		DListNode newNode = new DListNode();
		newNode.data = num;
		newNode.next = null;
		newNode.previous = null;
	
		if(head==null) {
			head = newNode;//first element
			tail = newNode;//first element, if element is added from front and isn't the first element only change the heads 
						   //position and tail remains at the position of first element inserted
		}
		else {
			head.previous = newNode;//make heads previous point to new node and next point to null, as adding at front
			/* wrong approach
			 * currentNode = newNode; //current node becomes the newNode i.e. the node added
			 * at front currentNode.previous = null;//this current nodes previous should be
			 * null as it is the first element currentNode.next = head;//current nodes next
			 * should point to the second node currently head head = currentNode;//change
			 * head to the first node
			 */		
			newNode.next = head;//make newNodes next point to head which is the second node currently
			head = newNode;//change head to the first node
			//we do not change tails position, it has got nothing to do with elements being added from front
		}
		
	}
	
	public void addAtEnd(int num) {
		
		DListNode newNode = new DListNode();
		newNode.data = num;
		newNode.next = null;
		newNode.previous = null;
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;	
		}
		
	}
	
	public int pop(int n) {
		int num = 0;
		
		DListNode current = head;
		
		if(head == null) {
			System.out.println("list is empty");
			num = -1;
		}
		else {
			//traverse list to get current nodes position matching node have data = n to be popped
			while(current != null && current.data != n) {
				current = current.next;
			}
			
			if(current == null) {
				System.out.println("Element not found");
				num = -1;
			}
			else if(current == head){//if current equals head, move head to the next node
				num = head.data;
				head = head.next;
			}
			else if(current == tail) {//if current equals tail, move tail to the previous node
				num = tail.data;
				tail.previous.next = null;
				tail = tail.previous;
			}
			else {
				//if current is between head and tail then
				num = current.data;
				current.previous.next = current.next;//make previous node(previous nodes next) to current point to next node after current
				current.next.previous = current.previous;//make next node(next nodes previous) to current point to previous node before current    
			}
		}
		
		return num;
	}
	
	public void printList() {
		
		DListNode current = head;
		
		while(current!= null) {
			System.out.println(current.data);
//			System.out.println("currents previous" + current.previous);
			current = current.next;
		}
		
	}
	
}
