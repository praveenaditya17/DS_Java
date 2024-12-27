package javaTest.array;

public class Search_in_Row_Column_sorted_matrix {

	public static void main(String[] args) {
		
		int mat[][] = {{3, 30, 38},{20, 52, 54},{35, 60, 69}};
		
		boolean result =matSearch(mat,30);
		System.out.println(result);

	}
	public static boolean matSearch(int mat[][], int x) {        
        int m=mat.length;
        int n=mat[0].length;
        
        int i=0;
        int j=n-1;
        
        while(i<m && j>=0){
            
            if(mat[i][j]==x){
                return true;
            }
            
            else if(mat[i][j]>x){
                j--;
            }
            else{
                i++;
            }
            
        }
        return false;
    }

	//time complexity 0(m+n)
}
