package com.pavitrabk.recursion;

public class RecursionIntro {

	public static void main(String[] args) {
//		int ans = fibonacci(50);
//		System.out.println(ans);
		
		for(int i=0; i<11; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	static int fibonacci(int n) {
		
		if(n < 2) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
		
		//using golden ratio
//		return  (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n)/Math.sqrt(5));
	}

}
