package com.pavitrabk.numbers;

public class MinAndMaxDigitInANumber {

	public static void main(String[] args) {
		int n = 9836;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(n > 1)
		{
			int val = n%10;
			if(val > max)
			{
				max = val;
			}
			if(val < min)
			{
				min = val;
			}
			
			n = n/10;
		}
		System.out.println("Max Value: "+max);
		System.out.println("Min Value: "+min);
		
		

	}

}
