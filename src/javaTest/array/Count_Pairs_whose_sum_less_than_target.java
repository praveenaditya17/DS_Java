package javaTest.array;

import java.util.Arrays;

public class Count_Pairs_whose_sum_less_than_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 7, -1, 5}, target = 6;
		
		int count=new Count_Pairs_whose_sum_less_than_target().countPairs(arr, target);
		System.out.println(count);
	}
	int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]<target){
                count+=j-i;
                i++;
            }
            else{
                j--;
            }
        }
       return count; 
    }
}
