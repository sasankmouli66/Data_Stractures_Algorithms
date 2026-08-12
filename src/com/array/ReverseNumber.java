package com.array;

public class ReverseNumber {

	public static void main(String[] args) {
		int[] Number = {10,20,55,88,77};
		int n = Number.length-1;
		for(int i = n;i>=0;i--)
		{
			
			System.out.print( Number[i]+ " ");
			//System.out.println(Number + " ");
		}
	}
}
