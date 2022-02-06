package Sorting_Questions;

import java.util.ArrayList;

public class ReverseArray {
	static void swap(ArrayList<Integer> arr, int i ,int j) {
		int temp=arr.get(i);
		arr.set(i,arr.get(j) );
		arr.set(j,temp);
		
	}
	static void reverse(ArrayList<Integer> arr, int n) {
		int s=0;
		int e=n-1;
		
		while(s<=e) {
			
			swap(arr,s,e);
			s++;
			e--;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,3,2,1};
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",  ");
		}
	}

	}


