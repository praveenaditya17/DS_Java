package javaTest.linklist;

public class FindElementInLinkedList {
	private Node head;
	public static class Node{
		
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String args[]) {
		
		FindElementInLinkedList list= new FindElementInLinkedList();
		list.createList();
		list.printList();
		
		// find the element in linked list
		int result = list.findElement(15);
		System.out.println("data "+result);
		
		// second max 
		list.secondMax();
		
	}

	private void createList() {
		
		head= new Node(10);
		Node second= new Node (5);
		Node third= new Node (8);
		Node four= new Node (15);
		
		head.next=second;
		second.next=third;
		third.next=four;
		
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
	private int findElement(int k) {
		Node temp=head;
		
		while(temp!=null) {
			if(temp.data==k) {
				return temp.data;
			}
			temp=temp.next;
		}
		return -1;
	}
	
	private void secondMax() {
		Node temp=head;
		int max1st;
		int max2nd;
		
		max1st=temp.data;
		max2nd=temp.data;
		
		while(temp!=null) {
			if(temp.data>max1st) {
				max2nd=max1st;
				max1st=temp.data;
			}else if(temp.data>max2nd){
				max2nd=temp.data;
			}
			temp=temp.next;
		}
		System.out.println("second max="+max2nd);
	}
}
