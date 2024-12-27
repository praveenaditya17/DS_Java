package javaTest.StringProblem;

import java.util.Stack;

public class ValidParantheses {
	public static void main(String args[]) {
		//boolean b = isValid("()[]");
		//System.out.println(b);
		int arr[]= {2,1};
		int res=maxProfit(arr);
		System.out.println(res);
	}

	static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();

		if (!(s.length() % 2 == 0))
			return false;

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				st.push(s.charAt(i));

			if (s.charAt(i) == '{')
				st.push(s.charAt(i));

			if (s.charAt(i) == '[')
				st.push(s.charAt(i));
			if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && st.size() == 0) {
				return false;
			}

			if ((s.charAt(i) == ')' && '(' == st.pop())) {
				count++;
			}
			if (s.charAt(i) == '}' && '{' == st.pop()) {
				count++;
			}
			if ((s.charAt(i) == ']' && '[' == st.pop())) {
				count++;
			}

		}
		if (count == s.length() / 2)
			return true;
		else
			return false;

	}
	static int maxProfit(int[] prices) {

        int newPrice=0;
        int maxPrice=Integer.MAX_VALUE;
        int result=0;
     for(int i=0;i<prices.length-1;i++){
// {7,6,4,3,1};
        maxPrice=Integer.MAX_VALUE;
         for(int j=i+1;j<prices.length;j++){

        	 
             if(prices[j]<prices[i]){
                 newPrice=prices[j];
                 if(maxPrice>newPrice){
                     maxPrice=newPrice;
                 }
             }
             if(maxPrice<prices[j]){
                 newPrice=prices[j]-maxPrice;
                 if(newPrice>result)
                    result=newPrice;
                 
             }
         }
         

     }  
     return result; 
    }
}
