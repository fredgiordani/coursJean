package com.idp.aston.exo2;

public class Chassis {

	private double poidsChassis;

	public Chassis(double poidsChassis) {
		this.poidsChassis = poidsChassis;
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

	public void afficher() {
		System.out.println("puissance du chassis: " + this.poidsChassis);
	}

}
