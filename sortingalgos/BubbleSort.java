package com.pavitrabk.sortingalgos;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		int n = arr.length;
		
		for(int i=0; i<n;i++)
		{
			for(int j=1; j<(n-i); j++)
			{
			if(arr[j-1] > arr[j])
			{
			int temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
			}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
