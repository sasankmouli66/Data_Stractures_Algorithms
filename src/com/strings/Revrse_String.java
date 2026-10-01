package com.strings;

public class Revrse_String {

	public static void main(String[] args) {
		String c = "sasank";
		
		String rev = " ";
		for(int i = c.length()-1;i >= 0;i--) {
			rev = rev + c.charAt(i);
			
		}
		System.out.println(rev);

	}

}
