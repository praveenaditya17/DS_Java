package javaTest.stack;

import java.util.Stack;

//next largest emelment from left ro right
public class NextLargestElement {

	public static void main(String[] args) {
		
		//int arr[] = new int[]{1,3,2,4};  // --> o(n)
		int arr[] = new int[]{11,13,21,3};
		Stack<Integer> s= new Stack<>();
		int r=0;
		int result[] = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			if(s.size()==0) {
				result[r++]=-1;
			}
			else if(s.size()>0 && s.peek()>arr[i]) {
				result[r++]=s.peek();
			}
			else if(s.size()>0 && s.peek()<arr[i]) {
				while(s.size()>0 && s.peek()<arr[i]) {
					s.pop();
				}
				if(s.size()==0) {
					result[r++]=-1;
				}
				else {
					result[r++]=s.peek();
				}
			}
			s.push(arr[i]);
		}
		
		for(int i=result.length-1;i>=0;i--) {
			System.out.println(result[i]);
		}
		
		
		// same problem using 2 for loop  arr[]: {1,3,2,4}  --> o(n2)
		for(int i=0;i<arr.length;i++) {
			int res=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					res=arr[j];
					break;
				}
				
			}
			System.out.println(res);
		}
		
		
	}

}
