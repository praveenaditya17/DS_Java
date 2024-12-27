package javaTest.dp;

public class LongestCommonSubSequence {
	static int dp[][]=new int [101][101];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABCDGH";
		String str2="AEDFHR";
		int m=6,n=6;
		int result=lcs(m,n,str1,str2);
		System.out.println(result);
		
		int result2=lcs_recursive(m,n,str1,str2);
		System.out.println(result2);
		
		
		
		for(int i=0;i<101;i++) {
			for(int j=0;j<101;j++) {
				dp[i][j]=-1;
			}
		}
		int result3= lcs_recursive_memorization(m,n,str1,str2);
		System.out.println(result3);
		
	}
	static int lcs(int m, int n, String str1, String str2) {
        // your code here
        
        int t[][]=new int [m+1][n+1];
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
        
       for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
	static int lcs_recursive(int m, int n, String str1, String str2) {
		
		if(m==0||n==0) {
			return 0;
		}
		
		if(str1.charAt(m-1)==str2.charAt(n-1)) {
			return 1+lcs_recursive(m-1,n-1,str1,str2);
		}
		else {
			return Math.max(lcs_recursive(m,n-1,str1,str2),lcs_recursive(m-1,n,str1,str2));
		}

	}
	
	static int lcs_recursive_memorization(int m, int n, String str1, String str2) {
		
		if(m==0||n==0) {
			return 0;
		}
		
		if(dp[m][n]!=-1) {
			return dp[m][n];
		}
		
		if(str1.charAt(m-1)==str2.charAt(n-1)) {
			return dp[m][n]= 1+lcs_recursive(m-1,n-1,str1,str2);
		}
		else {
			return dp[m][n]=Math.max(lcs_recursive(m,n-1,str1,str2),lcs_recursive(m-1,n,str1,str2));
		}

	}

}
