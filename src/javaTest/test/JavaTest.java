package javaTest.test;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTest {

	public static void main(String args[]) {
		//System.out.println("hello world");
		
		List<Integer> arrayList= Arrays.asList(12,4,52,4,3,32,45,66,19,80,80);
		//List<Integer> withoutduplicate =arrayList.stream().filter(i->Collections.frequency(arrayList, i) <2).collect(Collectors.toList());
		
		
		List<Integer> even= arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("even no"+even);
		
		
		
		List<Integer> withoutDoublicate= arrayList.stream().distinct().collect(Collectors.toList());
		List<Integer> dis2= arrayList.stream().filter(a->Collections.frequency(arrayList, a)<2).collect(Collectors.toList());
		System.out.println(dis2);
		System.out.println(withoutDoublicate);
	}
}
