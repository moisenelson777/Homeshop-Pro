package com.moise.homeshop;

public class Television extends Produit {
	int size;
	String typeEcran;
	
	public Television(String nom, String description, double prix, int size, String typeEcran) {
		super(nom, description, prix);
		this.size = size;
		this.typeEcran = typeEcran;
	}

	public String getTypeEcran() {
		return typeEcran;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
