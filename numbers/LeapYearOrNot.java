package com.pavitrabk.numbers;

public class LeapYearOrNot {

	public static void main(String[] args) {
		int year = 2021;
		
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
		{
			System.out.println("Year is Leap Year: "+year);
		}else {
			System.out.println("Year is not Leap Year: "+year);
		}

	}

}
