package javaTest.binary;

public class FibonacciSerisOfNo {

	public static void main(String[] args) {

		int n1=0;
		int n2=1;
		System.out.println(fibo(7,n1,n2));
	}
	private static int fibo(int n,int n1,int n2) {
		
		if(n==0) {
			return n2;
		}
		int temp=n2;
		
		n2=n1+n2;
		n1=temp;
		return fibo(--n,n1,n2);
				
		// 0,1,1,2,3,5,8,13,21
	}

}
