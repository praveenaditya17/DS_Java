package javaTest.dp;

// maximum no. of ways to change the coin  => unbounded kanpsack
public class MaxCoinChange {

	public static void main(String args[]) {
		
		int coins[]= {1,2,3}; 
		int sum=5;
		int n=3;
		
		int result=maxCoins(coins,n,sum);
		System.out.println(result);
	}

	private static int maxCoins(int[] coins, int n,int sum) {
		
		int t[][]=new int [n+1][sum+1];
		
		for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=1;
                }
                
            }
        }
   //  t[0][0] = 0;
 	
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){
                    t[i][j]=t[i][j-coins[i-1]]+t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        
        return t[n][sum];
	}
}
