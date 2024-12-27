package javaTest.array;

import java.util.ArrayList;

public class Spirally_traversing_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spirally_traversing_matrix s= new Spirally_traversing_matrix();
		int mat[][]={{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
		ArrayList<Integer>  result=s.spirallyTraverse(mat,3,3);
		
		System.out.println(result);
	}
	
	public ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 

       ArrayList<Integer> list = new ArrayList<>();
       int i=0,j=0;
       int m=r-1,n=c-1;
    
        while(i<=m && j<=n){
            
           for(int k=i;k<=n;k++){
               list.add(matrix[i][k]);
           }
           i++;
         
           for(int k=i;k<=m;k++){
               list.add(matrix[k][n]);
           }
           n--;
           if(i<=m){
          for(int k=n;k>=j;k--){
              list.add(matrix[m][k]);
          }
           
          m--;
           }
           if(j<=n){
          for(int k=m;k>=i;k--){
             // System.out.println("n");
              list.add(matrix[k][j]);
          }
         j++;
           }
        }
        return list;
    }

}
