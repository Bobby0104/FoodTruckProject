package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	FoodTruck[] foodTrucks;
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp foodTruck = new FoodTruckApp();
		foodTruck.start();
	}
	
	public FoodTruckApp() {
		this.foodTrucks = new FoodTruck[5];
	}

	public void menu() {
		System.out.println("********************************");
		System.out.println("*     Bobbys Food Truck App!   *");
		System.out.println("********************************");
		System.out.println("*     1: List food trucks      *");
		System.out.println("*     2: See average ratings   *");
		System.out.println("*     3: See highest ratings   *");
		System.out.println("*     4:       Quit            *");
		System.out.println("********************************");
	}
	
	public void start() {
		createFoodTrucks(kb);
		while (foodTrucks.length > 0) {
			menu();
			String select = kb.next();
			if (select.equals("1")) {
				foodTruckListing();
			} else if (select.equals("2")) {
				trucksRatingAvg();
			} else if (select.equals("3")) {
				bestRatedTruck();
			} else if (select.equals("4")) {
				break;
			} else {
				System.out.println("Invalid response. Please Try again.");
			}
			System.out.println();
			continue;
		}
	}
	
	public void createFoodTrucks(Scanner kb) {
		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.println("Enter your food truck's name: ");
			String name = kb.next();
			if (name.equalsIgnoreCase("quit")) {
				System.out.println("Completed Food Truck input. Continue with the next menu option");
				break;
			}
			System.out.println("Enter your type of food: ");
			String food = kb.next();
			System.out.println("Enter your Food Truck rating 1-5: ");
			int rating = kb.nextInt();
			foodTrucks[i] = new FoodTruck(name, food, rating);
		}
	}
	
	public void foodTruckListing() {
		for (FoodTruck foodTrucks2 : foodTrucks) {
			if (foodTrucks2 == null) {
				break;
			}
			System.out.println(foodTrucks2.toString());
		}
	}
	
	public void trucksRatingAvg() {
		double sum = 0;
		int count = 0;
		for (FoodTruck truck : foodTrucks) {
			if (truck == null) {
				break;
			}
			sum += truck.getRating();
			count++;
		}
		System.out.println("Average Rating: " + (Math.round((sum / count) * 10) / 10.0));
	}
	
	public void bestRatedTruck() {
		int numOf = 0;
		double highestRating = Integer.MIN_VALUE;
		for (FoodTruck foodTrucks2 : foodTrucks) {
			if(foodTrucks2 == null) {
				break;
			}
			if (highestRating == foodTrucks2.getRating()) {
				numOf++;
			}
			if (highestRating < foodTrucks2.getRating()) {
				highestRating = foodTrucks2.getRating();
				numOf = 0;
			} else {
				continue;
			}
		}
		System.out.printf("The highest rated food truck is "+ "%.2f",highestRating);
	}
	
}

