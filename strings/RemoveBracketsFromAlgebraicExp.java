package com.pavitrabk.strings;

public class RemoveBracketsFromAlgebraicExp {

	public static void main(String[] args) {
		String str = "a+((b-c)+d)";
		
		
		char[] ch = str.toCharArray();
		String newStr = "";
		
		for(int i=0; i<str.length(); i++)
		{
			if(ch[i] != '(' && ch[i] != ')')
			{
			newStr = newStr + ch[i];
			}
		}
		System.out.println(newStr);
		
	
	}

}
