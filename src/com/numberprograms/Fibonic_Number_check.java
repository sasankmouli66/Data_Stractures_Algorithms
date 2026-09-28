package com.numberprograms;
import java.util.Scanner;
public class Fibonic_Number_check {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int nums = sc.nextInt();
	
	int first = 0;
	int second = 1;
	boolean found = false;
	
	for(int i = 0;i < nums;i++) {
		if(first == nums)
		{
			found = true;
		}
		int next = first + second;
		
		first = second;
		second = next;
	}
	if(found) {
		System.out.println("Fibonic number");
	}
	else {
		System.out.println("not fibonic");
	}
	

	}

}
