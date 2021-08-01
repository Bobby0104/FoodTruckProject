package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	public int id;
	public String name;
	public String food;
	public double rating;
	
	
	
	
	public FoodTruck() {
		
	}


	public FoodTruck(int id, String name, String food, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.food = food;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
		return "FoodTruck [id=" + id + ", name=" + name + ", food=" + food + ", rating=" + rating + "]";
	}

	


}



