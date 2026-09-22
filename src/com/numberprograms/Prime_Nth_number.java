package com.numberprograms;

import java.util.Scanner;

public class Prime_Nth_number {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int n = sc.nextInt();
//		int count = 0;
//		for (int i = 1; i < 100; i++) {
//			if (nPrime(i)) {
//				count++;
//				if(count == n) {
//					System.out.println("Nth Prime Number :"+i);
//				}
//			}
//		}
//	}
//
//	static boolean nPrime(int n) {
//		int count = 0;
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			return true;
//		}
//		return false;
		int n = 84;
		int largest = 0;

		for (int i = 2; i <= n; i++) {

		    if (n % i == 0) {

		        int count = 0;
		        for (int j = 1; j <= i; j++) {
		            if (i % j == 0) {
		                count++;
		            }
		        }

		        if (count == 2) {
		            largest = i;
		        }
		    }
		}

		System.out.println("Largest Prime Factor = " + largest);
	}
}
