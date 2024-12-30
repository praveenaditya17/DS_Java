package javaTest.linklist;

import java.util.HashMap;

public class LRUCache {
	public static void main(String args[]) {
		LRUCache lru=new LRUCache(3);
		
		lru.set(1, 2);
		lru.set(2, 4);
		lru.set(4, 6);
		lru.set(5, 8);
		int result=lru.get(1);
		System.out.println(result);
		
	}
	// this is for store the key value pair value to insert and delete in order of 1 using double linked list 
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        
        Node(int key,int value){
            this.key=key;
            this.value=value;
            next=null;
            prev=null;
        }
    }
    
    Node front=null;
    Node rear=null;
    int capacity=0;
    HashMap<Integer,Node> hm;
    
    // Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap) {
        // code here
        this.capacity=cap;
        this.hm=new HashMap<>();
        this.front=new Node(0,0);
        this.rear=new Node(0,0);
        this.front.next=rear;
        this.rear.prev=front;
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        // your code here
        Node node=hm.get(key);
        if(node==null){
            return -1;
        }
        remove(node);
        insert(node);
        return node.value;
        
    }

    // Function for storing key-value pair.
    public void set(int key, int value) {
        // your code here
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        
        if(hm.size()==capacity){
            remove(rear.prev);
        }
       
        insert(new Node(key,value));
        
    }
    
    // Function for insert in front
    public void insert(Node node){
        hm.put(node.key,node);
        node.next=front.next;
        node.prev=front;
        front.next.prev=node;
        front.next=node;
    }
    // Function for remove from rear
    public void remove(Node node){
        hm.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

