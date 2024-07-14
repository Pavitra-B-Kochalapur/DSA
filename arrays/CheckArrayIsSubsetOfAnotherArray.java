package com.pavitrabk.arrays;

import java.util.HashMap;

public class CheckArrayIsSubsetOfAnotherArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,7,4};
		int[] arr2 = {1,2,3,4,5,};
		
		int m = arr1.length;
		int n = arr2.length;
		boolean ans = subset(arr1,arr2,n,m);
		
		if(ans == true)
		{
			System.out.println("arr1[] is subset of arr2[]");
		}else
		{
			System.out.println("arr1[] is not subset of arr2[]");
		}

	}
	
	static boolean subset(int[] arr1, int[] arr2, int n, int m)
	{
		if(m>n) return false;
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for(int i=0; i<n; i++)
		{
			hm.put(arr2[i], true);
		}
		
		for(int j=0; j<m; j++)
		{
			if(hm.containsKey(arr1[j]) == false)
			{
				return false;
			}
		}
		return true;
	}

}
