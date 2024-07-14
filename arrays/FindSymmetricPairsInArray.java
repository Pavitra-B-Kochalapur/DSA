package com.pavitrabk.arrays;

import java.util.HashMap;

public class FindSymmetricPairsInArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,1},{3,4},{4,3},{2,5},{6,5}};
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			int first = arr[i][0];
//			int second = arr[i][1];
//			if(hm.get(second)!=null && hm.get(second) == first)
//			{
//				System.out.println(first+" "+second);
//			}else {
//				hm.put(first, second);
//			}
//		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if((arr[j][0] == arr[i][1]) && (arr[j][1] == arr[i][0]))
				{
					System.out.print("("+arr[i][1]+" "+arr[i][0]+")"+" ");
					//break;
				}
			}
		}

	}

}
