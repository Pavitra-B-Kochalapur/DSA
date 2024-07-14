package com.pavitrabk.strings;

public class CountsNumberOfVowelsConsonantsSpace {

	public static void main(String[] args) {
		String str = "Welcome to java world";
		char[] ch = str.toCharArray();
		int vowels = 0;
		int consonants = 0;
		int space = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(ch[i] == 'a' ||ch[i] ==  'e' || ch[i] == 'i' ||ch[i] ==  'o' || ch[i] ==  'u')
			{
				vowels++;
			}else if(ch[i] == ' ')
			{
				space++;
			}else {
				consonants++;
			}
		}
		
		System.out.println(vowels+" "+consonants+" "+space);

	}

}
