package com.pavitrabk.numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 15;
		int ans = 0;
		
		for(int i=1; i<num; i++)
		{
			if(num%i == 0) {
			ans = ans + i;
			}
		}
		
		if(ans == num) {
		System.out.println("Number is Perfet: "+ans);
		}else {
			System.out.println("Number is not Perfect: "+ans);
		}

	}

}
