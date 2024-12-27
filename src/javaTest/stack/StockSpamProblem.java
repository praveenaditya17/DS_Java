package javaTest.stack;

import java.util.Stack;

public class StockSpamProblem {

	public static void main(String[] args) {

		int arr[]=new int[] {100,80,60,70,60,75,85};
		
		int spam[]= new int[arr.length];
		Stack<Integer> s= new Stack<>();
		
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			if(s.size()==0) {
				spam[i]=i+1;
			}
			else if(s.size()>0 && arr[s.peek()]>arr[i]) {
				spam[i]=i-s.peek();
			}
			else if(s.size()>0 && arr[s.peek()]<arr[i]) {
				while(s.size()>0 && arr[s.peek()]<arr[i]) {
					s.pop();
				}
				if(s.empty()) {
					spam[i]=i+1;
				}else {
					spam[i]=i-s.peek();
				}
			}
			s.push(i);
		}
		for(int i:spam)
		System.out.println(i);
		
	//	or
	/*	for(int i=0;i<arr.length;i++) {
			
				while(s.size()>0 && arr[s.peek()]<arr[i]) {
					s.pop();
				}
				if(s.empty()) {
					spam[i]=i+1;
				}else {
					spam[i]=i-s.peek();
				}
			s.push(i);
		}*/
		
	}
}
