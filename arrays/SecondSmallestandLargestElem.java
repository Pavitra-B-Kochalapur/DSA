package com.pavitrabk.arrays;

import java.util.Arrays;

public class SecondSmallestandLargestElem {

	public static void main(String[] args) {
		int[] arr = {5,6,7,2,8,9};
		int n = arr.length;
		int sS = secondSmallest(arr,n);
		int sL = secondLargest(arr,n);
		
		System.out.println("Second Smallest Element is: " + sS);
		System.out.println("Second Largest Element is: " + sL);
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("Second Smallest Element "+arr[1]);
//		System.out.println("Second Largest Element "+arr[arr.length-2]);
	}
		
		private static int secondSmallest(int[] arr, int n)
		{
		if(n < 2)
		{
			return -1;
		}
		
		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		for(int i=0;i<n; i++)
		{
			if(arr[i] < min)
			{
				second_min = min;
				min = arr[i];
			}else if(arr[i] < second_min  && arr[i] != min)
			{
				second_min = arr[i];
			}
		}
		return second_min;

	}
		
		private static int secondLargest(int[] arr, int n)
		{
		if(n < 2)
		{
			return -1;
		}
		
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for(int i=0;i<n; i++)
		{
			if(arr[i] > max)
			{
				second_max = max;
				max = arr[i];
			}else if(arr[i] > second_max  && arr[i] != max)
			{
				second_max = arr[i];
			}
		}
		return second_max;

	}


}
