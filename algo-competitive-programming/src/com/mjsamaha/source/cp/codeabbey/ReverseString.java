package com.mjsamaha.source.cp.codeabbey;


import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();  // read full line
		
		char[] arr = s.toCharArray();
		
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		System.out.println(new String(arr));
	}

}
