package javaTest.stack;

import java.util.Stack;

public class MaxiumAreaHistogram {

	public static void main(String[] args) {
		int arr[] = new int[]{6,2,5,4,5,1,6};
		int maxArea=0;
		int widthArray[] = new int[arr.length];
		
		int NSRI_Array[]=nearestSmallestRightIndex(arr,arr.length);
		
		int NSLI_Array[]=nearestSmallestLeftIndex(arr,arr.length);
		
		for(int i=0;i<arr.length;i++) {
			widthArray[i]=NSRI_Array[i]-NSLI_Array[i]-1;
		}
		
		for(int i=0;i<arr.length;i++) {
			int temp=widthArray[i]*arr[i];
			if(maxArea<temp) {
				maxArea=temp;
			}
		}
		
		System.out.println("MaxiumAreaHistogram =>"+maxArea);
		
	}

	private static int[] nearestSmallestLeftIndex(int[] arr, int length) {
		Stack<Integer> s= new Stack<>();
		int result[]= new int[length];
		for(int i=0;i<length;i++) {
			
			while(s.size()>0 && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.empty()) {
				result[i]=-1;
			}else {
				result[i]=s.peek();
			}
		s.push(i);
		
		}
		return result;
	}

	private static int[] nearestSmallestRightIndex(int[] arr, int length) {
		Stack<Integer> s= new Stack<>();
		int result[]= new int[length];
		for(int i=length-1;i>=0;i--) {
			
			while(s.size()>0 && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.empty()) {
				result[i]=length;
			}else {
				result[i]=s.peek();
			}
		s.push(i);
		
		}
		return result;
	}
}
