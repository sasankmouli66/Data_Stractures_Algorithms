package com.nestedloop;

import java.util.Scanner;

public class Matrix_multipication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print((i * j)+" ");
			}
			System.out.println();
		}

	}

}
