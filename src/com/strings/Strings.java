package com.strings;
import java.util.Scanner;

//public class Strings {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String M = sc.nextLine();
//		String rev = "";
//		int len = M.length();
//		
//		for(int i = len-1; i>=0;i--)
//		{
//			rev += M.charAt(i);
//			
//		}	
//		System.out.println("Enter a String : "+ rev);
//		if (rev == M)
//		{
//			System.out.println("It is Palidrone");
//		}
//		else
//		{
//			System.out.println("Not Palidrome");
//		}
//	}
//}

//=================== Using Array ===================

//public class Strings {
//	public static void main(String [] args) {
//		String D = "Prasad";
//		String rev = "";
//		char a[] = D.toCharArray();
//		int len = D.length();
//		for(int i = len-1;i>=0;i--) {
//			rev += a[i];
//		}
//		System.out.println(rev);
//	}
//}

//================== Using Method ==================
//public class Strings
//{
//	void main()
//	{
//		String A = "Akieikya";
//		String rev = "";
//		int len = A.length();
//		for(int i = len-1;i>=0;i--) 
//		{
//			rev += A.charAt(i);	
//		}
//		System.out.println(rev);
//	}
//	public static void main(String[] args) 
//	{
//		Strings sc = new Strings();
//		sc.main();
//	}
//}


//================= Using while Loop ==========================

//public class Strings{
//	public static void main(String[] args)
//	{
//		String A = "Akieikya";
//		String rev = "";
//		int len = A.length()-1;
//		while(len>=0)
//		{
//			rev += A.charAt(len);
//			len--;
//		}
//		System.out.println(rev);
//	}
//}

//==============================================================

public class Strings{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] words = a.split(" ");
		
		for (int i=0;i<words.length;i++)
		{
			String rev = " ";
		for(int j = words[i].length()-1;j>=0;j--)
		{
			rev += words[i].charAt(j);
		}
		System.out.print(rev +"");
		}
	   		
//		if(rev.equals(a)) {
//			System.out.println("palidrome");
//		}
//		else{
//			System.out.println("not palidrome");
//		}
	}
}
	
	
	
	
	
	
	
	
	
	
