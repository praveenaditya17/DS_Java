package javaTest.dp;

public class MinCoinChange {
	public static void main(String args[]) {
		int coins[] = {25,10,5}, sum = 30;
		int M=3;
		int result=minCoins(coins,M,sum);
	
		System.out.println(result);
	}
	public static int minCoins(int coins[], int M, int sum) {
        // Your code goes here
        
        int t[][]=new int [M+1][sum+1];
        for(int i=0;i<M+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0){
                    t[i][j]=0;
                }
                if(i==0){
                    t[i][j]=Integer.MAX_VALUE-1;
                }
                if (i == 1) {
    				if (j % coins[i - 1] == 0)
    					t[i][j] = j / coins[i - 1];
    				else
    					t[i][j] = Integer.MAX_VALUE-1;
			    }
            }
        }
   //  t[0][0] = 0;
 	
        for(int i=1;i<M+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){
                    t[i][j]=Math.min((t[i][j-coins[i-1]])+1,t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        
        if(t[M][sum]==Integer.MAX_VALUE-1){
            return -1;
        }
        
        return t[M][sum];
    }
}
