package com.array2D;

import java.util.Scanner;

public class Max2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] number = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
					System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
	
		int min = number[0][0];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (number[i][j] < min) {
					min = number[i][j];	
				}
			}
		}
		System.out.println("Minimun Value : "+min);
	}

}
