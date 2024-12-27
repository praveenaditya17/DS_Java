package javaTest.dp;

// this is also known as knapsack problem
public class maxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[]= {60,100,120}; 
		int weight[]= {10,20,30};
		
		int W=50;//capacity
		
		int maxProfit=knapsack(weight,value,W,value.length);
		System.out.println("max profit ="+maxProfit);
	}

	private static int knapsack(int[] weight, int[] value, int W, int n) {
		
		if(W==0 || n==0) {
			return 0;
		}
		
		if(weight[n-1]<=W) {
			
			return Math.max(value[n-1]+knapsack(weight, value, W-weight[n-1], n-1), knapsack(weight, value, W, n-1));
		}
		else if(weight[n-1]>W) {
			return knapsack(weight, value, W, n-1);
		}
		
		return -1;
	}
	//memorization
	
	static int knapSack2(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int dp[][]=new int [n+1][W+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<W+1;j++){
                 dp[i][j]=-1;
             }
         }
         
        return getKnapSack(W,wt,val,n,dp);
    } 
    static int getKnapSack(int W, int wt[], int val[], int n,int [][]dp){
        
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
         
        
         if(wt[n-1]<=W){
            
            return dp[n][W]=Math.max(val[n-1]+getKnapSack(W-wt[n-1],wt,val,n-1,dp),getKnapSack(W,wt,val,n-1,dp));
             
         }else{
             return dp[n][W]=getKnapSack(W,wt,val,n-1,dp);
         }
    }

}
