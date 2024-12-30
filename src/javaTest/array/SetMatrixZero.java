package javaTest.array;


class SetMatrixZero {
	public static void main(String args[]) {
		SetMatrixZero s= new SetMatrixZero();
		
		int mat[][]={{1,2,3},{4,0,6},{7,8,9}};
		for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            	System.out.print(mat[i][j]);
            	System.out.print(" ");
            }
            System.out.println("");
        }
		System.out.println("after set zero");
		s.setMatrixZeroes(mat);
		for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            	System.out.print(mat[i][j]);
            	System.out.print(" ");
            }
            System.out.println("");
        }
	}
    public void setMatrixZeroes(int[][] mat) {
        
        
        int m=mat.length;
        int n=mat[0].length;
        boolean isCoulunm=false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(mat[i][j]==0){
                    if(j==0){
                        isCoulunm=true;
                    }else{
                        mat[i][0]=0;
                        mat[0][j]=0;
                    }
                }
            }
        }
        
        //this is for if in first row value is 0 or first column value is zero so mark all zero 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][0]==0||mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }
        //this is for first row 
        if(mat[0][0]==0){
            for(int j=0;j<n;j++){
                mat[0][j]=0;
            }
        }
        //this is for fist column
        if(isCoulunm){
            for(int i=0;i<m;i++){
                mat[i][0]=0;
            }
        }
       
    }
}