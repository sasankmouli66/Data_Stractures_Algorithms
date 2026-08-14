package com.array;

import java.util.Arrays;

public class Selection_Sort_maximun {

	public static void main(String[] args) {
		int[] data = {64, 25, 12, 22, 11};///inillization and decleration
		int temp = 0;
		//creation
		for(int i = 0;i<data.length-1;i++)
		{
			int minIndex = i;
			for(int j = i+1;j<data.length;j++)
			{
				if(data[j] > data[minIndex]) 
				{
				minIndex = j;
				}
			}
				temp = data[i];
				data[i] = data[minIndex];
				data[minIndex] = temp;
		}
		for(int n : data) {
			System.out.print(n+" ");
		}
		//System.out.println(Arrays.toString(data));
	}
}
