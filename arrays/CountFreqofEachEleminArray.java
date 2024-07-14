package com.pavitrabk.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFreqofEachEleminArray {

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3,3,3};
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
			hm.put(arr[i],1);
			}
		}
		//System.out.println(hm);
		
		for(Map.Entry<Integer, Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
