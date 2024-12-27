package javaTest.StringProblem;


public class ReverseString {
	public static void main(String args[]) {
		String name="Praveen";
		System.out.println(reverse(name,name.length()-1));
		System.out.println(reverse2(name));
	}
	
	private static String reverse(String name,int length) {
		
		if(length<0) {
			return "";
		}
		char res=name.charAt(length);
		String temp="";
		temp=res+"";
		return temp+reverse(name,--length);

	}
	private static String reverse2(String name) {
		
		if(name.isEmpty()) {
			return name;
		}
		
		return reverse2(name.substring(1))+name.charAt(0);

	}
}
