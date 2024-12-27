package javaTest.array;

public class Search_in_sorted_Matrix {

	public static void main(String[] args) {

		Search_in_sorted_Matrix s= new Search_in_sorted_Matrix();
		
		int mat[][]={{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
		boolean result=s.searchMatrix(mat,14);
		
		System.out.println(result);
	}
	public boolean searchMatrix(int[][] mat, int x) {
		int m=mat.length;
	    int n=mat[0].length;
	    
	    int i=0;
	    while(i<m){
	        
	        if(x<=mat[i][n-1]){
	            
	            int start=0;
	            int end=n-1;
	            while(start<=end){
	                int mid=start+(end-start)/2;
	                
	                if(mat[i][mid]==x){
	                    return true;
	                }else if(mat[i][mid]<x){
	                    start=mid+1;
	                }else{
	                    end =mid-1;
	                }
	            }
	            
	        }
	        i++;
	        
	    }
	    return false;
	}	
	// above code time complexity is n*log(n) 
	
	// best way is log(n) using binary search

}
