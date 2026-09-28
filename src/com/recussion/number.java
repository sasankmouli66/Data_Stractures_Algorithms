//WAP a program n number Print in reversive

package com.recussion;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = printNumber(n);

	}
	
	static int printNumber(int n) {
		if(n == 0) {
			return n;
		}
		
		System.out.println(n);
		return printNumber( n - 1);
	}

}
