package javaTest.binary;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

	public static void main(String a[]) {
		int arr[]= {1,2,3,4,5,6,1};
		
		int result=findDuplicate(arr,arr.length-1);
		System.out.println(result);
		int b=10;
		increment(b);
		List<Integer> list = new ArrayList<>();
		increment(list);
		System.out.println(list);
	}

	

	private static int findDuplicate(int arr[],int n) {

		if(n<0){
			return -1;
		}
		for(int i=0;i<n;i++)
			if(arr[n]==arr[i]) {
				return arr[n];
			}
		return findDuplicate(arr,--n);
	
	}
	private static void increment(int a) {
		a=a+5;
		//System.out.print(a);
	}
	private static void increment(List<Integer> a) {
		a.add(10);
		System.out.println(a);
	}
}
