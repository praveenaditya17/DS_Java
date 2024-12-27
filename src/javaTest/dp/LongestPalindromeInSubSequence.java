package javaTest.dp;

public class LongestPalindromeInSubSequence {
	public static void main(String args[]) {
		String S="bbabcbcab";
		String res=longestPalin(S);
		System.out.println(res);
	}
	static String longestPalin(String S){
        // code here
        StringBuffer sb= new StringBuffer(S);
        sb.reverse();
        String b=sb.toString();
        int result=0;
        int l=S.length();
        int t[][]=new int[l+1][l+1];
        for(int i=0;i<l+1;i++){
            for(int j=0;j<l+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
        
        for(int i=1;i<l+1;i++){
            for(int j=1;j<l+1;j++){
                if(S.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                    result=Math.max(result, t[i][j]);
                }else{
                    t[i][j]=Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
        for(int i=0;i<l+1;i++){
            for(int j=0;j<l+1;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(result);
        int i=l,j=l;
        String res="";
        while(i>0 && j>0){
            if(S.charAt(i-1)==b.charAt(j-1)){
               // System.out.println(t[i][j]);
                res=res+S.charAt(i-1);
                i--;
                j--;
            }else{
                if(t[i][j-1]>=t[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }
        }
        return res;
    }
}
/*
  	a a a a b b a a
a 0 0 0 0 0 0 0 0 0 
a 0 1 1 1 1 1 1 1 1 
b 0 1 2 2 2 2 2 2 2 
b 0 1 2 2 2 3 3 3 3 
a 0 1 2 2 2 3 4 4 4 
a 0 1 2 3 3 3 4 4 4 
a 0 1 2 3 4 4 4 4 4 
a 0 1 2 3 4 5 5 5 5 
a 0 1 2 3 4 5 6 6 6 

*/
