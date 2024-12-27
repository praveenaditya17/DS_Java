package javaTest.StringProblem;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllsubstrings {

	//[a, ab, abc, ac, b, bc, c]
	public static void main(String arg[]) {
		
		String res="abc";
		printSubString(res,"");
		ArrayList<String> result =printSubString2(res,"");
		Collections.sort(result);
		result.remove(0);
		System.out.println(result);
	}

	private static void printSubString(String res, String s) {

		if(res.isEmpty()) {
			System.out.println(s);
			return;
		}
		char ch=res.charAt(0);
		
		printSubString(res.substring(1),s+ch);
		printSubString(res.substring(1),s);
	}
	
	private static ArrayList<String> printSubString2(String res, String s) {

		if(res.isEmpty()) {
			ArrayList<String> list= new ArrayList<String>();
			list.add(s);
			return list;
		}
		char ch=res.charAt(0);
		
		ArrayList<String> left=printSubString2(res.substring(1),s+ch);
		ArrayList<String>right=printSubString2(res.substring(1),s);
		left.addAll(right);
		return left;
	}
}
