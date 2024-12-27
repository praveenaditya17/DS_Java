package javaTest.binary;

// bianary search
public class FindFirstAndLastOccurance {

	public static void main(String args[]) {
		
		int arr[]= {6,7,7,7,7,8,9};
		int fistOcc=firstOccurance(arr,7);
		int lastOcc=getLastOccurance(arr,7);
		System.out.println(fistOcc +"......"+lastOcc);
	}
	public static int firstOccurance(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			
			
			if(target>arr[mid])
				start=mid+1;
			
			if(target<arr[mid])
				end=mid-1;

			if(arr[mid]==target)
				end=mid-1;
			
			mid= start+(end-start)/2;
		}
		
		return mid;
	}
	//int arr[]= {6,7,7,7,8,8,9};
	public static int lastOccurance(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		System.out.println(end);
		int mid=start+(end-start)/2;
		while(start<=end) {
			
			if(target>arr[mid])
				start=mid+1;
			
			if(target<arr[mid])
				end=mid-1;
			
			if(arr[mid]==target)
				start=mid+1;
			
			 mid=(end+start)/2;
		}
		
		return mid;
	}
	public static int getLastOccurance(int arr[],int target) {
		int res=-1;
		
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				res=mid;
				start=mid+1;
			}
			if(target<arr[mid]) {
				end=mid-1;
			}
			if(target>arr[mid]) {
				start=mid+1;
			}
		}
		
		return res;
	}
	
}
