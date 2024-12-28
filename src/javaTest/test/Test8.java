package javaTest.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test8 {
	
	public static void main(String args[]) {
		
		
		//
		
		List<Integer> list = Arrays.asList(1,1,3,6,4,6,4,23,45,23,7,5,9,3);
		
		
		Set<Integer> result= list.stream().filter(i->Collections.frequency(list,i)>=1).collect(Collectors.toSet());
		
		Set<Integer> result2= list.stream().collect(Collectors.toSet());
		
		System.out.println(result);
		System.out.println(result2);
		
		
		//Custormer --> name,countary
		
		
	//	select name,countary,count(*) as t from customer group by countary  having t>=10;
		
		
		
	}

}
