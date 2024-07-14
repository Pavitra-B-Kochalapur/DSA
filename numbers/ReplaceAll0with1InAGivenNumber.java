package com.pavitrabk.numbers;

public class ReplaceAll0with1InAGivenNumber {

	public static void main(String[] args)
	{
		int num = 102003;
		int ans = 0;
		int temp = 1;
		
		while(num>0)
		{
			int d = num%10;
			if(d == 0)
			{
				d=1;
			}
			ans = ans+d*temp;
			num = num/10;
			temp = temp*10;
			
		}
		System.out.println(ans);
		
	
	
	}

}
