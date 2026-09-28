package com.numberprograms;
import java.util.Scanner;
public class Fibonacci_recursion {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int  n = sc.nextInt();
	
	int fibonic = fibo(n);
	System.out.println(fibonic);

	}
	
	static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return fibo(n - 1) + fibo(n - 2);
	}

}
