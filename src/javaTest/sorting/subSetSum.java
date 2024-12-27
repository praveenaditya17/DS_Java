package javaTest.sorting;

public class subSetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-1,0};
		int k=0;
		int result=subSetSum(arr,k);
		System.out.print(result);
	}

	private static int subSetSum(int[] nums, int k) {
			
		 int sum=0;
	        int count =0;
	        for(int i=0;i<nums.length;i++){
	            sum=0;
	            for(int j=i;j<nums.length;j++){
	                sum=sum+nums[j];
	                if(sum==k){
	                    count++;
	                }
	
	            }
	        }
	        return count;
	}

}
