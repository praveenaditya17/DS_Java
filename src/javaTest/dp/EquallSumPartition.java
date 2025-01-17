package javaTest.dp;

// Equall Sum Paratition 

public class EquallSumPartition {
	
	public static void main(String args[]) {
		
		int arr[]= {1,5,11,5};
		//{1,5,5}=={11} ==> true
		
		
		System.out.println(quallSumPartition(arr));
		
	}
	
	public static boolean quallSumPartition(int arr[]) {
		
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		
		if(sum%2!=0) {
			return false;
		}
		
		sum=sum/2;
		int n=arr.length;
		boolean t[][]=new boolean[n+1][sum+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0) {
					t[i][j]=false;
				}
				if(j==0) {
					t[i][j]=true;
				}
			}
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				
				if(arr[i-1]<=j) {
					t[i][j]= (t[i-1][j-arr[i-1]]) || (t[i-1][j]);
				}else {
					t[i][j]=t[i-1][j];
				}
			}
		}

		
		return t[n][sum];
	}

}
