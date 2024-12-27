package javaTest.sorting;

public class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
        int n1=m-l+1;
        int n2=r-m;
        int arr1[]= new int[n1];
        int arr2[]= new int[n2];
        int i,j,k;
        
        for( i=0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for( j=0;j<n2;j++){
            arr2[j]=arr[m+j+1];
        }
    
       
        //arr1[i]=Integer.MAX_VALUE;
        //arr2[j]=Integer.MAX_VALUE;
        
        i=0;
        j=0;
         k=l;
        while(i<n1 && j<n2) {
        	if(arr1[i]<arr2[j]) {
        		arr[k++]=arr[i];
        		i++;
        	}
        	else {
        		arr[k++]=arr[j];
        		j++;
        	}
        }
        while(i<n1) {
        	arr[k++]=arr1[i];
        	i++;
        }
        while(j<n2) {
        	arr[k++]=arr1[j];
        	j++;
        }
        
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    
    public static void main(String args[]) {
    	int arr[]= {2,3,4,1,6};
    	Solution s= new Solution();
    	s.mergeSort(arr,0,4);
    	for(int x=0;x<=4;x++)
        	System.out.println(arr[x]);
    }
}


