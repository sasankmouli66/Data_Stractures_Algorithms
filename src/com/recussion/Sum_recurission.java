package com.recussion;

import java.util.Scanner;

public class Sum_recurission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int s = sum(n);

		System.out.println(s);
	}
	static int sum(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		return n + sum(n - 1);
	}
}
