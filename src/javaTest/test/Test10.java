package javaTest.test;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 12,33,3,5,6,3,20,
		
		
		//3th largest
		

		//33,12,5,
		
		
		int arr[]= {12,33,3,5,6,3,20};
		
		int k=3;
		
		//PriorityQueue<Integer> queue= new PriorityQueue<Integer>(Collections.reverseOrder());
		
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			int temp=arr[i];
			
			queue.add(temp);
			
			if(queue.size()>k) {
				queue.poll();
			}
			
		}
		
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		
	}

}

// 

//public final class Student{
//	
//	private final String name;
//	private final int age;
//	
//	// only getter method 
//	
//	public Student(String name,int age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	
//}




//public class SingletonC{
//	
//	private static SingletonC object=null;
//	
//	private SingletonC() {
//		
//	}
//	
//	public static SingletonC  getInatance() {
//		
//		if(object==null) {
//			object =new SingletonC();
//		}else {
//			return object;
//		}
//	}
//	
//	
//	
//}






