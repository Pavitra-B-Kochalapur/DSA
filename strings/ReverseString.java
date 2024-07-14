package com.pavitrabk.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello";
		
//		char[] ch = str.toCharArray();
//		String rev = "";
//		for(int i=str.length()-1; i>=0; i--)
//		{
//			rev = rev + ch[i];
//		}
//		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);

	}

}
