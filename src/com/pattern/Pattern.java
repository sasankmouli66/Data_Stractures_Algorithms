package com.pattern;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number  :");
	int n = sc.nextInt();
	
	for(int i = 1;i <= n ;i++) {
		for(int j = 1; j <= n - i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}

	}

}

// output
//Enter a number  :
//6
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

