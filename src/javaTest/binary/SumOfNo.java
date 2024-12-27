package javaTest.binary;


public class SumOfNo {

	public static void main(String args[]) {
		
		System.out.println(sumOfNo(4));
	}
	private static int sumOfNo(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+sumOfNo(--n);
	}
}
