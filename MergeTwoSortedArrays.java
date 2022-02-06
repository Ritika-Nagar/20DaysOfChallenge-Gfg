package Sorting_Questions;

public class MergeTwoSortedArrays {
	
	static void Merge(int [] nums1, int m, int [] nums2, int n) {
		int [] x=new int [m+n];
		int k=0;
		int i=0;
		int j=0;
		while( i<m&& j<n) { // dono i and j , apne apne arrays ke ander hone chahiye , agar koi bhi bhaar aag gya , toh mai loop ko rok dungi
				if(nums1[i]<=nums2[j] ) {
					x[k]=nums1[i];
					i++;
					}
				else {
					x[k]=nums2[j];
					j++;
					
				}
				k++;
				}
		
		while(i<m) {
			x[k]=nums1[i];
			i++;
			k++;
		}
		while(j<n) {
			x[k]=nums2[j];
			j++;
			k++;
		}
		
		

		for(int y =0,z=0; y<x.length; y++,z++){
			nums1[z]=x[y];
			
		}
			
		
	}

	public static void main(String[] args) {
		int [] nums= {1,2,2,3,4,0,0,0};
		int [] arr= {5,6,7};
		Merge(nums,8,arr,3);
	
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+",  ");
		}
		

	}

}
