package javaTest.test;

import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// fibbonaci series of 15
		
		
		// 0,1,1,2,....
		int i=0,j=1;
		int k=0;
		int n=0;
		System.out.println(i);
		System.out.println(j);
		while(n<5)
		{
			k=i+j;
			i=j;
			j=k;
			System.out.println(j);
			n++;
		}
		
		// "cbappaleb"
		
		String str= "cbappaleb";
		
		Set<Character> s=new HashSet<>();
		
		
		
		for(int m=0;m<str.length()-1;m++) {
			
			Character ch = str.charAt(m);
			for(int z=1;z<str.length();z++){
				Character ch2=str.charAt(z);
				
				if(ch.equals(ch2)) {
					System.out.println("--"+m);
					break;
				}
				
			}
		}
		
		 // 5k to 10   e_id,e_name,e_dept_id,e_salary
		
		
		//select  e_id,e_name,e_dept_id,e_salary from employee where e_salary > 5000 and esalary < 10000  group by e_dept;
		
		//SOLID

		
//		public interface A{
//			
//			// some mthiod
//		}
		
		
//		@Component("bclass")
//		public class B implements A{
//			
//		}
//		
//		@Component("cclass")
//		public class C implements A{
//			
//		}
//		
//		
//		@
//		@Qualifier("bclass")
//		public A a;
		
	}

}
