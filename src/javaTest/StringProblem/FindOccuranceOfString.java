package javaTest.StringProblem;

import java.util.HashMap;

public class FindOccuranceOfString {

	public static void main(String args[]) {
		String str=" praveen kumar";
		//1. using hashmap
		HashMap<Character,Integer> res= findOccurance(str);
		System.out.println(res.toString());
		//2. using recursion
		HashMap<Character,Integer> hm= new HashMap<>();
		HashMap<Character,Integer> res2= findOccuranceRecursion(hm,str);
		System.out.println(res2.toString());
	}
	
	private static HashMap<Character,Integer> findOccurance(String str){
		HashMap<Character,Integer> hm= new HashMap<>();
		for(int i=0;i<str.length();i++) {
			
			Character ch= str.charAt(i);
			if(ch.equals(' ')){
				continue;
			}
			
			if(hm.containsKey(ch)) {
				int count=hm.get(ch);
				hm.put(ch, ++count);
			}else {
				hm.put(ch, 1);
			}
		}
		return hm;
	}
	
	private static HashMap<Character,Integer> findOccuranceRecursion(HashMap<Character,Integer> hm,String str){
		
		if(str.isEmpty()) {
			return new HashMap<>();
		}
			Character ch= str.charAt(0);
			
			if(hm.containsKey(ch)) {
				int count=hm.get(ch);
				hm.put(ch, ++count);
				hm.putAll(findOccuranceRecursion(hm,str.substring(1)));
			}else {
				hm.put(ch, 1);
				hm.putAll(findOccuranceRecursion(hm,str.substring(1)));
			}
		return hm;
	}
	
}
