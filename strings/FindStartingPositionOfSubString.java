package com.pavitrabk.strings;

public class FindStartingPositionOfSubString {

	public static void main(String[] args) {
		String s1 = "Pavitrapallavi";
		String s2 = "vitra";
		int foundIndx = foundPattern(s1, s2);
		//System.out.println("Index of SubString: "+foundIndx);	
		
		//using inbuilt function
		int indx = s1.indexOf(s2);
		System.out.println(indx);
	}
	
	static int foundPattern(String s1, String s2)
	{
		for(int i=0; i<s1.length(); i++)
		{
			int temp = i;
			int j = 0;
			for(j=0; j<s2.length(); j++)
			{
				if(s1.charAt(temp) != s2.charAt(j))
				{
					break;
				}
				temp++;
			}
			
			if(j==s2.length())
			{
				return i;
			}
		}
		return -1;
	}

}
