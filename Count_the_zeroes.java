package arrays_questions;

public class Count_the_zeroes {
	static int countZeroes(int[] arr, int n) {
        int i=0;
        int j=n-1;
        
        if(arr[i]==0){
            return n;
        }else {
        
        int mid=i+(j-i)/2;
        while(i<=j){
           if(arr[mid]==1){
        	   if(arr[mid+1]==0) {
        		   
        		   return n-(mid+1);
        	   }
        	   
               i=mid+1;
           }
           else{
               if(arr[mid-1]==1) {
            	   return n-mid;
               }
               j=mid-1;
              
          }
          mid=i+(j-i)/2;
          
        }
        }
        return 0;
        
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,1,1,1,0,0,0,0,0,0,0};
		System.out.println(countZeroes(arr,arr.length));
	}

}
