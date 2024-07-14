package com.pavitrabk.BitwiseOp;

public class BitWiseOpr {
//find odd numbers
	public static void main(String[] args) {
		//int n = 21;
		for(int n=1; n<20; n++) {
			System.out.println(bOp(n));
		}
		
		
	}
	static boolean bOp(int n) {
		return (n&1) == 1;
	}

}
