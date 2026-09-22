package com.numberprograms;

import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			
			if (prime(i)) {
				count++;
				System.out.println(i);
				
			}

		}
		System.out.println("Count :"+count);
	}

	static boolean prime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

}
