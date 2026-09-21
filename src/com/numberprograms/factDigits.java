package com.numberprograms;
import java.util.Scanner;
public class factDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int fact = factorial(n);
	System.out.println(fact);
	}

	static int factorial(int n) {
		int temp = 0;
		int sum = 0;
		while(n > 0) {
			int fact = 1;
			temp = n % 10;
			
			for(int i = 1;i <= temp;i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		return sum;
		
	}

}
