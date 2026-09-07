package com.array;

import java.util.Arrays;

public class Sum_of_Pairs {

	public static void main(String[] args) {
		int[] number = {10, 20, 30, 40, 50};
		int target = 70;
		int left = 0;
		int right = number.length-1;
		boolean status = false;
		int sum;
		while(left < right)
		{
			sum = number[left] + number[right];
			
			if(sum == target)
			{
				System.out.println(sum +" = "+ number[left]+ " + "+ number[right]);
				status = true;
				left++;
				right--;
			}
			else if(sum > target)
			{
				right--;
			}
			else
			{
				left++;
			}
			
		}
		if(!status)
		{
			System.out.println("Not provide");
		}
	}

}
