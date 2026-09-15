package com.array;
import java.util.Scanner;
public class Two_pointer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size :");
		int size = sc.nextInt();
		System.out.println("Enter a elements :");
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		pointer(arr);

	}
	static void pointer(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		int temp = 0;
		while(left < right) {
			temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			
			left++;
			right--;
		}
		System.out.println("Reverse arrray");
		System.out.println("---------------------");
		for(int value:arr) {
			System.out.print(value +" ");
		}
		System.out.println();
	}
}
