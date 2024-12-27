package javaTest.dp;

public class LongestCommonIncreasingSubSeq {

	public static void main(String[] args) {

		int arr1[] = {1, 4, 9, 1}, arr2[] = {1, 4, 8, 9, 10, 2, 1};
		int result=LCIS(arr1,arr2);
		System.out.println(result);
		
		int result2=LCIS(arr1,arr1.length,arr2,arr2.length);
		System.out.println(result2);
	}
	
	public static int LCIS(int[] arr1, int[] arr2) {
        // code here
        
        int n1=arr1.length;
        int n2=arr2.length;
        int max=0;
        int t[][]=new int[n1+1][n2+1];
        
        for(int i=0;i<n1+1;i++){
        	
            for(int j=0;j<n2+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
        
        for(int i=1;i<n1+1;i++){
        	max=0;
            for(int j=1;j<n2+1;j++){
                
                	if(arr1[i-1]>arr2[j-1]) {
                		max=Math.max(t[i-1][j], max);
                	}
                	if(arr1[i-1]==arr2[j-1]){
                    t[i][j]=max+1;
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        for(int j=2;j<n2+1;j++) {
        	t[n1][j] = Math.max(t[n1][j], t[n1][j-1]); 
        }
        
        return t[n1][n2];
    }
	static int LCIS(int[] arr1, int m, int[] arr2, int n) {
        int[][] dp = new int[n + 1][m + 1];
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int currentMax = 0;
            for (int j = 1; j <= m; j++) {
                if (arr2[i - 1] == arr1[j - 1]) {
                    dp[i][j] = currentMax + 1;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
                if (arr2[i - 1] > arr1[j - 1]) {
                    currentMax = Math.max(currentMax, dp[i - 1][j]);
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }

}
