package com.numberprograms;

public class Prime_factor {

	public static void main(String[] args) {
		int n = 25;
		
		for(int i = 2;i < n;i++) {
			if(n % i == 0) {
				System.out.println(i+ " ");
				n = n / i;
			}
		}

	}

}
