package javaTest.dp;

// maximize the cut segment of length p,q,& r
public class MaxCutSegement {

	public static int dp[]=new int[1004];
	public static void main(String args[]) {
			
		int n=4;
		int p=2,q=1,r=1;
		
		for(int i=0;i<1004;i++) {
			dp[i]=-1;
		}
		
		int ans=fun(n,p,q,r);
		
		System.out.println(ans);
	}

	private static int fun(int n, int p, int q, int r) {
		
		if(n==0) {
			return 0;
		}
		
		if(dp[n]!=-1) {
			return dp[n];
		}
		int op1=Integer.MIN_VALUE;
		int op2=Integer.MIN_VALUE;
		int op3=Integer.MIN_VALUE;
		if(n>=p) {
			op1=fun(n-p,p,q,r);
		}
		if(n>=q) {
			op2=fun(n-q,p,q,r);
		}
		if(n>=r) {
			op3=fun(n-r,p,q,r);
		}
		
		return dp[n]=1+Math.max(op1, Math.max(op2, op3));
		
	}
}
