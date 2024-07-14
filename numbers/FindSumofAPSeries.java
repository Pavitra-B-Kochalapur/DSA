package com.pavitrabk.numbers;

public class FindSumofAPSeries {

	public static void main(String[] args) {
		int n = 8;
		int a = 2;
		int d = 5;
		
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			sum = sum+a;
			a = a + d;
			
		}
		System.out.println(sum);

	}

}
