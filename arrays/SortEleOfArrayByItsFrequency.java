package com.pavitrabk.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortEleOfArrayByItsFrequency {

	public static void main(String[] args) {
		int[] arr = {2,2,1,1,3,3,3,4};
		frequency(arr);
		

	}
	
	static void frequency(int[] arr)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}else
			{
				hm.put(arr[i], 1);
			}
		}
		int max = 0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet())
		{
			
			max = Math.max(max, entry.getValue());
		System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		System.out.println(max);
	}

}
