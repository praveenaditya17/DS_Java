package javaTest.binary;

public class SearchRotationArray {

		public static void main(String args[]) {
			int arr[]= {5,4,3,2,1};
			int result = roatedArray(arr);
			//pivot ==>  2  ---  arr[2] ==8
			//roated array  pivot+1  =>  3
			System.out.println(result);
		}

		private static int roatedArray(int[] arr) {
			
			int start=0;
			int end=arr.length-1;
			
			
			while(start<end) {
				
				int mid=start+(end-start)/2;
				if(arr[mid]>arr[end]) {
					start=mid+1;
				}else {
					end=mid;
				}
			}
			
			return end;
		}
}
