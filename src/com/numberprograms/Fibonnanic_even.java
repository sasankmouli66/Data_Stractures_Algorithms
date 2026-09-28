package com.numberprograms;

import java.util.Scanner;

public class Fibonnanic_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();

		fiboEven(n);
	}

	static void fiboEven(int n) {
		int first = 0;
		int second = 1;

		while (first <= n) {
			if (first % 2 == 0) {
				System.out.println("Even Number  :" + first);
			}
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println("Fibonic Number :" + second);
	}

}
