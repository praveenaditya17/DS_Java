package javaTest.test;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="naman";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			Character ch = str.charAt(i);
				
				if(hm.containsKey(ch)) {
					hm.put(ch, hm.get(ch)+1);
				}
				else {
					hm.put(ch, 1);
				}
		}
		
		System.out.println(hm.toString());

	}

}
