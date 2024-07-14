package com.pavitrabk.strings;

public class ChangeCaseOfEachCharInArray {

	public static void main(String[] args) {
		String s = "Welcome to Java Programming";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++)
		{
			int ascii = (int) s.charAt(i);
			if(ascii>=65 && ascii<=90)
				sb.append(Character.toLowerCase((char) ascii));
			else if(ascii >= 97 && ascii <= 122)
				sb.append(Character.toUpperCase((char) ascii));
			
			else if(s.charAt(i) == ' ')
				sb.append(' ');
		}
		
		System.out.println(sb.toString());

	}

}
