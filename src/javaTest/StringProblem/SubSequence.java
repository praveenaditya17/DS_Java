package javaTest.StringProblem;

public class SubSequence {

	// str=abc  --> a,ab,ac,b,bc,c,abc
	public static void main(String args[]) {
		String str="abc";
		
		subSequence1("",str);
	}

	static void subSequence1(String p,String up) {

		if(up.isEmpty()) {
			System.out.print(p+" ");
			return;
		}
		char ch=up.charAt(0);
		subSequence1(p+ch,up.substring(1));
		subSequence1(p,up.substring(1));

	}
}
