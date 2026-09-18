package com.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Right_Array_Rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a r number :");
		int r = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		reverseArray(arr, r);

		System.out.println("After Rotation array : " + Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr, int r) {
		int left = 0;
		int right = arr.length - 1;
//reverse array
		rotateArray(arr, left, right);
//Right rotation array
		rotateArray(arr, left, r - 1);
//left rotation array
		rotateArray(arr, r, right);

	}

	private static void rotateArray(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

	}
}
