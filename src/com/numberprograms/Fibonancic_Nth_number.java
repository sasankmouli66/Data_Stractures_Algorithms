package com.numberprograms;
import java.util.Scanner;
public class Fibonancic_Nth_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	
	int first = 0;
	int second = 1;
	
	if(n == 0) {
		System.out.println("Fibonanic 0");
	}
	else if(n == 1) {
		System.out.println("Fibonanic 1");
	}
	else {
		for(int i = 2; i <= n;i++) {
			
			int next = first + second;
			
			first = second;
			second = next;
		}
		System.out.println(second);
	}
	

	}

}
