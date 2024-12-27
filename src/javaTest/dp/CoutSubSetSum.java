package javaTest.dp;

public class CoutSubSetSum {

	// 2 solution
	// 1. if no 0 in array
	// 2. if 0 exits in array

	// if zero exits in array
	public int perfectSum(int arr[], int n, int sum) {
		// Your code goes here

		 int t[][] = new int[n + 1][sum + 1];
	        int mod = 1000000007;
			t[0][0] = 1;
			for (int j = 1; j < sum + 1; j++) {
				t[0][j] = 0;
			}

			for (int i = 1; i < n + 1; i++) {
				for (int j = 0; j < sum + 1; j++) {

					if (arr[i - 1] <= j) {
						t[i][j] = (t[i - 1][j - arr[i - 1]] + t[i - 1][j])%mod;
					} else {
						t[i][j] = (t[i - 1][j])%mod;
					}
				}
			}
			return t[n][sum];

	}
	
	// if 0 does not exits in array
	public int perfectSum2(int arr[], int n, int sum) {
		// Your code goes here

		int t[][] = new int[n + 1][sum + 1];

		for(int i=0;i<n+1;i++){
	        for(int j=0;j<sum+1;j++){
	            if(i==0){
	                t[i][j]=0;
	            }
	            if(j==0) {
	            	t[i][j]=1;
	            }
	        }
	    }

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {

				if (arr[i - 1] <= j) {
					t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[n][sum];

	}
	
	public static void main(String args[]) {
		CoutSubSetSum c = new CoutSubSetSum();
		int arr2[]= {};
		int n = 6;
		int arr[] = {5, 2, 3, 10, 6, 8}, sum = 10;
		int count1= c.perfectSum2(arr,n,sum);
		System.out.print(count1);
	}
}
