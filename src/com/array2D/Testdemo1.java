package com.array2D;
public class Testdemo1 {

	public static void main(String[] args) {
	int[][] number =   {
		    {10, 20, 30},
		    {40, 50, 60},
		    {70, 80, 70}
		};	
	int sum = 0;
	for(int i = 0;i<number.length;i++)
	{
		for(int j = 0;j<number[1].length;j++)
		{
			System.out.print(number[1][j]+" ");
		}
		System.out.println();
	}
	
	}

}
