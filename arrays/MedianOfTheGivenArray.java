package com.pavitrabk.arrays;

import java.util.Arrays;

public class MedianOfTheGivenArray {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,3,5};
		Arrays.sort(arr);
		int n = arr.length;
		getMedian(arr, n);

	}
	
	public static void getMedian(int[] arr, int n)
	{
		
		if(n%2 == 0)
		{
			int ind1 = (n/2) - 1;
			int ind2 = (n/2);
			System.out.println((double)(arr[ind1] + arr[ind2]) / 2);
		}else
		{
			System.out.println(arr[(n/2)]);
		}
		
	}

}
