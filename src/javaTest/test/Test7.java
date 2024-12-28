package javaTest.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

	//first not repeated character
	public static void main(String args[]) {
		String s="abca";



		List<Character> list = new ArrayList();



		for(int i=0;i<s.length();i++)

			list.add(s.charAt(i));





		Character  c = list.stream().filter(i->Collections.frequency(list,i)==1).collect(Collectors.toList()).get(0);
		System.out.println(c);
	}
}
