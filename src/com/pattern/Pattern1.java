package com.pattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  :");
		int n = sc.nextInt();
//		int n1 = sc.nextInt();
		
		for(int i = 1;i <= n; i++) {
			for(int j = 1;j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int k = 1;k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		for(int l = n1;l >= 1; l--) {
//			for(int m = 1;m <= n1 - l; m++) {
//				System.out.print("  ");
//			}
//			for(int o = 1;o <= l; o++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}

}

//Enter a number  :
//4
//      * 
//    * * 
//  * * * 
//* * * * 


