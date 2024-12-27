package javaTest.slidingWindo;

public class BinarySubarrayWithSum {

	
	public static void main(String args[]) {
		int arr[]= {1,0,1,0,0,1,0};
		int target=2;
		
		int target1=getCount(arr,target);
        int target2=getCount(arr,target-1);
        int ans =target1-target2;
        System.out.println(ans);
	}
	public static int getCount(int[] arr, int target){
        if(target<0){
            return 0;
        }
        int sum=0;
        int i=0;
        int j=0;
        int count=0;
        while(j<arr.length){
            
            
            sum=sum+arr[j];
            
           
            while(sum>target){
                sum=sum-arr[i];
                i++;
            }
            
            count=count+(j-i+1);
            j++;
            
        }
        
       
        return count;
    }
}
