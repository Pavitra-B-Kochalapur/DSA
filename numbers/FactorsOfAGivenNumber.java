package com.pavitrabk.numbers;

public class FactorsOfAGivenNumber {

	public static void main(String[] args) {
		int n = 9;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
