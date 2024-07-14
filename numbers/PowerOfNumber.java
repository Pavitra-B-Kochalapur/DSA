package com.pavitrabk.numbers;

public class PowerOfNumber {

	public static void main(String[] args) {
		int n = 2;
		int pow = 3;
		int num = 1;
		
//		while(pow > 0)
//		{
//			num = num * n;
//			pow--; 
//		}
		int ans = (int) Math.pow(n, pow);
		System.out.println(ans);

	}

}
