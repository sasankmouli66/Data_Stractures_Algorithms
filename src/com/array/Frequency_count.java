package com.array;

public class Frequency_count {

	public static void main(String[] args) {
		int[] n = {50,60,90,60,90,50,50,60,90,60,90,50};
		int a = 60;
		int b = 50;
		int c = 0;
		int d = 0;
		
		for(int number: n)
		{
			if(number == a)
			{
				c++;
			}
			else if(number == b)
			{
				d++;
			}	
		}
		System.out.println("number of count number:"+c);
		System.out.println("number of count :"+d);

	}

}
