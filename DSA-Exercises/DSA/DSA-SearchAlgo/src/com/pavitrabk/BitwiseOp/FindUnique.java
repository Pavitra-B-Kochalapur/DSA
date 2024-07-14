package com.pavitrabk.BitwiseOp;

public class FindUnique {

	public static void main(String[] args) {
//		int[] arr = {1,1,2,2,3,4,3,4,6};
		int[] arr = {1,1,1,2,3,4,2,2,3,4,3,4,8};
		System.out.println(ans(arr));
		

	}
//	static int ans(int[] arr) {
//		int unique = 0;
//		for(int i = 0; i<arr.length; i++) {
//			unique = arr[i];
//		
//		if(unique != arr[i]) {
//			break;
//		}
//		
//		}
//		return unique;
//	}

	 static int ans(int[] arr) {
		 int unique = 0;
		 
		 for(int n : arr) {
			 
			 unique ^= n;
			 
		 }
		 
		 return unique;	
		 
	}

}
