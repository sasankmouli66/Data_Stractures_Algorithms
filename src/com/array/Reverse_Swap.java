package com.array;
import java.util.Arrays;
//import java.util.Scanner;

public class Reverse_Swap {

	public static void main(String[] args) {
		int[] n = {5,6,7,8,9,10};
		//Scanner sc = new Scanner(System.in);
		int temp;
		int left = 0;
		int right = n.length-1;
		while(left < right)
		{
			temp = n[left];
			n[left] = n[right];
			n[right] = temp;
			left++;
			right--;			
		}
		System.out.println(Arrays.toString(n).replace(" ",""));
	}
}


//==================Input Function =======================
//public class Reverse_Swap {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int[] n = new int[size];
//		for(int i = 0;i<n.length;i++) {
//			n[i] = sc.nextInt();
//		}
//		
//		int temp ;
//		int left = 0;
//		int right = n.length-1;
//		while(left < right)
//		{
//			
//			temp = n[left];
//			n[left] = n[right];
//			n[right] = temp;
//			left++;
//			right--;			
//		}
//		System.out.println(Arrays.toString(n).replace(" ",""));
//	}
//}
