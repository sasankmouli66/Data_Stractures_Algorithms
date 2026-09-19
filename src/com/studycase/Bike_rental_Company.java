package com.studycase;
import java.util.Scanner;
public class Bike_rental_Company {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Customer :");
		int customer = sc.nextInt();
		double totalIncome = 0;
		for(int i = 1;i <= customer;i++) {
			System.out.println("No. of bike rented Customer :"+ i );
			int bikes = sc.nextInt();
			
			int bikeCount = 1;
			double customerBill = 0;
			
			while(bikeCount <= bikes) {
				System.out.println("Enter a Rental Hours for bikes :"+ bikeCount);
				int hours  = sc.nextInt();
				
				double charge = hours * 50;
				if(hours <= 5) {
					charge = charge - (charge + 0.10);
				}
				System.out.println("Bike "+ bikeCount + " Charge "+charge);
				customerBill = customerBill + charge;
				bikeCount++;
			}
			System.out.println("Customer "+ i + " Bill " + customerBill);
			totalIncome = totalIncome + customerBill;
		}
		System.out.println("------------------------------");
		System.out.println("Total income for Day :"+ totalIncome);

	}

}
