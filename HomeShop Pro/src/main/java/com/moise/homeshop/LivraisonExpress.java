package com.moise.homeshop;

public class LivraisonExpress implements Livraison {

	private String ville;
	
	public LivraisonExpress(String ville) {
		this.ville = ville;
	}
	
	@Override
	public double getPrix() {
		if(this.ville.equals("Paris"))
		return  6.99;
		else
		return 9.99;
	}

}
