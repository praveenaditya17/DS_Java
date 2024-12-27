package javaTest.binary;

public class countOccuranceOfANo {

	public static void main(String args[]) {
		int arr[]= {1,3,4,6,3,4,4,5,9,4};
		int ans=count(arr,arr.length-1,4);
		System.out.println(ans);
	}
	
	private static int count(int arr[],int n,int k) {
		if(n<0) {
			return 0;
		}
		int count=0;
		if(k==arr[n]) {
			count= 1;
		}
		return count+count(arr,--n,k);
	}
}
