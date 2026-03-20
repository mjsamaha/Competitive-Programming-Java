package com.mjsamaha.source.cp.codeabbey;

import java.util.Scanner;

public class SumInLoopV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int x = sc.nextInt();
		
		int[] arr = new int[x];
		
		int sum = 0;
		
//		for (int a : arr) {
//			arr[a] = sc.nextInt();
//			
//			sum += arr[a];
//		}
		for (int a : arr) {
			sum += arr[a] = sc.nextInt();
		}


		System.out.println(sum);

		sc.close();

	}

}
