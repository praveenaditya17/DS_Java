package javaTest.test;

class Test4 {
    public int removeDuplicates(int[] nums) {
        
        //int result =0;
       // boolean temp=false;
        int k=0;

        //1,-1,1,2
        //1,
        //0,1,
     /*   for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && nums[i] != -1){
                    nums[k]=nums[j];
                    nums[j]= -1;
                }
            }

            if(nums[i]!=-1)
                 k++;


        }*/
        
        int r=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[r]==nums[i]){
                continue;
            }else{
                nums[++r]=nums[i];
            }
        }
        
       



        return r+1;
    }
    
    public static void main(String args[]) {
    	int arr[]= {1,1,1,3,3,2,2};
    	Test4 t= new Test4();
    	int a=t.removeDuplicates(arr);
    	for(int i=0;i<a;i++) {
    		System.out.println(arr[i]);
    	}
    	
    }
}
