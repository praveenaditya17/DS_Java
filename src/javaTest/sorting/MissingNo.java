package javaTest.sorting;

public class MissingNo {

	public static void main(String args[]) {

		
		int arr[] = { 6, 2, 1, 5, 0, 3 }; 
		// find missing no. in a array between o to n  
		// using cyclic sort
		findMissing(arr);
		int result = search(arr);
		System.out.println(result);
		
		// find missing no. from array between 1 to n
		int arr2[]= {8,3,5,1,9,6,7,2,4};
		findMissing3(arr2);
		
		// find missing no. from array between 1 to n
		int arr3[]= {8,0,3,5,1,9,6,7,4};
		findMissing2(arr3);
		
		// find missing no. from array between 1 to n
		int arr4[]= {2,3,5,1,9,6,7,4};
		findMissing4(arr4);
		
		// find missing no. from array between 1 to n
		int arr5[]= {8,3,5,1,9,6,7,4,10,2};
		findMissing5(arr5);
		
		

		
	}


	private static void findMissing(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];

			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			} else {
				i++;
			}
		}
	}

	public static int search(int arr[]) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index)
				return index;
		}
		return arr.length;
	}
	
	private static void findMissing2(int[] arr) {
		int sum=0;
		int n=arr.length;
		int temp= (n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int result= temp-sum;
		System.out.println(result);
	}
	
	private static void findMissing3(int[] arr) {
		int sum=0;
		int n=arr.length+1;
		int temp= (n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int result= temp-sum;
		System.out.println(result);
	}
	
	
	private static void findMissing4(int[] arr4) {
		int xor=1;
		for(int i=2;i<=arr4.length+1;i++) {
			xor=xor^i;
		}
		int xor2=arr4[0];
		for(int i=1;i<arr4.length;i++) {
			xor2=xor2^arr4[i];
		}
		System.out.println(xor^xor2);
		//System.out.println(xor2);
	}
	
	private static void findMissing5(int[] arr5) {
		int temp[]= new int[arr5.length+1];
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=0;
		}
		
		for(int i=0;i<arr5.length;i++) {
			temp[arr5[i]-1]=1;
		}
		
		int ans=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]==0) {
				ans=i+1;
			}
		}
		System.out.println(ans);
	}
	
}
