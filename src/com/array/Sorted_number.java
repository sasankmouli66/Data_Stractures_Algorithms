package com.array;

import java.util.Arrays;

public class Sorted_number {

	public static void main(String[] args) {
		int[] n = {10,20,30,40};
		boolean sorted = true;
		
		for(int i = 0;i<n.length - 1;i++)
		{
			if(n[i]>n[i+1])
			{
				sorted = false;
				break;
			}	
		}
		if(sorted)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Arraya not sorted");
		}
		
	}

}
