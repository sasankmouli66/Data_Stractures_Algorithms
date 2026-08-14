package com.array;

import java.util.Arrays;

public class Bubble_sortArray {
	
	public static void main(String[] args) {
		int[] arr = {5,3,8,4,2};
		int count = 0;
		int count1 = 0;
		int temp = 0;
		
		System.out.println("Before Sort elements");
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<arr.length-1;i++)
		{
			count++;
			boolean flag = true;
			for(int j = 0;j<arr.length-1-i;j++)
			{
				count1++;
				if(arr[j] > arr[j+1])// Asc Order
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}				
			}
			if(flag)
			{
				break;
			}
		}
		System.out.println("After Sorting Elements");
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
		System.out.println(count1);
	}
}
