package javaTest.array;



public class SecondMax {
	public static void main(String args[]) {
		int arr[]= {12, 34, 10, 6, 40};
		
		int smax=smax2(arr);
		System.out.println(smax);
	}
    public static int smax(int[] arr) {

        int smax=-1;
        int max=-1;
        int temp=-1;
        
        for(int i:arr){
            if(max<i){
                temp=max;
                max=i;
                
            }
            if(i<max && i>smax){
                smax=i;
            }
        }
        if(temp>smax)
                    smax=temp;

        
        return smax;
    }
    
    public static int smax2(int[] arr) {

        int smax=-1;
        int max=-1;
        
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
       
         for(int i:arr){
           
             if(i!=max && i>smax){
                 smax=i;
             }
         }
        
        return smax;
    }
    
}
