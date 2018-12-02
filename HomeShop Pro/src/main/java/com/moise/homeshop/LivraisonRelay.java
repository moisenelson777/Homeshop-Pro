package com.moise.homeshop;

public class LivraisonRelay implements Livraison {

	private int numeroRelay;
	
	public LivraisonRelay(int numeroRelay) {
		this.numeroRelay = numeroRelay;
	}
	
	@Override
	public double getPrix() {
		if (this.numeroRelay >= 1 && this.numeroRelay <= 22)
		return 0;
		else if (this.numeroRelay >= 23 && this.numeroRelay <= 47)
			return 2.99;
		else
			return 4.99;
	}

}
