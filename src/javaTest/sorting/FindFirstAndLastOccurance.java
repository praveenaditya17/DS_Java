package javaTest.sorting;

//first and last occurance of number using binarySearch
public class FindFirstAndLastOccurance {
	public static void main(String args[]) {
		
		int arr[]= {2,3,4,4,4,4,5,5,6,6,7,8,9};
		
		int firstOccurance= getFristOccurance(arr,0,arr.length,4);
		System.out.println(firstOccurance+1);
		

		int secondOccurance= getLastOccurance(arr,0,arr.length,4);
		System.out.println(secondOccurance+1);
		
		}

	private static int getFristOccurance(int[] arr, int start, int end, int j) {
		int temp=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==j) {
				temp=mid;
				end=mid-1;
			}
			else if(j<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		
		
		return temp;
	}
	private static int getLastOccurance(int[] arr, int start, int end, int j) {
		int temp=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==j) {
				temp=mid;
				start=mid+1;
			}
			else if(j<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		
		
		return temp;
	}

}
