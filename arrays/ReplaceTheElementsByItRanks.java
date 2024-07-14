package com.pavitrabk.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReplaceTheElementsByItRanks {

	public static void main(String[] args) {
		int[] arr = {20,15,26,2,98,6};
		
		for(int i=0; i<arr.length; i++)
		{
			HashSet<Integer> hs = new HashSet<>();
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j] < arr[i])
				{
					hs.add(arr[j]);
				}
			}
			
			int rank = hs.size()+1;
			System.out.print(rank + " ");
		}
		

//		HashMap<Integer, Integer> hm = new HashMap<>();
//		int[] brr = new int[arr.length];
//		int temp = 1;
//		for(int i=0; i<arr.length; i++)
//		{
//			brr[i] = arr[i];
//		}
//		Arrays.sort(brr);
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(hm.get(brr[i]) == null)
//			{
//				hm.put(brr[i], temp);
//				temp++;
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(hm.get(arr[i]) + " ");
//		}
	}

}
