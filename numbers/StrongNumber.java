package com.pavitrabk.numbers;

public class StrongNumber {

	public static void main(String[] args) {
		
		int n = 145;
		int ans = strongNum(n);
		
				
		if(ans == n)
		{
			System.out.println("Strong Number: "+ans);
		}else
		{
			System.out.println("Not a Strong Number: "+ans);
		}

	}
	
	static int factorial(int n)
	{
		int mul = 1;
		for(int i=1; i<=n; i++)
		{
			mul = mul*i;
		}
		return mul;
		
	}
	
	static int strongNum(int n)
	{
		int sum = 0;
		
		while(n>0)
		{
			int digit = n%10;
			sum = sum+factorial(digit);
			n = n/10;
		}
		return sum;
	}

}
