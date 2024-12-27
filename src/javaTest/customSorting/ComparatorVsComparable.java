package javaTest.customSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorVsComparable {

	public static void main(String args[]) {
		
		List<Employee> list =new ArrayList<>();
		
		Employee e1= new Employee(105,"raj",9087.90);
		Employee e2= new Employee(102,"aditya",5087.90);
		Employee e3= new Employee(103,"shiv",3087.90);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
		
		// sorting 
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("-- sorring on the basic of salary-------- in decending order");
		System.out.println(list);
		
		// sorting on the basic of name and id
		Collections.sort(list,new SortingOnId());
		System.out.println("--  sorting on the basic of name and id");
		Collections.sort(list,new SortingOnName());
		System.out.println(list);
	}
	
}