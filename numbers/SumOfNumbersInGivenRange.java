package com.pavitrabk.numbers;

public class SumOfNumbersInGivenRange {

	public static void main(String[] args) {
		int l = 5;
		int r = 9;
		int sum = 0;
		
		for(int i=l; i<=r; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
