package javaTest.slidingWindo;

import java.util.HashMap;
import java.util.Map;

public class MaxSubString {

	
	// longest substring with k unique character
	
	public static void main(String args[]) {
		String s="aabacbebebe";
		int k=3;
		
		Map<Character,Integer> hm = new HashMap<>();
        int max=0;
        int j=0,i=0;
        while(j<s.length()){
            char c=s.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.size()>k){
                
                while(hm.size()>k){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                    if(hm.get(s.charAt(i))==0){
                        hm.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            if(hm.size()==k){
                if(max<(j-i+1)){
                    max=j-i+1;
                }
            }
            j++;
            
        }
        System.out.println(max);
	}
	
}
