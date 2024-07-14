package com.pavitrabk.strings;

public class NextLexicographicAlphabet {

	public static void main(String[] args) {
		String s = "abcxyz";
		System.out.println("Original String: " + s);
		System.out.println("lexicographic String : " + lexicographic(s));
		
	}
	
	static String lexicographic(String s)
	{
        StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<s.length(); i++)
		{
			int ascii = (int) s.charAt(i);
			if(ascii == 90)
			{
				sb.insert(i,(char) (65));
			}
			else if(ascii == 122) 
			{
				sb.insert(i, (char) (97));
			}
			else if((ascii >= 65 && ascii < 90)||(ascii >= 97 && ascii < 122))
			{
				sb.insert(i, (char) (ascii+1));
			}
		}
		
		return sb.toString();
		
	}

}
