package com.moise;

import com.moise.homeshop.*;
import com.moise.paris.Bus;
import com.moise.paris.MoyenDeLocomotion;
import com.moise.paris.Parisien;
import com.moise.paris.Taxi;
public class Main {

	public static void main(String[] args) {
	  /*
		Produit cafe = new Produit("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
	    Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
	    Refrigerateur fridge = new Refrigerateur("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
	    
	    Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
	    
	    Bill bill = new Bill(customer);
	    bill.addProduct(cafe, 1);
	    bill.addProduct(tv, 1);
	    bill.addProduct(fridge, 1); */
		
		Parisien noelle = new Parisien();
		
		Bus bus = new Bus();
		noelle.seDeplacer(bus);
		Taxi taxi = new Taxi();
		noelle.seDeplacer(taxi);
		MoyenDeLocomotion taxi2 = new Taxi();
		noelle.seDeplacer(taxi2);
		
	 }
}
