package com.array;
public class demo {

	public static void main(String[] args) {
		int arr[] = {5,4,8,6,1};
		
		int Largest = arr[0];
		int second = Largest;
		
		for(int i = 0;i<arr.length;i++)
		{
		   if(second < arr[i])
		   {
			  Largest = arr[i]; 
		   }
		}
		System.out.println("Largest : "+Largest);
	}
}
