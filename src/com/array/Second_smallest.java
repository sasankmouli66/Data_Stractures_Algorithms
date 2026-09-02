package com.array;

public class Second_smallest {

	public static void main(String[] args) {
		int[] arr = {66,20,2,96};
		int smallest = arr[0];
		int second_Smallest = Integer.MIN_VALUE;
		for(int i = 0;i< arr.length;i++)
		{
			if(arr[i] < smallest)
			{
				second_Smallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < smallest)
			{
				second_Smallest = arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(second_Smallest);
	}

}
