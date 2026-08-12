package com.array;
import java.util.Scanner;
public class Min_Max_Array {

	public static void main(String[] args) {
//		int[] a = {55,99,72,102,55};
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i = 0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for(int i = 0;i<a.length;i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
			if(max<a[i])
			{
				max = a[i];
			}	
		}
		System.out.println("Minnimum = "+min);
		System.out.println("Maximum = "+max);

	}

}
