package com.array;

public class Missing_elements {

	public static void main(String[] args) {
		int[] num = {1,3,4,5};
		int n = 5;
		int actutalSum = 0;
		
		int expectedSum = n*(n+1)/2;
		
		for(int i = 0;i<num.length;i++)
		{
			actutalSum += num[i];
		}
		int result = expectedSum - actutalSum;
		System.out.println(result);
	}

}
