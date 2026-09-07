package com.array;

public class Duplicate_values {

	public static void main(String[] args) {
		int[] number = {1,9,6,3,2,66,3,4,6,4,4,4,4};
		
		for(int i = 0;i<number.length;i++)
		{
			int temp = 0;
			for(int j = i+1;j< number.length;j++)
			{
				if(number[i] == number[j])
				{
//					System.out.print(number[i] +" ");
					temp++;
				}		
			}
			if(temp ==1)
			{
				System.out.print(number[i] + " ");
			}	
		}
	}
}
