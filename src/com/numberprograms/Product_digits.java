package com.numberprograms;

import java.util.Scanner;

public class Product_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  :");
		int n = sc.nextInt();
		int multiply = product(n);
		System.out.println(multiply);

	}

	static int product(int n) {
		int temp = 0;
		int product = 1;
		while (n > 0) {
			temp = n % 10;
			product = product * temp;
			n = n / 10;
		}
		return product;
	}

}
