package com.idp.aston.exo2;

public class Voiture {

	String marque;
	double vitesseMax;
	double poidsTotal;
	double poidsChassis;
	int puissanceMoteur;
	double poidsMoteur;

	static Chassis chassis;
	static Moteur moteur;

	public Voiture() {
		this("Renault",55);

	}

	public Voiture(String marque, int puissanceMoteur) {
		this(marque, 190, 800, 120,puissanceMoteur, 100, chassis, moteur);
		Voiture.chassis = new Chassis(120);
		Voiture.moteur = new Moteur(puissanceMoteur,100);


	}

	public Voiture(String marque, int puissanceMoteur, double vitesseMax) {
		this(marque, vitesseMax, 800, 120, puissanceMoteur, 100,chassis, moteur);
		Voiture.chassis = new Chassis(this.poidsChassis);
		Voiture.moteur = new Moteur(this.puissanceMoteur,this.poidsMoteur);
	}

	public Voiture(String marque, double vitesseMax, double poidsTotal, double poidsChassis, int puissanceMoteur,
			double poidsMoteur,Chassis chassis,Moteur moteur) {
		super();
		this.marque = marque;
		this.vitesseMax = vitesseMax;
		this.poidsTotal = poidsTotal;
		this.poidsChassis = poidsChassis;
		this.puissanceMoteur = puissanceMoteur;
		this.poidsMoteur = poidsMoteur;
		Voiture.chassis = new Chassis(poidsChassis);
		Voiture.moteur = new Moteur(puissanceMoteur,poidsMoteur);
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return this.marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the vitesseMax
	 */
	public double getVitesseMax() {
		return this.vitesseMax;
	}

	/**
	 * @param vitesseMax the vitesseMax to set
	 */
	public void setVitesseMax(double vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	/**
	 * @return the poidsTotal
	 */
	public double getPoidsTotal() {
		return this.poidsTotal;
	}

	/**
	 * @param poidsTotal the poidsTotal to set
	 */
	public void setPoidsTotal(double poidsTotal) {
		this.poidsTotal = poidsTotal;
	}

	/**
	 * @return the poidsChassis
	 */
	public double getPoidsChassis() {
		return this.poidsChassis;
	}

	/**
	 * @param poidsChassis the poidsChassis to set
	 */
	public void setPoidsChassis(double poidsChassis) {
		this.poidsChassis = poidsChassis;
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
		//System.out.println("marque: "+ this.marque  + ", vitesse max: " + this.vitesseMax + ", poids total: " + this.poidsTotal + ", poids chassis: "
		//	+ this.poidsChassis + ", puissance moteur: " + this.puissanceMoteur + ", poids moteur: " + this.poidsMoteur +
		//", poids total: "	+	this.calculerPoidsTotal() + " , vitesse max: " + this.calculerVitesseMax());

		this.getChassis().toString();
		this.getMoteur().afficher();

	}

	/**
	 * @return the chassis
	 */
	public Chassis getChassis() {
		return chassis;
	}

	/**
	 * @param chassis the chassis to set
	 */
	public static void setChassis(Chassis chassis) {
		Voiture.chassis = chassis;
	}

	/**
	 * @return the moteur
	 */
	public  Moteur getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(Moteur moteur) {
		Voiture.moteur = moteur;
	}

	private double calculerPoidsTotal() {
		this.poidsTotal = this.poidsMoteur + this.poidsChassis;
		return this.poidsTotal;
	}


	private double calculerVitesseMax() {
		this.vitesseMax = this.poidsTotal * this.puissanceMoteur/500;
		return this.vitesseMax;
	}

}

