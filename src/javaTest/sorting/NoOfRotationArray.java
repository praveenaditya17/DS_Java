package javaTest.sorting;

public class NoOfRotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,6,7,2,3,4,4,5};
		
		int noOfRoation=binarySearch(arr,0,arr.length-1);
		System.out.println(arr.length-noOfRoation);
	}

	private static int binarySearch(int[] arr, int start, int end) {
		
		
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<=arr[mid+1] && arr[mid]<=arr[mid-1]) {
				return mid;
			}
			else if(arr[start]<arr[mid]) {
				start=mid+1;
			}else if(arr[mid]<arr[end]) {
				end= mid-1;
			}
		}
		
		return -1;
	}

}
