// How do print one row At one Column

package com.array2D;
import java.util.Scanner;
public class Testdemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size1");
		int size1 = sc.nextInt();
		System.out.println("Enter size2");
		int size2 = sc.nextInt();
		System.out.println("enter a array values");
		int[][] n = new int [size1][size2];
		
		for(int i = 0;i<size1;i++)
		{
			for(int j= 0;j<size2;j++)
			{
				n[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0;i<size1;i++)
		{
			for(int j= 0;j<size2;j++)
			{
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}
