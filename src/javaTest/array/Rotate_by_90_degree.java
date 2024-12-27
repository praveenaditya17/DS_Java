package javaTest.array;

public class Rotate_by_90_degree {

	public static void main(String[] args) {
		
		
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            	System.out.print(mat[i][j]);
            	System.out.print(" ");
            }
            System.out.println("");
        }
		rotateby90(mat);
		System.out.println("after roataion 90 degree");
		for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            	System.out.print(mat[i][j]);
            	System.out.print(" ");
            }
            System.out.println("");
        }

	}
	static void rotateby90(int mat[][]) {
        
        int n=mat.length;
        // transpose of array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(i<=j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        // 1st row to last row , so on..
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[n-1-i][j];
                mat[n-1-i][j]=temp;
            }
        }
    }

}
