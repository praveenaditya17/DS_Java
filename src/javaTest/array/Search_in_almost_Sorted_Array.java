package javaTest.array;

public class Search_in_almost_Sorted_Array {

	public static void main(String[] args) {
		
		int arr[]= {10, 3, 40, 20, 50, 80, 70};
		
		Search_in_almost_Sorted_Array s= new Search_in_almost_Sorted_Array();
		
		int smax=s.findTarget(arr,40);
		System.out.println(smax);
	}
	public int findTarget(int arr[], int target) {
   
		// using binary search
        
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target){
                return mid;
            }else if(mid-1>=start && arr[mid-1]==target){
                return mid-1;
            }else if(mid+1<=end && arr[mid+1]==target){
                return mid+1;
            }
            if(arr[mid]>target){
                end=mid-2;
            }else{
                start=mid+2;
            }
        }
        return -1;
    }

}
