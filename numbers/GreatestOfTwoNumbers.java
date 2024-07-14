package com.pavitrabk.numbers;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 30;
		int num3 = 100;
		
//		if(num1 > num2)
//		{
//			System.out.println("num1 is greater than num2 ");
//		}else {
//			System.out.println("num2 is greater than num1 ");
//		}
		int max = Math.max(num1, Math.max(num2, num3));
		System.out.println(max);

	}

}
