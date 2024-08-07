package com.pavitrabk.recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,55,66,78};
		int target = 55;
		System.out.println(bs(arr, target, 0, arr.length - 1));
	}
	
	static int bs(int[] arr, int target, int s, int e) {
		
//		if(s > e){
//			return -1;
//		}
		
		int m = s + (e - s) / 2;
		
		if(target == arr[m]) {
			return m;
		}
		if(target < arr[m]) {
			return bs(arr, target, s, m - 1);
		}
		
			return bs(arr, target, m + 1, e);
	}

}
