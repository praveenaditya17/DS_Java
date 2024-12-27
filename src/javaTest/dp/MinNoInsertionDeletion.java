package javaTest.dp;

public class MinNoInsertionDeletion {

	public int minInsertionAndDeletion(String str1, String str2) {
        // Code here
        int l1=str1.length();
        int l2=str2.length();
        int t[][]=new int[l1+1][l2+1];
        
        for (int i = 0; i <= l1; i++) {
        	for(int j=0;j<=l2;j++) {
        		if(i==0||j==0) {
        			t[i][j]=0;
        		}
        	}
        }
        
        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j] =  Math.max(t[i][j - 1],t[i - 1][j]);
                }
            }
        }
        int temp=t[l1][l2];
        
        return temp;
        
    }
	
	public static void main(String args[]) {
		String str1="geeka";
		String str2="geseks";
		MinNoInsertionDeletion dis= new MinNoInsertionDeletion();
		int result =dis.minInsertionAndDeletion(str1,str2);
		int inserion=str1.length()-result;
		int deletion=str2.length()-result;
		System.out.println("no if insertion "+inserion);
		System.out.println("no if deletion "+deletion);

	}
}
