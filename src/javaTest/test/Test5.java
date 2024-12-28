package javaTest.test;

public class Test5 {

	
	public static void main(String args[]) {
		
		String str="abccbc";
		 
		//get all the substring which are palindrome
		
		
			//Test5 t= new Test5();
			for(int i=0;i<str.length();i++){
				
				for(int j=i;j<=str.length();j++) {
					
					String res= str.substring(i,j);
					//System.out.println(res);
					StringBuffer sb = new StringBuffer(res);
					sb.reverse();
					String res2= new String (sb);
					if(res.equals(res2))
						System.out.println(res);
				}
			}
		
		
	}
	
	
	
	
}
