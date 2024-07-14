package com.pavitrabk.arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] arr = {1,2,-3,0,-4,-5};
		int ans = result(arr);
		System.out.println(ans);

	}
	
//	static int result(int[] arr)
//	{
//		int prod1 = arr[0], prod2 = arr[0], res = arr[0];
//		for(int i=0; i<arr.length; i++)
//		{
//			int temp = Math.max(arr[i], Math.max(prod1*arr[i], prod2*arr[i]));
//			prod2 = Math.min(arr[i], Math.min(prod1*arr[i], prod2*arr[i]));
//			prod1 = temp;
//			res = Math.max(res, prod1);
//		}
//		return res;
//	}
	
//	static int result(int[] arr)
//	{
//		int n = arr.length;
//		int pref = 1; 
//		int suf = 1;
//		int ans = Integer.MIN_VALUE;
//		
//		for(int i=0; i<n; i++)
//		{
//			if(pref == 0) pref = 1;
//			if(suf == 0)  suf = 1;
//			
//			pref *= arr[i];
//			suf *= arr[n-i-1];;
//			ans = Math.max(ans, Math.max(pref, suf));
//		}
//		return ans;
//	}
	
	static int result(int[] arr)
	{
		int res = Integer.MIN_VALUE;
		for(int i=0; i<arr.length-1; i++)
		{
			int prod = arr[i];
			for(int j=i+1; j<arr.length;j++)
			{
				res = Math.max(res, prod);
				prod *= arr[j];
			}
			res = Math.max(res, prod);
		}
		return res;
	}

}
