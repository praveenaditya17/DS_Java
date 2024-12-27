package javaTest.binary;

public class findPositionOfNo {

	public static void main(String[] args) {

		int arr[]= {0,2,5,8,9,19};
		int target=5;
		int position = binaryPosition(arr,target,0,arr.length);
		System.out.println(position);
	}

	private static int binaryPosition(int arr[],int target,int start,int end) {
		
		if(start>end)
		return -1;
		
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		
		if(arr[mid]<target) {
			start=mid+1;
		}
		if(arr[mid]>target) {
			end= mid-1;
		}
		
		return binaryPosition(arr,target,start,end);
	}
}
