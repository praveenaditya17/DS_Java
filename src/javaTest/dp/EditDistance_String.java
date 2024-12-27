package javaTest.dp;

public class EditDistance_String {
	public int editDistance(String str1, String str2) {
        // Code here
        int l1=str1.length();
        int l2=str2.length();
        int t[][]=new int[l1+1][l2+1];
        
        for (int i = 0; i <= l1; i++) 
            t[i][0] = i;
        for (int j = 0; j <= l2; j++) 
            t[0][j] = j;
        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=t[i-1][j-1];
                }else{
                    t[i][j] = 1 + Math.min(t[i][j - 1], Math.min(t[i - 1][j], t[i - 1][j - 1]));
                }
            }
        }
        int temp=t[l1][l2];
        
        return temp;
        
    }
	
	public static void main(String args[]) {
		String str1="geek";
		String str2="gesek";
		EditDistance_String dis= new EditDistance_String();
		int result =dis.editDistance(str1,str2);
		System.out.println(result);

	}
}
