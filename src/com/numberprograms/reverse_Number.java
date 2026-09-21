package com.numberprograms;
import java.util.Scanner;
public class reverse_Number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int result = rev(n);
	System.out.println(result);

	}
	
	static int rev(int n) {
		int temp = 0;
		int rev = 0;
		
		while(n > 0) {
			temp = n % 10;
			rev = rev * 10 + temp;
			n = n / 10;
		}
		return rev;
	}

}
