package javaTest.linklist;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkListPrint {

	Node head=null;
	Node tail=null;
	public static void main(String args[]) {
		LinkListPrint list= new LinkListPrint();
//		list.insertNode(10);
//		list.insertNode(20);
//		list.insertNode(30);
//		list.insertNode(40);
//		list.insertNode(50);
//		list.deleteNode(40);
//		boolean result =list.findCircle();
//		System.out.println("------"+result);
//		
//		list.printList();
		
		list.circularLinkedList(10);
		list.circularLinkedList(20);
		list.circularLinkedList(30);
		list.circularLinkedList(40);
		
		boolean result =list.findCircle();
		System.out.println("------"+result);
		
		list.printCircularList();
		
		
	}

	private void printList() {

		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
		
	}
	
	private void printCircularList() {

		while(head!=tail) {
			System.out.println(head.data);
			head=head.next;
		}
		System.out.println(tail.data);
		
	}
	
	public void insertNode(int data) {
       
        // Creation of a new node.
        Node newNode = new Node(data);

        if(head==null) {
        	head=newNode;
        	return;
        }
        Node temp=head;
        while(temp.next!=null) {
        	temp=temp.next;
        }
        temp.next=newNode;
    }
	
	public void deleteNode(int data) {
		Node temp=head;
		
		if(temp.data==data) {
			head=temp.next;
			temp.next=null;
			return;
		}
		while(temp.next!=null) {
			Node temp2=temp.next;
			if(temp.next.data==data) {
				temp.next=temp.next.next;
				temp2.next=null;
				return;
			}
			temp=temp.next;
		}
			
	}
	
	public boolean findCircle() {
		Node slow=head;
		Node fast=head;
		
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public void circularLinkedList(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
		}else {
			tail.next=node;
			tail=node;
			tail.next=head;
		}
	}
}
