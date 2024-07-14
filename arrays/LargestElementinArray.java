package com.pavitrabk.arrays;

import java.util.Arrays;

public class LargestElementinArray {

	public static void main(String[] args) {
		int[] arr = {2,5,7,9,8,3,10,20};
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-1]);
		
		int max = arr[0];
		for(int i=1;i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
