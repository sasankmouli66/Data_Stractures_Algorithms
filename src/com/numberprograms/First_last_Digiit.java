package com.numberprograms;
import java.util.Scanner;
public class First_last_Digiit {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	int sum = digit(n);
	System.out.println("Sum    :"+sum);

	}

	static int digit(int n) {
		int sum = 0;
		
		int temp = n;
		int lastDigit = temp % 10;
		while(temp >= 10) {
			temp = temp / 10;
			
		}
		
		int firstDigit = temp;
		System.out.println("Last Digit  :"+lastDigit);
		System.out.println("First Digit  :"+ firstDigit);
		sum = firstDigit + lastDigit;
		return sum;
	}
}
