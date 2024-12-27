package javaTest.dp;

public class LongestPalindromeInSubString {
	
	public static void main(String args[]) {
		String S="abc";
		String res=longestPalin(S);
		System.out.println(res);
	}
	static String longestPalin(String str){
		
		if(str.length()<=1) {
			return str;
		}
		
		String LPS="";
		
		for(int i=1;i<str.length();i++) {
			int low=i;
			int high=i;
			
			//consider for odd length
			while(str.charAt(low)==str.charAt(high)) {
				low--;
				high++;
				
				if(low==-1 || high==str.length()) {
					break;
				}
			}
			String palindrome=str.substring(low+1,high);
			if(LPS.length()<palindrome.length()) {
				LPS=palindrome;
			}
			
			//consider for even length
			low=i-1;
			high=i;
			while(str.charAt(low)==str.charAt(high)) {
				low--;
				high++;
				
				if(low==-1 || high==str.length()) {
					break;
				}
			}
			palindrome=str.substring(low+1,high);
			if(LPS.length()<palindrome.length()) {
				LPS=palindrome;
			}
		}
		if(LPS.length()==1){
		    LPS=str.substring(0,1);
		}
		
	return LPS;
	}

}
