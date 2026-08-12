package com.array;

public class Sum {

	public static void main(String[] args) {
		int arr[] = {1,5,9,4,7};
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			sum +=arr[i];
//			System.out.print(sum + " ");
			//System.out.println(sum);
		}	
		System.out.print(sum + " ");	
	}
}
