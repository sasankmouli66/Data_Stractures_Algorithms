package com.numberprograms;
import java.util.Scanner;
public class Sum_digits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	
	int temp = 0;
	int sum = 0;
	while(n > 0) {
		temp = n % 10;
		sum = sum + temp;
		n = n / 10;
	}
	System.out.println(sum);

	}

}
