package com.pavitrabk.arrays;

import java.util.Arrays;

public class RotateArrayByLeftAndRight {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int k = 2;
		k = k%arr.length;
		leftRotate(arr,0,arr.length-1);
		leftRotate(arr,0,k-1);
		leftRotate(arr, k, arr.length-1);	
//		System.out.println(Arrays.toString(arr));
		
		rightRotate(arr, 0, arr.length-k-1);
		rightRotate(arr, arr.length-k, arr.length-1);
		rightRotate(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void leftRotate(int[] arr,int start, int end)
	{
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		
	}
	
	static void rightRotate(int[] arr,int start, int end)
	{
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		
	}

}
