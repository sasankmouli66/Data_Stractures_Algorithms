package com.studycase;

import java.util.Scanner;

public class Movie_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String y;
		double endGame_tickets_Cost = 0;
		double inception_tickets_Cost = 0;
		double interSeller_tickets_Cost  = 0;
		int total_seats = 0;
	
		do {
			System.out.println("Enter a Movie name :");
			String movie = sc.nextLine();
			switch (movie) {
			case "A" -> {
				do {
					String A = "Endgame";
					System.out.println(A);
					double seatPrice = 0;
					System.out.println("Enter seat type  :");
					String seatType = sc.nextLine();
					System.out.println("Enter how Many seats need :");
					int countSeats = sc.nextInt();

					switch (seatType) {
					case "recliners" -> {
						System.out.println("Regular Seat Price = 600");
						seatPrice = 600 * countSeats;
					}
					case "premium" -> {
						System.out.println("Regular Seat Price = 300");
						seatPrice = 300 * countSeats;
					}
					case "regular" -> {
						System.out.println("Regular Seat Price = 100");
						seatPrice = 100 * countSeats;
					}
					default -> {
						System.out.println("Invalid details");
					}
					}
					System.out.println(A);
//					System.out.println(countSeats);
//					System.out.println(seatPrice);
					endGame_tickets_Cost = seatPrice;
					total_seats = countSeats;
					System.out.println("U can Continue Endgame Tickets Enter Yes & No");
					sc.nextLine();
					y = sc.nextLine();

				} while (y.equalsIgnoreCase("yes"));
				System.out.println("Exist");
			}
			case "B" -> {
				do {
					String B = "Inception";
					System.out.println(B);
					double seatPrice = 0;
					System.out.println("Enter seat type  :");
					String seatType = sc.nextLine();
					System.out.println("Enter how Many seats need :");
					int countSeats = sc.nextInt();

					switch (seatType) {
					case "recliners" -> {
						System.out.println("Regular Seat Price = 800");
						seatPrice = 800 * countSeats;
					}
					case "premium" -> {
						System.out.println("Regular Seat Price = 500");
						seatPrice = 500 * countSeats;
					}
					case "regular" -> {
						System.out.println("Regular Seat Price = 200");
						seatPrice = 200 * countSeats;
					}
					default -> {
						System.out.println("Invalid details");
					}
					}
					System.out.println(B);
//					System.out.println(countSeats);
//					System.out.println(seatPrice);
					inception_tickets_Cost = seatPrice;
					total_seats = countSeats;
					System.out.println("U can Continue Inception Tickets Enter Yes & No");
					sc.nextLine();
					y = sc.nextLine();

				} while (y.equalsIgnoreCase("yes"));
				System.out.println("Exist");
			}
			case "C" -> {
				do {
					String C = "Interseller";
					System.out.println(C);
					double seatPrice = 0;
					System.out.println("Enter seat type  :");
					String seatType = sc.nextLine();
					System.out.println("Enter how Many seats need :");
					int countSeats = sc.nextInt();

					switch (seatType) {
					case "recliners" -> {
						System.out.println("Regular Seat Price = 600");
						seatPrice = 600 * countSeats;
					}
					case "premium" -> {
						System.out.println("Regular Seat Price = 300");
						seatPrice = 300 * countSeats;
					}
					case "regular" -> {
						System.out.println("Regular Seat Price = 100");
						seatPrice = 100 * countSeats;
					}
					default -> {
						System.out.println("Invalid details");
					}
					}
					System.out.println(C);
//					System.out.println(countSeats);
//					System.out.println(seatPrice);
					interSeller_tickets_Cost = seatPrice;
					total_seats = countSeats;
					
					System.out.println("U can Continue Interseller Tickets Enter Yes & No");
					sc.nextLine();
					y = sc.nextLine();

				} while (y.equalsIgnoreCase("yes"));
				System.out.println("Exist");
			}
			}
			System.out.println("U can Continue  Tickets Enter Yes & No");
			sc.nextLine();
			y = sc.nextLine();
			
		} while (y.equalsIgnoreCase("yes"));
		System.out.println("Exist");
		System.out.println("Total Seats Interseller :"+total_seats);
		System.out.println("-------------------------------------------------");
		System.out.println("Toatl Cost EndGame     :"+endGame_tickets_Cost);
		System.out.println("Total Cost inception   :"+inception_tickets_Cost);
		System.out.println("Total Cost Interseller :"+interSeller_tickets_Cost);
		
		sc.close();
	}
}
