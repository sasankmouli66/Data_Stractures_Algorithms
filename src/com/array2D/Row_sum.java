package com.array2D;

import java.util.Scanner;

public class Row_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Size");
		int size = sc.nextInt();
		System.out.println("Enter a number");
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
		System.out.println("--------------------");
		/////Rom Sum
		for (int i = 0; i < number.length; i++) {
			int sum = 0;
			
			for (int j = 0; j < number[i].length; j++) {
				sum += number[i][j];
				
			}
			System.out.println("Row "+ i + " Sum " + sum);
			
		}
		System.out.println("--------------------");
		///// Column Sum 
		for (int j = 0; j < number[0].length; j++) {
			int sum = 0;
			
			for (int i = 0; i < number.length; i++) {
				sum += number[i][j];
			}
			System.out.println("Column "+ j + " Sum " + sum);
		}

	}

}
