package com.pavitrabk.strings;

public class CountNumberOfWordsInAGivenString {

	public static void main(String[] args) {
		String str = "Welcome to java programming";
		int count = 1;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
