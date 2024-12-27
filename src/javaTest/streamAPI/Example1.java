package javaTest.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> arrayList= Arrays.asList(12,4,52,4,3,32,45,66,19,80,80);
		
//		find max value
		int max=arrayList.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(max);
		int maxValue= arrayList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxValue);
		int maxValue2=arrayList.stream().max((a,b)->a-b).get();
		System.out.println(maxValue2);
		int maxValue3= arrayList.stream().reduce((a, b)->a>b?a:b).get();
		System.out.println(maxValue3);
		
//		minimum value
		int min=arrayList.stream().sorted().findFirst().get();
		System.out.println(min);
		int minValue= arrayList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minValue);
		int minValue2=arrayList.stream().min((a,b)->a-b).get();
		System.out.println(minValue2);
		
		int minValue3=arrayList.stream().max((a,b)->b-a).get();
		System.out.println(minValue3);
		
//		get first 3 min
		List<Integer> ans=arrayList.stream().sorted().collect(Collectors.toList()).subList(0, Math.min(3, arrayList.size()));
		System.out.println(ans);
		//get last 3 max
		List<Integer> ans2=arrayList.stream().sorted((a,b)->a>b?-1:a<b?1:0).collect(Collectors.toList()).subList(0, Math.min(3, arrayList.size()));
		System.out.println(ans2);
		
//		find second maxium
		int secondMax=arrayList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondMax);
		
		
//		second lowest
		int secondLowest=arrayList.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);
		
//		find first 5 value from stream
		List<Integer> firtFive=arrayList.stream().limit(5).collect(Collectors.toList());
		System.out.println(firtFive);
		
//		sum of first five
		int sumOfFirstFive=arrayList.stream().limit(5).mapToInt(i->i).sum();
		System.out.println(sumOfFirstFive);
		
		int sumOfFirstFive2=arrayList.stream().limit(5).mapToInt(i->i).reduce((a, b)->a+b).getAsInt();
		System.out.println(sumOfFirstFive2);
		
//		sum of skip 5 no.
		int sumOfSkipFiveNo=arrayList.stream().skip(5).mapToInt(i->i).sum();
		System.out.println("sum of skip 5 no. "+sumOfSkipFiveNo);
		
//		print duplicate no from arrayList
		List<Integer> duplicate =arrayList.stream().filter(i->Collections.frequency(arrayList, i)>1).distinct().collect(Collectors.toList());
		System.out.println(duplicate);
		
//		print without duplicate no from arrayList
		List<Integer> withoutduplicate =arrayList.stream().filter(i->Collections.frequency(arrayList, i) <2).collect(Collectors.toList());
		System.out.println(withoutduplicate);
		
// 		print the value and its count using map with stream api without sorting
		Map<Integer,Long> valueWithCount= arrayList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(valueWithCount);
		
//		print the value and its count using map with stream api with same order 
		Map<Integer,Long> valueWithCount2= arrayList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(valueWithCount2);
		
		//print the value and its count using map with stream api with sorted key
		Map<Integer,Long> valueWithCount3= arrayList.stream().sorted().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(valueWithCount3);
		
		
		
		// map filter and  reduce need to understand 
		
		//Many times, we need to perform operations where a stream reduces to single resultant value, 
		//for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining 
		//all elements.

		
		
		// int array to arrayL
		
		int arr[]= {10,12,34,67};

		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    intList.add(i);
		}
		System.out.println(intList);
		
		// count character frequency in assending order of key
		String str="praveen kumar";
		Character[] c= new Character[str.length()];
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			c[i]=new Character(ch);
		}
		List<Character> listChar=Arrays.asList(c);
		Map<Character,Long>  mapChar=listChar.stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()));
		
		System.out.println(mapChar);
		
		
		String str2="Geeksforgeeks";

		//o/p : “gEEksfOrgEEks”
		Character[] charArray=new Character[str2.length()];
		for(int i=0;i<str2.length();i++) {
			charArray[i]=str2.charAt(i);
		}
		//Character charArray[]= {'p','r','a','v','e','e','n'};
		List<Character> l=Arrays.asList(charArray);
		// .map(w -> Character.toUpperCase(w.charAt(0))+w.substring(1))
		List res=l.stream().map(j->j.equals('o')||j.equals('e')?Character.toUpperCase(j):Character.toLowerCase(j)).collect(Collectors.toList());
		System.out.println(res);
		List res1=l.stream().map(j->Character.toUpperCase(j)).collect(Collectors.toList());
		System.out.println(res1);
		
		
	}

}
