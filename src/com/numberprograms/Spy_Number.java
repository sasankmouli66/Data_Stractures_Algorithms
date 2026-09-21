package com.numberprograms;
import java.util.Scanner;
public class Spy_Number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int temp = 0;
	int sum = 0;
	int product = 1;
	
	while(n > 0) {
		temp = n % 10;
		sum = sum + temp;
		product = product * temp;
		n = n / 10;
	}
	System.out.println("Sum :"+sum);
	System.out.println("Product :"+product);
	
	if(sum == product) {
		System.out.println("Spy Number ");
	}
	else {
		System.out.println("Not Spy Number");
	}

	}

}
