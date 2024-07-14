package com.pavitrabk.numbers;

public class Permutation {

	public static void main(String[] args) {
		int n=6;
		int r=4;
		//permutations in which n people can occupy r seats: n!/(n-r)!
		int nu = 1;
		int den = 1;
		
		for(int i=1; i<=n; i++)
		{
			nu = nu*i;
		}
		for(int j=1; j<=(n-r);j++)
		{
			den = den*j;
		}
		
		int perm = nu / den;
		System.out.println(perm);
		

	}

}
