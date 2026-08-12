package com.array;
import java.util.Scanner;


public class Prime_Numbers {
	public static boolean isPrime(int a)
	{
		boolean status = true;
		if(a==0|a==1)
		{
			return false;
		}
		for(int i = 2;i<a;i++)
		{
			if(a % i ==0)
			{
				status = false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size :");
	  int size = sc.nextInt();
	  int[] n = new int[size];
	  System.out.println("Enter a Elements :");
	  
	  for(int i =0;i<size;i++)
	  {
		  n[i] = sc.nextInt();  
	  } 
	  
	  System.out.println("Representing the Number :");
	  for(int a :n )
	  {
		  if(isPrime(a))
		  {
			  System.out.print(a);
		  }
	  }
	}
}
