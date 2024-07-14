package com.pavitrabk.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,2,5,5};
		int n = arr.length;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<n; i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}else
			{
				hm.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : hm.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
		
		
//		Arrays.sort(arr);
//		for(int i=0; i<n-1; i++)
//		{
//			if(arr[i] != arr[i+1])
//			{
//				System.out.print(arr[i] + " ");
//			}
//		}

	}

}
