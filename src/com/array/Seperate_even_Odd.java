package com.array;

public class Seperate_even_Odd {
	public static void main(String [] args)
	{
		int[] n = {10,15,20,25,30,35};
		String evens = "";
		for(int num:n)
		{
			if(num % 2 ==0)
			{
				evens += num +" ";
				
			}
		}
		System.out.println("Even numbers :"+evens+ " ");
		String odds = "";
		for(int i = 0; i < n.length;i++) {
				if(n[i] % 2 !=0)
				{
					odds+= n[i] + " ";
					
				}
		
			}
		System.out.println("Odd number  :"+odds + " ");
	}
	}
