package com.pavitrabk.numbers;


//an abundant number or excessive number is a positive integer
//for which the sum of its proper divisors is greater than the number.
public class AbundantNumber {

	public static void main(String[] args) {
		int num = 6;
		int factors = 0;
		
		for(int i=1; i<num; i++)
		{
			if(num%i == 0)
			{
				factors = factors + i;
				//System.out.print(i+" ");
			}
		}
		
		if(factors > num)
		{
			System.out.println("Given Number is Abundant Number: "+num);
		}else
		{
			System.out.println("Given Number is not an Abundant Number: "+num);
		}
		

	}

}
