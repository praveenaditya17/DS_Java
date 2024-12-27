package javaTest.heap;

import java.util.PriorityQueue;

// print k closest no. from array
public class K_ClosestNumber {
	
	public static void main(String args[]) {
		
		int arr[]=new int[] {5,6,7,8,9};
		int K=3;
		int X=7;
		
		// maxHeap (max value on top)/(min vlaue at velow)
		PriorityQueue<MyClass> maxHeap = new PriorityQueue<>((a,b)->{
			return b.key-a.key;
		});
		
		// minHeap (min value on top)/(max vlaue at velow)
		//PriorityQueue<MyClass> minHeap = new PriorityQueue<>(Comparator.comparing(a->a.key));
		
		
		for(int i=0;i<arr.length;i++) {
			MyClass hm= new MyClass(Math.abs(X-arr[i]),arr[i]);
			 maxHeap.add(hm);
			if(maxHeap.size()>K) {
				maxHeap.poll();
			}
		}
		while(maxHeap.size()>0){
		System.out.println(maxHeap.peek().value);
		maxHeap.poll();
		}
	}
}

class MyClass{
    int key;
    int value;
    MyClass(int key,int value){
    	this.key=key;
    	this.value=value;
    }
}
