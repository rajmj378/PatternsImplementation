package com.templatePattern;

public class Application
{
	public static void main(String [] args)
	{
		// Create company objects
		Company[] companies =
		{
			new Customer("Kinko", "302 South Main", "612 320 0090", 
					"612 320 0099", 15),
			new Customer("Starbucks", "132 South 4th", "612 320 2302", 
					"612 320 2300", 600),

			new Vendor("IBM", "213 North Main", "612 320 2039", "", "98-444-24", 
					"Computer"),
			new Vendor("Sun", "100 N Sunset", "650 248 9096", "", "74-674-11", 
					"Computer"),
			new Vendor("That Food Place", "Somewhere over there", "", 
					"500 432 9294", "58-628-77", "Food"),

			new TravelCompany("All Directions", "104 S Madison", "612-234-0987", 
					"")
		};

		// Invoke show() method on all company objects regardless of subtype
		for (int i = 0; i < companies.length; i++) 
			companies[i].show();
	}
}