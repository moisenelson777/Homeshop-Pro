package com.moise.homeshop;

import java.util.Map;

public class Bill {
	private Client client;
	private Livraison livraison;
	private Map<Produit, Integer> produits;

	public Bill(Client client, Livraison livraison) {
		this.client = client;
		this.livraison = livraison;
	}

	public void addProduct(Produit produit, Integer quantite) {
		this.produits.put(produit, quantite);
		
	}

	public Client getClient() {
		return client;
	}

	public Map<Produit, Integer> getProduits() {
		return produits;
	}
	

}
