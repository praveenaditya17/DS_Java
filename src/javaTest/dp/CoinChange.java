package javaTest.dp;

// maximum no. of ways to sum K
public class CoinChange {

	public static void main(String args[]) {
		int coin[]= {1,2,3};
		int N=3;
		int sum=4;
		CoinChange c= new CoinChange();
		long result =c.count(coin, N, sum);
		System.out.println(result);
	}
	public long count(int coins[], int N, int sum) {
        // code here.
        
        long t[][]= new long[N+1][sum+1];
        
        for(int i=0;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=1;
                }
            }
        }
        
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                
                if(coins[i-1]<=j){
                    t[i][j]= t[i][j-coins[i-1]]+t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
                
            }
        }
        return t[N][sum];
    }
}
