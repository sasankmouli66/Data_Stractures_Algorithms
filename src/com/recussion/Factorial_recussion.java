package com.recussion;
import java.util.Scanner;
public class Factorial_recussion {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int c = fact(n);
	System.out.println(c);

	}
	
	static int fact(int n) {
		if(n ==0 || n == 1) {
			return n;
		}
		
		return n * fact(n - 1);
	}

}
