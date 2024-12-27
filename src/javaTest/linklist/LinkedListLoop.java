package javaTest.linklist;

public class LinkedListLoop {

	public  Node head;
	
	public static class Node {
		
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
		public static void main(String args[]) {
			
			LinkedListLoop list= new LinkedListLoop();

			list.head= new Node(10);
			Node second= new Node (5);
			Node third= new Node (8);
			Node four= new Node (15);
			Node five= new Node (25);
			
			list.head.next=second;
			second.next=third;
			third.next=four;
			four.next=five;
			five.next=third;
			
			//list.printList();
			
			boolean result =list.deductLoop();
			System.out.println("loop in the linked list is ->"+result);

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
		
		private boolean deductLoop() {
			Node slowPointer =head;
			Node fastPonter = head;
			
			while(fastPonter!=null && fastPonter.next!=null) {
				slowPointer=slowPointer.next;
				fastPonter=fastPonter.next.next;
				if(slowPointer==fastPonter) {
					return true;
					
				}
				
				
			}
			return false;
			
		}
}
