package com.pavitrabk.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = {5,6,1,1,2,2,5,2,3,3};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			hs.add(arr[i]);
		}
		System.out.println(hs);
//		int k = removeDuplicates(arr);
//		for(int i=0; i<k; i++)
//		{
//			System.out.println(arr[i] + " ");
//		}
	}
	
//	public static int removeDuplicates(int[] arr)
//	{
//		int i =0;
//		for(int j=1; j<arr.length; j++)
//		{
//			if(arr[i] != arr[j])
//			{
//				i++;
//				arr[i] = arr[j];
//			}
//		}
//		return i+1;
//	}
}
