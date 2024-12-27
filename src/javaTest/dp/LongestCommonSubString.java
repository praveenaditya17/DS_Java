package javaTest.dp;

public class LongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABCDGH";
		String str2="ACDGHR";
		int res=new LongestCommonSubString().longestCommonSubstr(str1,str2);
		System.out.println(res);
	}
	public int longestCommonSubstr(String str1, String str2) {
        // code here
        
        int t[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
        int result=0;
        for(int i=1;i<str1.length()+1;i++){
            for(int j=1;j<str2.length()+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                    result=Math.max(result,t[i][j]);
                }else{
                    t[i][j]=0;
                }
            }
        }
        return result;
    }
}
