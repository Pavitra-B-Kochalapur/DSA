package com.pavitrabk.strings;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "ABCDCBA";
		palindrome(str);

	}
	
	static void palindrome(String str)
	{
		int n = str.length();
		
		String org_Str = str;
		String rev = "";
		
		//char[] ch = str.toCharArray();
		
		for(int i=n-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
//		StringBuffer sb = new StringBuffer(str);
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
		
		if(org_Str.equals(rev))
		{
			System.out.println("Given String is Palindrome: "+org_Str);
		}else {
			System.out.println("Given String is not Palindrome: "+org_Str);
		}
	}

}
