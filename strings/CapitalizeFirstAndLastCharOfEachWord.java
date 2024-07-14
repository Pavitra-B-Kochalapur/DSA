package com.pavitrabk.strings;

public class CapitalizeFirstAndLastCharOfEachWord {

	public static void main(String[] args) {
		String s = "Welcome to Java world";
		int len = s.length();
		System.out.println(capitalizeFL(s, len));

	}
	
	static String capitalizeFL(String s, int len)
	{
		StringBuffer sb = new StringBuffer(s);
		for(int i=0; i<len; i++)
		{
			if(i == 0 || i == len-1)
			{
				sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}else if(s.charAt(i) == ' ')
			{
				sb.setCharAt(i-1, Character.toUpperCase(s.charAt(i-1)));
				sb.setCharAt(i+1, Character.toUpperCase(s.charAt(i+1)));
			}
		}
		return sb.toString();
	}

}
