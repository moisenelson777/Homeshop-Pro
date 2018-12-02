package com.moise.homeshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LivraisonRelayTest {

	 @Test
	    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
	        Livraison livraison = new LivraisonRelay(5);
	        assertEquals(0.0, livraison.getPrix(), 0.01);
	    }

	    @Test
	    public void Given_LowPriceRelay_WhenGettingDeliveryPrice_ThenGet2e99() {
	    	Livraison livraison = new LivraisonRelay(27);
	        assertEquals(2.99, livraison.getPrix(), 0.01);
	    }

	    @Test
	    public void Given_HighPriceRelay_WhenGettingDeliveryPrice_ThenGet4e99() {
	    	Livraison livraison = new LivraisonRelay(52);
	        assertEquals(4.99, livraison.getPrix(), 0.01);
	    }

	}