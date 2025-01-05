package javaTest.array;

import java.util.HashMap;

public class Triplets_Sum_count {

	public static void main(String[] args) {
		// sorted array
		int arr[]= {-3,-1,-1,0,1,2};
		int k=-2;
		int count=new Triplets_Sum_count().countTriplets(arr, k);
		System.out.println(count);
	}
	public int countTriplets(int[] arr, int target) {
        // Code Here
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                
                sum=arr[i]+arr[j];

                if(hm.containsKey(target-sum)){
                    count+=hm.get(target-sum);
                }
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return count;
    }

}
