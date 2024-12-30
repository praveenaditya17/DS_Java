package javaTest.binary;

public class Allocate_Minimum_Pages {

	public static void main(String[] args) {
		
		int arr[] = {12, 34, 67, 90}, k = 2;
		
		int result=findPages(arr,k);
		System.out.println(result);

	}
	public static int findPages(int[] arr, int k) {

		if(arr.length<k){
            return -1;
        }
		// here start is maximum value of array and end is sum of array
		// so binary search between maximum value of array and sum of array
        int end=0;
        int start=0;
        for(int i:arr){
            end+=i;
            if(start<i){
                start=i;
            }
        }
        int res=0;
        
        int n=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            
            if(isValid(arr,n,k,mid)){
                end=mid-1;
                res=mid;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
	// here we are checking the mid is valid or not 
	// no of book are allocate to each student or not 
    public static boolean isValid(int arr[],int n,int k,int mid){
        int student=1;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>mid){
                student++;
                sum=arr[i];
            }
            if(student>k){
                return false;
            }
        }
        return true;
    }

}
