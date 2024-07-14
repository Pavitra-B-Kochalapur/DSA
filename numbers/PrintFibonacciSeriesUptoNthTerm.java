package com.pavitrabk.numbers;

public class PrintFibonacciSeriesUptoNthTerm {

	public static void main(String[] args) {
		int n = 6;
		
		int a = 0; 
		int b = 1;
		System.out.print(a+" "+b);
		int sum = 0;
		if(n == 0)
		{
			System.out.println(0);
		}else {
		
		for(int i=2; i<=n; i++)
		{
			sum = a + b;
		    a = b;
			b = sum;
			
			System.out.print(" "+sum);
		}
		}

	}

}
