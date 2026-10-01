package com.strings;

public class Plalidrone_String {

	public static void main(String[] args) {
		String ch = "madam";
		String rev = "";
		for(int i = ch.length()-1;i >=0;i--) {
			
			rev = rev + ch.charAt(i);
		}
		
		if(rev.equals(ch)) {
			System.out.println("Palidrone");
		}
		else {
			System.out.println("Not palidrone");
		}

	}

}
