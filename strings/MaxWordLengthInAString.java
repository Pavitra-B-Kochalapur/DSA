package com.pavitrabk.strings;

import java.util.Arrays;

public class MaxWordLengthInAString {

	public static void main(String[] args) {
		String s = "Microsoft teams ";
		System.out.println("Largest word is: "+maxLength(s));
	}
	
	static String maxLength(String s)
	{
		int len = s.length();
		int j = 0, i=0;
		String maxWord = "";
		int maxLen = 0, maxStart = 0;
		
		while(j<=len)
		{
			if(j<len && s.charAt(j) != ' ')
			j++;
			
			else {
				int currentLen = j - i;
				if(currentLen > maxLen)
				{
					maxLen = currentLen;
					maxStart = i;
				}
				j++;
				i = j;
			}
		}
		
		maxWord = s.substring(maxStart,maxLen);
		return maxWord;
	}

}
