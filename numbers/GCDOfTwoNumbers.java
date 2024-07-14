package com.pavitrabk.numbers;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 6;
		int ans = 1;
		
		for(int i=1; i<=Math.min(num1, num2);i++)
		{
			if(num1%i == 0 && num2%i == 0)
			{
				ans = i;
			}
		}
		System.out.println("gcd of two given numbers"+ans);

	}

}
