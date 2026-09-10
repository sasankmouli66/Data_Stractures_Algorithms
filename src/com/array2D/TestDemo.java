package com.array2D;
import java.util.Scanner;
public class TestDemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	System.out.println("enter a value");
	int size = sc.nextInt();
	int[][] number = new int[size][size];

	System.out.println("enter a value"+(size * size)+"array size");
	for(int i = 0;i<size;i++)
	{
		for(int j = 0;j<size;j++) {
			number[i][j] = sc.nextInt();
		}
	}
	System.out.println("Array contents :");
	for(int i = 0;i<size;i++)
	{
		for(int j = 0;j<size;j++) {
			System.out.println(number[i][j] + " ");
		}
		
	}
	sc.close();
	}

}
