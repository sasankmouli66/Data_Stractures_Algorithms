package com.numberprograms;
import java.util.Scanner;
public class Authropic_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	
	int squre = n * n;
	
	if(squre % 100 == n) {
		System.out.println("Authropic Number");
	}
	else {
		System.out.println("not Authropic number");
	}

	}

}
