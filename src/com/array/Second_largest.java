package com.array;

public class Second_largest {

	public static void main(String[] args) {
		int[] arr = {55,25,96,20,74};
		int largest = 0;
		int smallest = arr[0];
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
			else if (arr[i] < smallest)
			{
				smallest = arr[i];
			}
			
		}
		
		System.out.println(largest);
		System.out.println(smallest);
	}

}
