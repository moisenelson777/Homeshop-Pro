package com.moise.paris;

public class Taxi implements MoyenDeLocomotion {

	@Override
	public void deplace(String adresse) {
		System.out.println("Je suis un taxi et je vais � l'adresse "+adresse);

	}

}
