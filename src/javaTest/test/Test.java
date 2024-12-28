package javaTest.test;

public class Test {

	public static void main(String args[]) {
		
		char ar[]= new char[10];
		
	byte s=127;
	s++;
	s++;
	System.out.println(s);
	
	String st="1234";
	st=st.toLowerCase();
    for(char ch= 'a';ch<='f';ch++){
    	char c=st.charAt(0);
        int x=c-'0';
        System.out.println(x);
      if(st.contains(ch+""))
       System.out.println("Yes");
    }
	
	}
}
