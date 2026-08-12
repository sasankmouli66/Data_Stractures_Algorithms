package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Pointers {

	public static void main(String[] args) {
		int[] n = { 2, 3, 6, 8, 9, 11, 12 };
		int [] arr=new int[2];
		int target = 15;
		int left = 0;
		int right = n.length-1;
		boolean status = true;
		List<int[]> ans=new ArrayList<>();
		while(left<right)
		{
			int sum = n[left] + n[right];
			
			if(sum == target)
			{
				System.out.println(n[left] + "+" + n[right]+" = "+ sum);
//				arr[0]=n[left];
//				arr[1]=n[right];
				ans.add(new int[]{n[left],n[right]});
				status = false;
				left++;
				right--;
			}
			else if(sum < target)
			{
				left++;
			}
			else
			{
				right--;
			}
//			for(int i:arr) {
//				System.out.print(i+ " ");
//			}
		}
		for(int i[]:ans) {
			System.out.print(Arrays.toString(i));
		}
		if(status)
		{
			System.out.println("Not Valid");
		}
	}

}
