package com.pavitrabk.numbers;

public class FindPalidromeNumbersInGivenRange {

	public static void main(String[] args) {
		int min = 100;
		int max = 150;
		
		for(int i=min; i<=max; i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i+" ");
			}
			
		}

	}
	
	static boolean isPalindrome(int n)
	{
		int rev = 0;
		int temp = n;
		
		while(temp>0)
		{
			rev = rev*10+temp%10;
			temp = temp/10;
		}
		
		if(n==rev)
		{
			return true;
		}else {
			return false;
		}
	}

}
