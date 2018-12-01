package com.moise.garage;

import java.util.ArrayList;
import java.util.List;

public class Voiture extends Vehicule {
	
	private int porte;
    private int litrePar100km;
    private String moteur;
    private List<String> options = new ArrayList<String>();
    
	public Voiture(String modelName, String description, String manufacturer, int year, String color, int speed,
			int[] dimensions, int weight, int porte, int litrePar100km, String moteur, List<String> options) {
		
		super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
		
		this.porte = porte;
        this.litrePar100km = litrePar100km;
        this.moteur = moteur;
        this.options = options;
	}
	
	public void allumerLesPhares() {
		System.out.println("J'allume les phares");
	}
	
	public void ouvrirLeCoffre() {
		System.out.println("Jouvre mon coffre");
	}

	public int getPorte() {
		return porte;
	}

	public int getLitrePar100km() {
		return litrePar100km;
	}

	public String getMoteur() {
		return moteur;
	}

	public List<String> getOptions() {
		return options;
	}

	@Override
	public void start() {
		System.out.println("Je suis " + modelName + " je consomme " + litrePar100km + " au 100km et je démarre !" );
		
	}

	@Override
	public void stop() {
		System.out.println("Je suis " + modelName + " j'arrête mon moteur " + moteur);
	}
	

}
