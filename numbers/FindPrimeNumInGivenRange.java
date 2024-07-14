package com.pavitrabk.numbers;


//A prime number is a positive integer that has exactly two factors: 1 and the number itself. 
//For example, 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29 are the first few prime numbers.
public class FindPrimeNumInGivenRange {

	public static void main(String[] args) {
		int min = 10;
		int max = 16;
		
		
		for(int i=min; i<=max; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
		

	}
	
	static boolean isPrime(int ele)
	{
		if(ele == 1) return false;
		for(int i=2; i<ele;i++)
		{
			if(ele% i== 0) {
				return false;
			}		
		}
		return true;
	}

}
