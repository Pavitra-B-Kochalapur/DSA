package com.pavitrabk.numbers;

public class SumOfNnaturalNumber {

	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		//Sum of N Natural Number Formula: n*(n+1)/2
//		for(int i=0; i<=num; i++)
//		{
//			sum = sum+i;
//		}
		
		sum = num*(num+1)/2;
		System.out.println("Sum of N Natural Numbers: " + sum);
	}

}
