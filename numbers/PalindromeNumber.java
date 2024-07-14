package com.pavitrabk.numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 1212;
		int num2 = num;
		int palin = 0;
		
		while(num > 0)
		{
			palin = palin*10+num%10;
			num = num/10;
			
		}
		
		if(palin == num2)
			System.out.println("Number if Palindrome");
		else
			System.out.println("not a Palindrome Number");

	}

}
