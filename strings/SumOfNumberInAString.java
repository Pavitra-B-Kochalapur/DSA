package com.pavitrabk.strings;

public class SumOfNumberInAString {

	public static void main(String[] args) {
		String s = "1bc268";
		String tempSum = "";
		int sum = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				tempSum += ch;
			}else {
				sum += Integer.parseInt(tempSum);
				tempSum = "0";
			}
		}
		System.out.println(sum + Integer.parseInt(tempSum));
		

	}

}
