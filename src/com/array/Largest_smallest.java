package com.array;
import java.util.Scanner;

public class Largest_smallest {

	public static void main(String[] args) {
		int[] arr = {-1,4,-4};
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int[] arr = new int[size];
		
		int largest =arr[0];
		int smallest = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			if(largest < arr[i])
			{
				largest = arr[i];
			}
			else if(smallest > arr[i])
			{
			//	System.out.println(smallest);
				smallest = arr[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
