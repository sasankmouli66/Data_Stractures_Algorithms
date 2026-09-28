//WAP Print numbers from 1 to 5 using nested loops.

package com.nestedloop;

public class Numbers1 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 3) {
			int j = 1;
			while(j <= 3) {
				System.out.println(i +" "+ j);
				j++;
			}
			i++;
		}

	}

}

