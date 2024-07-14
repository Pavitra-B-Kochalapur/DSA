package com.pavitrabk.numbers;

public class HarshadNumber {

	public static void main(String[] args) {
		int num = 379;
		int originalNum = num;
		int sum = 0;
		while(num>0)
		{
			sum = sum+num%10;
			num = num/10;
		}
		
		if(originalNum%sum == 0)
		{
			System.out.println("Given Number is Harshad Number: "+originalNum);
		}else {
			System.out.println("Given Number is not Harshad Number: "+originalNum);
		}

	}

}
