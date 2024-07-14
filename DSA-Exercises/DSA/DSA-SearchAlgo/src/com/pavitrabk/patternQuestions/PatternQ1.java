package com.pavitrabk.patternQuestions;

public class PatternQ1 {

	public static void main(String[] args) {
		int n = 3;
		patternQuestion4(n);
		
	}
	
	static void patternQuestion1(int n) {
		for(int row = 0; row < n; row++) {
			for(int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();	
		}	
	}	
	
	static void patternQuestion2(int n) {
		for(int row = 0; row < n; row++) {
			for(int col = 0; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();	
		}	
	}
	
	static void patternQuestion3(int n) {
		for(int row = 0; row < 2 * n; row++) {
			int totalColsRow = row > n ? 2 * n - row: row;
			for(int col = 0; col < totalColsRow; col++) {
				System.out.print("* ");
			}
			System.out.println();	
		}	
	}
	
	static void patternQuestion4(int n) {
		for(int row = 0; row < 2 * n; row++) {
			
			int totalColsRow = row > n ? 2 * n - row: row;
			
			int noOfSpaces = n - totalColsRow;
			for(int s = 0; s < noOfSpaces; s++) {
				System.out.print(" ");
			}
			
			for(int col = 0; col < totalColsRow; col++) {
				System.out.print("* ");
			}
			
			System.out.println();	
		}	
	}
}
