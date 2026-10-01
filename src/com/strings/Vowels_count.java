package com.strings;

public class Vowels_count {

	public static void main(String[] args) {
		String a = "i am is best";
		
		int count = 0;
		for(int i = 0;i < a.length();i++) {
			char ch = Character.toLowerCase(a.charAt(i));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
