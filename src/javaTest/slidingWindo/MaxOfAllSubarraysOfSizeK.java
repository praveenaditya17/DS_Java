package javaTest.slidingWindo;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxOfAllSubarraysOfSizeK {
    private static int[] maxofAllSubarray(int[] a, int k) {
        int n = a.length;
        int[] maxOfSubarrays = new int[n-k+1];
        int idx = 0;

       ArrayList<Integer> list = new ArrayList<>();
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < n; windowEnd++) {
        	
        	while(list.size()>0 && list.get(list.size()-1)<a[windowEnd]) {
        		list.remove(list.size()-1);
        	}
        	
        	list.add(a[windowEnd]);

            if(windowEnd-windowStart+1 == k) { // We've hit the window size. Find the maximum in the current window and Slide the window ahead
                int maxElement = list.get(0);
                maxOfSubarrays[idx++] = maxElement;

                if(maxElement == a[windowStart]) { // Discard a[windowStart] since we are sliding the window now. So it is going out of the window.
                    list.remove(0);
                }

                windowStart++; // Slide the window ahead
            }
        }
        return maxOfSubarrays;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        int k = keyboard.nextInt();
        keyboard.close();
        
        int[] result = maxofAllSubarray(a, k);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }    
        System.out.println();
    }
}
