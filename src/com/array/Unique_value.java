package com.array;
import java.util.Scanner;
public class Unique_value {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a size");
//	int size = sc.nextInt();
//	int[] arr = new int[size];
//	System.out.println("enter a values ");
//	int[] n = sc.nextInt();
	int[] n = {60,96,69,69,60};
	
	for(int i = 0;i< n.length;i++)
	{
		int temp = 0;
		for(int j = 0;j < n.length;j++)
		{
			if(n[i]==n[j])
			{
				temp++;
			}
		}
		if(temp == 1)
		{
			System.out.println(n[i]);
		}
	}

	}

}
