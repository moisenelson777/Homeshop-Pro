package com.moise.homeshop;

public class Fridge extends Produit {
	int volume; 
	boolean congelateur;
	public Fridge(String nom, String description, double prix, int volume, boolean congelateur) {
		super(nom, description, prix);
		this.volume = volume;
		this.congelateur = congelateur;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isCongelateur() {
		return congelateur;
	}

	
}
