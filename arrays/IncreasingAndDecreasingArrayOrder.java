package com.pavitrabk.arrays;

import java.util.Arrays;

public class IncreasingAndDecreasingArrayOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,8,9};
		//int[] res = new int[arr.length];
		int n = arr.length;
		
		for(int i=0; i<n/2; i++)
		{
			System.out.print(arr[i]+" ");		
		}
		
		for(int i=n-1;i>=n/2;i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
