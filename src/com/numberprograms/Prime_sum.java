package com.numberprograms;

import java.util.Scanner;

public class Prime_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if (sum(i)) {
				sum += i;
			}
		}
		System.out.println("Sum of Number :"+sum);
	}

	static boolean sum(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
