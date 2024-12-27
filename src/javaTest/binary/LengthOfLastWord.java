package javaTest.binary;

public class LengthOfLastWord {

	public static void main(String args[]) {
		
		String temp="Hello world to you";
		
		int result= findLength(temp);
		System.out.println(result);
	}

	private static int findLength(String temp) {
		
		String arr[]=temp.split(" ");
		
		return arr[arr.length-1].length();
	}
}
