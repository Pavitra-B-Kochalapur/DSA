package com.pavitrabk.sortingalgos;

import java.util.Arrays;

//Cyclic sort is used only when you have array within range like (0 t0 N) or (1 to N)
public class CyclicSort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,5,9,7,8};
		cyclic(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void cyclic(int[] arr)
	{
		int i = 0;
		while(i<arr.length)
		{
			int correctIndex = arr[i] - 1;
			if(arr[i] != arr[correctIndex])
			{
				swap(arr,i,correctIndex);
			}else {
				i++;
			}
		}
	}
	
	static void swap(int[] arr, int first, int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
