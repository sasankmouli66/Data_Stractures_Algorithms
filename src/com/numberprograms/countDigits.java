package com.numberprograms;
import java.util.Scanner;
public class countDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count = 0;
	int temp = 0;
	while(n > 0) {
		temp = n % 10;
		count++;
		n = n / 10;
	}
	System.out.println("Count Digits :"+ count);

	}

}
