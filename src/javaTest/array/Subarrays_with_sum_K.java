package javaTest.array;

import java.util.HashMap;

public class Subarrays_with_sum_K {

	public static void main(String[] args) {
		int arr[] = {10, 2, -2, -20, 10}, k = -10;
		
		int result=new Subarrays_with_sum_K().countSubarrays(arr, k);
		System.out.println(result);
	}
	public int countSubarrays(int arr[], int k) {
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(sum==k){
                count++;
            }
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
