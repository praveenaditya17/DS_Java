package javaTest.StringProblem;

public class PermutationOfString {
	public static void main(String args[]) {
		String str="abc";
		permutation("",str);
	}
	
	public static void permutation(String p,String str) {

		if(str.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch= str.charAt(0);
		for(int i=0;i<=p.length();i++) {
		String s=p.substring(0,i);//"","",
		String e=p.substring(i,p.length());//"",a
		permutation(s+ch+e,str.substring(1));//a,ba,cba,bca,bac

		}
		
		// a/bc
		//ab/c  ba/c
		//abc cab,acb
	}
}
