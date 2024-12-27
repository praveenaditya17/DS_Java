package javaTest.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

// Kth smallest element form the array  
// time complexity n*logK
public class KthSmallestElement {

	public static void main(String args[]) {
		int arr[]=new int[] {7,10,4,25,15,20,3};
		// maxHeap ==> smallest element is below and max element in top  // (below position)3,4,7,10,15,20,25 (max position)
		// minHeap ==> max element is below and smallest element in top // (below position) 25,20,15,10,7,4,3 (max position)
		int K=3;
		KthSmallestElement obj= new KthSmallestElement();
		int res1=obj.kthLargerstElementMethod(arr, K);
		int res2=obj.kthSmallestElementMethod(arr, K);
		System.out.println("Kth smallest element is "+res2);
		System.out.println("Kth largest element is "+res1);

	}
	public int kthSmallestElementMethod(int arr[],int K) {
		// max heap
		PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size()>K) {
				maxHeap.poll();
			}
		}
		return maxHeap.peek();
	}
	
	public int kthLargerstElementMethod(int arr[],int K) {
		// min heap
		PriorityQueue<Integer> maxHeap= new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size()>K) {
				maxHeap.poll();
			}
		}
		return maxHeap.peek();
	}
}
