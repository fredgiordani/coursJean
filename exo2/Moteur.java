package com.idp.aston.exo2;

public class Moteur {

	private int puissanceMoteur;
	private double poidsMoteur;

	public Moteur(int puissanceMoteur, double poidsMoteur) {
		super();
		this.puissanceMoteur = puissanceMoteur;
		this.poidsMoteur = poidsMoteur;
	}

	/**
	 * @return the puissanceMoteur
	 */
	public int getPuissanceMoteur() {
		return this.puissanceMoteur;
	}

	/**
	 * @param puissanceMoteur the puissanceMoteur to set
	 */
	public void setPuissanceMoteur(int puissanceMoteur) {
		this.puissanceMoteur = puissanceMoteur;
	}

	/**
	 * @return the poidsMoteur
	 */
	public double getPoidsMoteur() {
		return this.poidsMoteur;
	}

	/**
	 * @param poidsMoteur the poidsMoteur to set
	 */
	public void setPoidsMoteur(double poidsMoteur) {
		this.poidsMoteur = poidsMoteur;
	}

	public void afficher() {
		System.out.println("puissance du moteur: " + this.puissanceMoteur + " , poids du moteur: " + this.poidsMoteur);
	}

}
