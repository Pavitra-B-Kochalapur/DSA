package com.pavitrabk.numbers;

public class PrimeFactorsOfTheGivenNumber {

	public static void main(String[] args) {
		int n = 16;
		
		for(int i=2; i<=n || n>1;i++)
		{
			if(n%i == 0)
			{
				while(n%i == 0)
				{
				System.out.print(i+" ");
				n = n/i;
				}
			}
		}
		

	}

}
