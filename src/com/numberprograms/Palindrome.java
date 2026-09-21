package com.numberprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int pali = palidrome(n);
		if (pali == n) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("Not Palidrome");
		}

	}

	static int palidrome(int n) {
		int temp = 0;
		int rev = 0;

		while (n > 0) {
			temp = n % 10;
			rev = rev * 10 + temp;
			n = n / 10;
		}
		return temp;
	}

}
