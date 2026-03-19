package com.mjsamaha.source.hackerrank.math;

import java.util.Scanner;

public class MaximumDraws {
	
	/**
	 * 
	 * 
	 * n color of socks
	 * 
	 * if we remove 2, they may not be the same color, but if we remove 3, they will be the same color
	 * 
	 * return min number of socks to remove to guarantee a pair of the same color
	 * 
	 * ex n = 1 (red) --> 2 socks to remmove to guarantee a pair of the same color
	 * 
	 * ex n = 2 (red, blue) --> 3 socks to remmove to guarantee a pair of the same color
	 * 
	 * ex n = 3 (red, blue, green) --> 4 socks to remmove to guarantee a pair of the same color
	 * 
	 * 
	 * formula: n + 1
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(maximumDraws(new Scanner(System.in).nextInt()));
		

		
		// close the scanner
		new Scanner(System.in).close();
	}

	public static int maximumDraws(int n) {

		int min = n;

		if (n > 0) {
			min = n + 1;
		}

		return min;
	}

}
