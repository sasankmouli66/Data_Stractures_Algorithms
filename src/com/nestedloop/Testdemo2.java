package com.nestedloop;

public class Testdemo2 {

	public static void main(String[] args) {
		
		
		for(int i = 1;i <= 3;i++) {
			for(int j = 1;j <= 3;j++) {
				if(i == j || i == j+2 || i+2==j) {
					System.out.print(1 + " ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
