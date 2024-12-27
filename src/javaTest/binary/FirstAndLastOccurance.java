package javaTest.binary;

public class FirstAndLastOccurance {

		public static void main(String args[]) {
			//          0,1,2,3,4,5,,6,,7,,,8,,9,10
			int arr[]= {1,2,4,4,5,10,10,10,10,12,13};
			int element =20;
			
			int res1=binary1stOccurance(arr,element);
			System.out.println(res1);
			int res2=binaryLastOccurance(arr,element);
			System.out.println(res2);
		}

		private static int binary1stOccurance(int[] arr, int element) {
			int start=0;
			int end=arr.length-1;
			
			int res=-1;
			
			while(start<=end) {
				int mid=(start+end)/2;
				
				if(element==arr[mid]) {
					res=mid;
					end=mid-1;
				}
				if(element<arr[mid]) {
					end=mid-1;
				}
				if(element>arr[mid]) {
					start=mid+1;
				}
			}
			
			return res;
		}
		private static int binaryLastOccurance(int[] arr, int element) {
			int start=0;
			int end=arr.length-1;
			
			//int mid=-1;
			int res=-1;
			
			while(start<=end) {
				int mid=start+(end-start)/2;
				
				if(element==arr[mid]) {
					res=mid;
					start=mid+1;
				}
				if(element<arr[mid]) {
					end=mid-1;
				}
				if(element>arr[mid]) {
					start=mid+1;
				}
			}
			
			return res;
		}
}
