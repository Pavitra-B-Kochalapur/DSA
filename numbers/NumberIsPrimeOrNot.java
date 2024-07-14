package com.pavitrabk.numbers;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		int num = 7;
		boolean ans = isPrime(num);
		//System.out.println(ans);
		if(num != 1 && ans == true)
		{
			System.out.println("Number is Prime : "+num);
		}else {
			System.out.println("Number is not Prime : "+num);
		}

	}
	
	static boolean isPrime(int num)
	{
//		while(num > 1)
//		{
//			if(num%1 == 0 && num%num == 0)
//			{
//				return true;		
//			}
//		}
//		return false;
		
		for(int i=2; i<num; i++)
		{
			if(num%i == 0) {
				return false;
			}
		}
			return true;
	}

}
