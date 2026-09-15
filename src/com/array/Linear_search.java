package com.array;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int size = sc.nextInt();
		System.out.println();
		int[] number = new int[size];
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			number[i] = sc.nextInt();
		}
		search(number);

	}

	static boolean search(int[] number) {
		int n = 30;
		boolean status = false;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == n) {
				status = true;
				System.out.println("Match number :" + i);
				break;
			}
		}

		if (!status) {
			System.out.println("Element not found");
		}
		return status;

	}

}
