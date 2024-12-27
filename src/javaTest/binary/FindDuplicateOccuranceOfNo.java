package javaTest.binary;

public class FindDuplicateOccuranceOfNo {

		public static void main(String args[]) {
			int arr[]= {1 ,1,1,2,3,4,5,6};
			
			int result=findDuplicate(arr,arr.length-1);
			System.out.println(result);
		}

		private static int findDuplicate(int arr[],int n) {

			if(n<0){
				return -1;
			}
			for(int i=0;i<n;i++)
				if(arr[n]==arr[i]) {
					return arr[n];
				}
			return findDuplicate(arr,--n);
		
		}
}
