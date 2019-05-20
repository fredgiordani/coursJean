package com.idp.aston.exo1;

public class Execute {

	public static void main(String[] args) {
		//Créer une classe CMain (dans le fichier com.formation.test)comportant le point d'entrée main() .
		//
		//Dans la fonction main() créer une instance de la classe CVoiture et l'afficher.
		//
		//On veut pouvoir saisir sur la ligne de commande la marque et la puissance de la
		//voiture. Tester si 2 arguments sont passés sur la ligne de commande
		//
		//si oui, les passer au constructeur
		//si non, utiliser par défaut "Renault" pour la marque et 55 pour la puissance



		if(args.length ==2) {
			System.out.println("le tableau d' élèment contient 2 élèments");
			Voiture voiture1 = new Voiture(args[0], Integer.parseInt(args[1]));
			voiture1.afficher();
		}else {
			Voiture voiture1 = new Voiture();
			voiture1.afficher();
		}

		Voiture voiture1 = new Voiture();
		voiture1.afficher();








	}

}
