package com.mjsamaha.source.hackerrank.math;

public class MinHeightTriangle {
	
	public static void main(String[] args) {
		
		
		
		// close the scanner
		new java.util.Scanner(System.in).close();
		
	}
	
	public static int minHeight(int base, int area) {
		
		return Math.max(1, (area * 2 + base - 1) / base);
	}

}
