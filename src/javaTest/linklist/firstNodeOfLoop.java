package javaTest.linklist;

import java.util.HashSet;
import java.util.Set;


public class firstNodeOfLoop {
	
	
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
			
			firstNodeOfLoop list= new firstNodeOfLoop();

			Node head= new Node(10);
			Node second= new Node (5);
			Node third= new Node (8);
			Node four= new Node (15);
			Node five= new Node (25);
			
			head.next=second;
			second.next=third;
			third.next=four;
			four.next=five;
			five.next=third;
			
			//list.printList();
			
			int result =list.findFirstNode(head);
			System.out.println("loop in the linked list is ->"+result);
			
			int result2 =list.findFirstNode2(head);
			System.out.println("loop in the linked list is ->"+result2);

		}
	
	
	public static int findFirstNode(Node head) {
        // code here  //time 0(n) space 0(n)
        
        Set<Node> set= new HashSet<>();
        
        Node fast=head.next;
        Node slow=head;
        
        while(fast!=null && fast.next!=null){
            if(set.contains(slow)){
                return slow.data;
            }
            set.add(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        return -1;
    }
	
	int findFirstNode2(Node head)
    {
        // your code here  //time 0(n) space 0(1)
        if(head == null) return -1;
        Node  slow = head;
        Node  fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(fast.next!=null){
                fast = fast.next;
            }
            if(slow == fast) break;
        }
        
        if(slow != fast) return -1;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast.data;
    }

}
