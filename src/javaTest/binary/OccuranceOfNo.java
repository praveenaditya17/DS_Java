package javaTest.binary;

import java.util.HashMap;

public class OccuranceOfNo {

	public static void main(String args[]) {
		int arr[]= {1,3,4,6,3,4,4,5,9,4};
		HashMap<Integer, Integer> map=count(arr,arr.length-1);
		System.out.println(map.toString());
	}
	
	private static HashMap<Integer,Integer> count(int arr[],int n) {
		if(n<0) {
			
			return new HashMap();
		}
		int count=0;
		HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<=arr.length-1;i++) {
				if(arr[i]==arr[n]) {
					count+=1;
				}
			}
		
		if(!map.containsKey(arr[n]))
			map.put(arr[n], count);
		
		map.putAll(count(arr,--n));
		return map;
	}
}
