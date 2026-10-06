//How do you find the first repeated character in a String?

package com.strings;

public class First_repeative_Char {

	public static void main(String[] args) {
		String s = "Programming";
		
		for(int i = 0;i < s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(s.indexOf(ch) != s.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}

	}

}
