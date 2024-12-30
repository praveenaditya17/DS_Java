package javaTest.array;

import java.util.HashMap;

public class Largest_subarray_with_sum_0 {
	public static void main(String[] args) {
		int arr[] = {10, 2, -2, -20, 10};
		
		int result=new Largest_subarray_with_sum_0().getLargestSubarrays(arr);
		System.out.println(result);
	}
	public int getLargestSubarrays(int arr[]) {
		
		int sum=0;
        int max=0;
      
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
           
            if(!hm.containsKey(sum)){
            	hm.put(sum,i);
            }else {
            	max=Math.max(max, i-hm.get(sum));
            }
            
        }
        return max;
    }
	
}
