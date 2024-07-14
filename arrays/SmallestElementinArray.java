package com.pavitrabk.arrays;

import java.util.Arrays;

public class SmallestElementinArray {

	public static void main(String[] args) {
		int[] arr = {2,5,8,3,9,0};
//		Arrays.sort(arr);
//		System.out.println(arr[0]);
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
