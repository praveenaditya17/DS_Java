package javaTest.dp;

// subset sum
public class SubSetSum {
	static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        
        boolean t[][] = new boolean[N+1][sum+1];
        for(int i=0;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0 ){
                    t[i][j]=false;
                }
                if(j==0){
                    t[i][j]=true;
                }
            }
        }
        
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                
                if(arr[i-1]<=j){
                
                    t[i][j]=(t[i-1][j-arr[i-1]]||t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        
        return t[N][sum];
    }
	
	public static void main(String args[]) {
		
		int N = 6;
		int		arr[] = {3, 34, 4, 12, 5, 2};
		int		sum = 9;
		
		System.out.print(isSubsetSum(N,arr,sum));
	}

}
