package com.mjsamaha.source.cp.codeforces;

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        /**
         * Initial thoughts:
         * use an array and keep track of the number of police officers available and the number of crimes that go unhandled
         * if arr[i] > 0 --> add arr[i] to the number of police officers available
         * if arr[i] < 0 --> if there are police officers available, subtract 1 from the number of police officers available, else add 1 to the number of crimes that go unhandled
         * at the end, print the number of crimes that go unhandled
         * -> this did not work because there was no variable to keep track of the number of police officers available, so I had to use a variable to keep track of the number of police officers available and a variable to keep track of the number of crimes that go unhandled
         * 
         */

        int n = sc.nextInt(); // n = number of events

        int input; // input = number of police officers recruited (positive) or number of crimes (negative)
        
        
        int sum = 0; // if input is > 0 == sum of police officers available
        int neg = 0; // if input is < 0 == number of crimes that happen when there are no police officers available
        
        // loop through events and keep track of num of police avaiable to stop crimes, and num of crimes that go unhandled when sum = 0



        for (int i = 0; i < n; i++){

            input = sc.nextInt(); // input = number of police officers recruited (positive) or number of crimes (negative)

            if (input > 0){ // if input is positive, add it to the sum of police officers available

                sum+=input;

            } else if (input < 0){ 

                if (sum > 0){ // if input is negative and there are police officers available, subtract 1 from the sum of police officers available

                    sum--; // if there are police officers available, subtract 1 from the sum of police officers available

                } else {

                    neg++; // if there are no police officers available, add 1 to the number of crimes that go unhandled

                }
            }
        }
        System.out.println(neg); // print the number of crimes that go unhandled

        

    



        sc.close();
    }

}