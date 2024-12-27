package javaTest.linklist;

import javax.print.event.PrintJobAttributeListener;

import javaTest.linklist.FindElementInLinkedList.Node;

public class ReverseLinkedList {

	public Node head;
	
	public static class Node {
		
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
		public static void main(String args[]) {
			
			ReverseLinkedList list= new ReverseLinkedList();
			
			list.head= new Node(10);
			Node second= new Node (5);
			Node third= new Node (8);
			Node four= new Node (15);
			
			list.head.next=second;
			second.next=third;
			third.next=four;
			
			
			list.printList();
			
			list.reverseList();
			list.printList();
		}
		private void printList() {
			
			Node temp=head;
			
			if(temp==null) {
				return;
			}
			while(temp!=null) {
				System.out.print(temp.data+" --> ");
				temp=temp.next;
			}
			System.out.println(temp);
		}
		
		private void reverseList() {
			
			Node current=head;
			
			Node previous =null;
			Node nextE = null;
			
			
			while(current!=null) {
				nextE=current.next;
				current.next=previous;
				previous=current;
				current=nextE;
			}	
			head=previous;
		}
	
}
