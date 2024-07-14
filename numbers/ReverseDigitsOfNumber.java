package com.pavitrabk.numbers;

public class ReverseDigitsOfNumber {

	public static void main(String[] args) {
		int n = 470;
		int rev = 0;
		
		while(n > 1)
		{
			rev = rev*10+n%10;
			n = n/10;
		}
		System.out.println(rev);
		
	

	}

}
