package com.numberprograms;
import java.util.Scanner;
public class Prime_check {

	public static void main(String[] args) {
	System.out.println("Enter a number :");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(prime(n)) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Not Prime");
	}
	}

	static boolean prime(int n) {
		int count =0;
		
		for(int i = 1;i <= n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
}
