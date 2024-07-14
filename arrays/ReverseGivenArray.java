package com.pavitrabk.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseGivenArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		
		reverseArray(arr,n,0,n-1);
		printArray(arr,n);
	}
	
	static void printArray(int[] arr, int n)
	{
		System.out.print("Reversed Array is: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static void reverseArray(int[] arr,int n,int start, int end)
	{
		while(start < end)
		{
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
			Collections.reverse(Arrays.asList(arr));	
		}
		printArray(arr,n);
	}

}
