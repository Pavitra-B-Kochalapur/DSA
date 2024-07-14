package com.pavitrabk.numbers;

public class LCMOfTwoGivenNumbers {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 8;
		int gcd = 1;
		
		for(int i=1; i<=Math.min(num1, num2);i++)
		{
			if(num1%i == 0 && num2%i == 0)
			{
				gcd = i;
			}
		}
		
		int lcm = (num1 * num2) / gcd;
		System.out.println("LCM of Two Given Numbers: "+lcm);

	}

}
