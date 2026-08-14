package com.array;
import java.util.Arrays;
public class Merge_sort {
	public static void main(String[] args) {
		int[] n = {3,1,4,1};
		System.out.println("Before sort : "+Arrays.toString(n));
		divide(n);
        System.out.println("After sort : " + Arrays.toString(n));
	}
	static void divide(int[] n) 
	{
		if(n.length == 1) {
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
		System.out.println("Left Sort Arrya : "+ Arrays.toString(left));
		divide(right);
		System.out.println("Right Sort Array :"+ Arrays.toString(right));
//		
	}
//	static void merge(int[] n,int[] left,int[] right) {
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
		
					
	}

