package com.studycase;
public class Movie {
	String movie_Name;
	String language;
	double ticket_Price;

	Movie(String movie_Name, String language, double ticket_Price) 
	{
		this.movie_Name = movie_Name;
		this.language = language;
		this.ticket_Price = ticket_Price;	
	}

	Movie(Movie m,String a,double b) 
	{
		this.movie_Name = a;
		this.language = m.language;
		this.ticket_Price = b;	
	}

	public static void main(String[] args) {

		Movie m = new Movie("Paradise","Telugu",600);
		m.show();
		
		Movie m1 = new Movie(m,"Toxic",500);
		m1.show();
		
	}

	void show() {
		System.out.println("Movie Name   :"+movie_Name);
		System.out.println("Language     :"+language);
		System.out.println("Ticket Price :"+ticket_Price);
		System.out.println("----------------------------------");
	}

}
