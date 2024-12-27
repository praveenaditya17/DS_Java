package javaTest.slidingWindo;

import java.util.HashMap;

public class LargestSubArrayOfSumK {

	//arr: 4,1,1,1,1,2,3,5
	//sum K = 5;
	
	public static void main(String args[]) {
		
		int arr[]= {4,1,1,1,1,2,3,5};
		int K = 5;
		
		// only for +ve element 
		int sum=0;
		int i=0,j=0;
		int max=0;
		while(j<arr.length) {

			sum=sum+arr[j];
			
			 if(sum>=K) {
				
				while(sum>K) {
					sum=sum-arr[i];
					i++;
				}
				 
				if(sum==K) {
					if(max<j-i+1) {
						max=j-i+1;
					}
				}
			}
			
			j++;
		}
		
		System.out.println(max);
		
		
		// for all element
		int maxlen=0;
        sum=0;
        HashMap<Integer,Integer>mymap=new HashMap<>();
        int N=arr.length;
        mymap.put(0,-1);
        for(i=0;i<N;i++){
            sum =sum+arr[i];
            int rem=sum-K;
            if(mymap.containsKey(rem)){
                int len=i-mymap.get(rem);
                maxlen=Math.max(maxlen,len);
            }
             if(!mymap.containsKey(sum)){
                 mymap.put(sum,i);
             }
        }
        
        System.out.print(maxlen);
		
		
	}
	
}
