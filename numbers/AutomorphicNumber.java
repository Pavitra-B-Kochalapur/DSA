package com.pavitrabk.numbers;


//A number is called an Automorphic number if and only if its square ends in the same digits 
//as the number itself. Examples : Input : N = 76.
public class AutomorphicNumber {

	public static void main(String[] args) {
		int n = 76;
		
		if(autoMarphic(n) == true)
		{
			System.out.println("AutoMarphic Number: "+n);
		}else {
			System.out.println("Not AutoMarphic Number: "+n);
		}
		
	}
	
	static boolean autoMarphic(int n)
	{
		int sqr = n*n;
		while(n > 0)
		{
			if(n%10 != sqr%10)
			{
				return false;
			}	
			
			n /= 10;
			sqr /= 10;
		}
		return true;

	}

}
