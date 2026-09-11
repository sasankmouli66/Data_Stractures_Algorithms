package com.array2D;

import java.util.Scanner;

public class Sum2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size");
		int size = sc.nextInt();
		System.out.println("enter a number");
		int[][] number = new int[size][size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				number[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(number[i][j]+" ");
				sum += number[i][j];	
			}	
			System.out.println();
		}
		
		System.out.println(sum);
	}

}
