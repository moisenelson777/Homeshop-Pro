package com.moise.homeshop;

public class Produit {

	String nom;
	String description;
	double prix;
	
	public Produit(String nom, String description, double prix) {
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}
	
	public void voir() {
		
	}
	
	public void acheter() {
		
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
