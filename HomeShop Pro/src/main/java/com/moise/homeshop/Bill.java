package com.moise.homeshop;

import java.util.Map;

public class Bill {
	private Customer customer;
	private Map<Produit, Integer> produits;

	public Bill(Customer customer) {
		this.customer = customer;
	}

	public void addProduct(Produit produit, Integer quantite) {
		this.produits.put(produit, quantite);
		
	}

	public Customer getCustomer() {
		return customer;
	}

	public Map<Produit, Integer> getProduits() {
		return produits;
	}
	

}
