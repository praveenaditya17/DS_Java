package javaTest.array;

import java.util.HashMap;

public class Count_pairs_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 7, -1, 5}, target = 6;
		
		int count=new Count_pairs_with_given_sum().countPairs(arr, target);
		System.out.println(count);
		
	}
	int countPairs(int arr[], int target) {
        // Your code here
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            int temp=target-arr[i];
            if(hm.containsKey(temp)){
                count+=hm.get(temp);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return count;
    }

}
