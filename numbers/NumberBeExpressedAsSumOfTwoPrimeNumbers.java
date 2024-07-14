package com.pavitrabk.numbers;

public class NumberBeExpressedAsSumOfTwoPrimeNumbers {

	public static void main(String[] args) {
		int n = 19;
		
		if(isPrime(n)) {
			System.out.println("Yes");
		}else  {
			System.out.println("No");
		}

	}
	
	static boolean prime(int n)
	{
		if(n<=1) return false;
		
		for(int i=2; i*i<=n; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean isPrime(int n)
	{
		if(prime(n) && prime(n-2))
		{
			return true;
		}else {
		return false;
		}
	}

}
