package com.mjsamaha.source.cp;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeChef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] arr = new int[n];

		// read elements
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// flag
		boolean found = false;
		// element tracker
		int curr = arr[0];

		for (int i = 0; i < n; i++) {
			if (x == curr) {
				found = true;
			}
		}

		if (found = true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
