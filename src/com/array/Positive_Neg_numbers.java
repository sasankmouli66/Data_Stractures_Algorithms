package com.array;

public class Positive_Neg_numbers {

	public static void main(String[] args) {
		int[] arr = {2,4,-6,0,3};
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int number:arr)
		{
			if(number > 0)
			{	
				positive++;
				
			}
			else if(number < 0)
			{
				negative++;
			}
			else if(number == 0)
			{
				zero++;
			}
	
		}	
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(zero);
	}

}
