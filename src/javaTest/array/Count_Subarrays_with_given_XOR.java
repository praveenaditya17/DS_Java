package javaTest.array;

import java.util.HashMap;

public class Count_Subarrays_with_given_XOR {

	public static void main(String[] args) {

		int arr[] = {4,2,2,6,4};
		int k=6;
		//The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and  ( 1^1=0 , 0^1=1, 1^0=1, 0^0=0)
		long result=new Count_Subarrays_with_given_XOR().subarrayXor(arr,k);
		System.out.println(result);
	}
	public long subarrayXor(int arr[], int k) {
        
        HashMap<Integer,Integer>  hm= new HashMap<>();
        
        int xor=0;
        int ans=0;
        hm.put(0,1);
        for(int i:arr){
            
            xor=xor^i;
            
            if(hm.containsKey(xor^k)){
                ans+=hm.get(xor^k);
            }
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        
        return ans;
    }

}
