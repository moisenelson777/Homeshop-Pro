package com.moise.garage;

public class Vehicule {
	String modelName;
	String description; 
	String manufacturer;
	int year;
	String color;
	int speed;
	int [] dimensions;
	int weight;
	public Vehicule(String modelName, String description, String manufacturer, int year, String color, int speed, int [] dimensions, int weight){
		this.modelName = modelName;
		this.description = description;
		this.manufacturer = manufacturer;
		this.year = year;
		this.color = color;
		this.speed = speed;
		this.dimensions = dimensions;
		this.weight = weight;
	   }
		
	public void start() {
		System.out.println("Je suis "+this.modelName+" et je démarre");
	}
	
	public void stop() {
		System.out.println("Je suis "+this.modelName+" et je m'arrete");
	}

	public String getModelName() {
		return modelName;
	}

	public String getDescription() {
		return description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	public int getWeight() {
		return weight;
	}
	
	
	}

