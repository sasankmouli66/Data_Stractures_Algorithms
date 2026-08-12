package com.array;

import java.util.Scanner;

public class Number_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int a = arr.length-1;
		for(int i = a;i>=0;i--)
		{
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		
	}
}
