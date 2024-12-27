package javaTest.array;

public class maxValuePrint {
	
	public static void main(String args[]) {
		
		String arr[]= {"hello","hello1","hell"};
		int n=3;
	
		int min=Integer.MAX_VALUE;
        int count=0;
        String res="";
        char ch[]=arr[0].toCharArray();
        String s="";
        int j=0,k=0;
        for(int i=1;i<n;i++){
        	char ch1[]=arr[i].toCharArray();
            while(j<ch.length && k<arr[i].length()){
                
                if(ch[j]==ch1[k++]){
                    count++;
                    s=s+ch[j++];
                }
            }
            j=0;
            k=0;
            if(min>count){
                res=s;
                min=count;
            }
            count=0;
            s="";
        }
        if(min==0) {
        	System.out.println("-1");
        }
        System.out.println(res);
	
   // System.out.println(hm);
	}
}
