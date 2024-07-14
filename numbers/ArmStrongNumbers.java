package com.pavitrabk.numbers;


//An Armstrong number is a number that is equal to the sum of the cubes of its digits.
//For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153
public class ArmStrongNumbers {

	public static void main(String[] args) {
		int num = 153;
		int p = 3;
		int num2 = num;
		int ans = 0 ;
		
		for(int i=0; i<p; i++)
		{
			ans = (int) (ans+Math.pow(num%10, p));
			num = num/10;
		}
		
		if(ans == num2)
		{
			System.out.println("Number is ArmStrong "+num2);
		}else {
			System.out.println("Not ArmStrong Number: "+num2);
		}
		

	}

}
