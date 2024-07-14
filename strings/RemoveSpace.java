package com.pavitrabk.strings;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "Welcome12 to!%$#@!*()     java          World";
	    s = s.replaceAll("\\s", "");
	    s = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
//		String str = "Hii Everyone     ";
//		char[] ch = str.toCharArray();
//		String n = "";
//		
//		for(int i=0; i<str.length();i++)
//		{
//			if(ch[i] != ' ')
//			{
//				n = n + ch[i];
//			}
//		}
//		System.out.println(n);

	}

}
