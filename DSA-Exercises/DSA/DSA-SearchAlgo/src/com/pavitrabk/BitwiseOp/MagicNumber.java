package com.pavitrabk.BitwiseOp;

public class MagicNumber {

	public static void main(String[] args) {
		int n = 8;
		int base = 2;
		System.out.println(MagicNum(n, base));

	}

	private static int MagicNum(int n, int base) {
		
		return (int)((Math.log(n) / Math.log(base)) + 1);
	}

}
