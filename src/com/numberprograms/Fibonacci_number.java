package com.numberprograms;

import java.util.Scanner;

public class Fibonacci_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();

		int first = 0;
		int second = 1;

		for (int i = 0; i < n; i++) {

			int next = first + second;

			first = second;
			second = next;

		}
		System.out.println("Fibonacci Number :" + second);

	}

}
