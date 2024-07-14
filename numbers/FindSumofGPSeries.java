package com.pavitrabk.numbers;

public class FindSumofGPSeries {

	public static void main(String[] args) {
		int n = 2;
		double a = 3;
		double r = 5;
		double sum = 0;
		
		for(int i=0; i<n; i++)
		{
			sum = sum+a;
			a = a * r;
		}
		System.out.println(sum);

	}

}
