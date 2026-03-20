package com.mjsamaha.source.cp.codeabbey;


import java.util.Scanner;

public class ArrayCounters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] counts = new int[n]; 

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            counts[num - 1]++; 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(counts[i] + " ");
        }
        
        sc.close();
    }
}