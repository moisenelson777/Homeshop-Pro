package com.moise.homeshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LivraisonExpressTest {

	 @Test
	    public void Given_RegionCityAsLocation_WhenGettingDeliveryPrice_ThenGet9e99() {
		 Livraison livraison = new LivraisonExpress("Bordeaux");
	        assertEquals(9.99, livraison.getPrix(), 0.01);
	    }
	    @Test
	    public void Given_ParisAsLocation_WhenGettingDeliveryPrice_ThenGet6e99() {
	    	Livraison livraison = new LivraisonExpress("Paris");
	        assertEquals(6.99, livraison.getPrix(), 0.01);
	    }
	}