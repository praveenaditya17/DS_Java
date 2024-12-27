package javaTest.dp;

public class KnapsackUnbounded {
	public static void main(String args[]) {
		
		int val[]= {1,1};
		int wt[]= {2,1};
		int N=2;
		int W=3;
		int result =knapSack(N,W,val,wt);
		System.out.println(result);
	}
	static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        
        int t[][]=new int[N+1][W+1];
        
        for(int i=0;i<N+1;i++){
            for(int j=0;j<W+1;j++){
                
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
         for(int i=1;i<N+1;i++){
            for(int j=1;j<W+1;j++){
                
                if(wt[i-1]<=j){
                    
                    t[i][j]=Math.max(val[i-1]+t[i][j-wt[i-1]],t[i-1][j]);// here only change for unbounded kanpsack 
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
         }
         
         return t[N][W];
        
        
    }
}
