package com.array;
import java.util.Arrays;
public class Bubble2 {

	public static void main(String[] args) {
		int[] n = {5,3,8,4};
		System.out.println("Before Sort : "+Arrays.toString(n));
		divide(n);
		System.out.println("After Sort : "+Arrays.toString(n));
	}
	static void divide(int[] n)
	{
		if(n.length == 1)
		{
			return;
		}
		int i;
		int[] left = new int[n.length/2];
		int[] right = new int[n.length - left.length];
		
		for(i = 0;i<left.length;i++)
		{
			left[i] = n[i];
		}
		
		for(int j = 0;j<right.length;j++)
		{
			right[j] = n[i]; 
			i++;
		}
		
		divide(left); 
		System.out.println("Left Array : "+Arrays.toString(left));
		divide(right); 
		System.out.println("right Array : "+Arrays.toString(right));
		
		merge(n,left,right);
	}
	static void merge(int[] n,int[] left,int[] right)
	{
		int i=0,j=0,k=0;
		
		while(i<left.length && j < right.length)
		{
			if(left[i] < right[j])
			{
				n[k++] = left[i++];
			}
			else
			{
				n[k++] = right[j++];
			}
		}
		while(i<left.length)
		{
			n[k++] = left[i++];
		}
		while(j<right.length)
		{
			 n[k++] = right[j++];
		}
	}

}
