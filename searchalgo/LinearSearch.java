package com.pavitrabk.searchalgo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int target = 5;
		int index = linear(arr,target);
		System.out.println(index);

	}
	
	static int linear(int[] arr, int target)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}

}
