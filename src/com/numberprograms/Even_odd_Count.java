package com.numberprograms;
import java.util.Scanner;
public class Even_odd_Count {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int n = sc.nextInt();
	count(n);

	}
	
	static int count(int n) {
		int even = 0;
		int odd = 0;
		int temp = 0;
		while(n > 0) {
			temp = n % 10;
			if(temp % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			n = n / 10;
		}
		System.out.println("Even count :"+ even);
		System.out.println("Odd count  :"+ odd);
		return temp;
	}

}
