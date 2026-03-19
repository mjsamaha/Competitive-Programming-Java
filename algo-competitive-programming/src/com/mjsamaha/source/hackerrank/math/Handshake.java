package com.mjsamaha.source.hackerrank.math;

public class Handshake {
	
	/**
	 * 
	 * if there are n people, p1, p2, p3, and if p1 shakes hands with p2, p3, == they all have shaken hands with 3
	 * 
	 * return number of total handskaes that will happen if everyone shakes hands with everyone else
	 * 
	 * ex n = 1 --> 0 handshakes (p1 does not shake hands with anyone)
	 * 
	 * ex 2 = 2 --> 1 handshake (p1 shakes hands with p2)
	 * 
	 * ex n = 3 --> 2 handshakes (p1 shakes hands with p2 and p3, p2 shakes hands with p3)
	 * 
	 * n * (n - 1) / 2

	 */

	public static void main(String[] args) {
		
		System.out.println(handShake(new java.util.Scanner(System.in).nextInt()));
		
		
		
		// close the scanner
		new java.util.Scanner(System.in).close();
		
	}
	
	public static int handShake(int n ) {
		
		int hs = 0;
		
		if (n == 0) {
			hs = 0;
		} else {
			hs = n * (n - 1) / 2;
		}
		
		return hs;
		
	}
}
