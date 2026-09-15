package com.array2D;

public class Diagnols_array {

	public static void main(String[] args) {
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60},
			    {70, 80, 90}
			};
		dignola(arr);
		
	}
	
	static void dignola(int[][] arr){
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i][i] + " ");
		}
		
		
		
	}

}
