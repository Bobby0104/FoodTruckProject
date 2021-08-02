package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private static int id = 1;
	private String name;
	private String food;
	private double rating;
	private int newId;
	
	public FoodTruck() {}

	public FoodTruck(String name, String food, double rating) {
		this.newId = id;
		this.name = name;
		this.food = food;
		this.rating = rating;
		id++;	
	}

	public int getNewId() {
		return newId;
	}


	public void setNewId(int newId) {
		this.newId = newId;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "FoodTruck [id: " + id + ", name: " + name + ", food: " + food + ", rating: " + rating + "]";
	}


}



