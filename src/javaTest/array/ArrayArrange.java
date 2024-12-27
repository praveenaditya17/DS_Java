package javaTest.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrange {

	public static void main(String[] args) {

		ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        int arr[]= {10,-2,4,34,5-4,-5};
        
        for(int a:arr){
            if(a<0){
                list2.add(a);
            }
            else{
                list1.add(a);
            }
        }
        int i=0;
        while(list1.size()>0){
            arr[i]=list1.get(0);
            list1.remove(0);
            i++;
        }
        //int j=0;
        while(list2.size()>0){
            arr[i]=list2.get(0);
            list2.remove(0);
            i++;
        }
    
        for(int i1=0;i1<arr.length;i1++)
        	System.out.println(arr[i1]);
        
        int k=29;
    	
    	int j=k/10;
    	int m=k%10;
    	
//    	if(m<=5) {
//    		return j*10;
//    	}
//    	else {
//    		return (j+1)*10;
//    	}
    	
    	System.out.println(m);
    	System.out.println(j);
    	
    	System.out.println("-------");
    	String str[]= {"a","b","c"};
    	Arrays.stream(str).peek(System.out::print).count();
	}
	
	

}
