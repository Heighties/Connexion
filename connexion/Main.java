package fr.heighties.connexion;

import java.util.Scanner;

public class Main {

	// private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Entrez votre identifiant : ");

			String identifiant = scanner.nextLine();
			System.out.println("Entrez votre mot de passe : ");
			String mdp = scanner.nextLine();
			if (identifiant.equals("Geoffrey") && mdp.equals("motdepassedeGeoffrey64")) {
				System.out.println("Connecté");
			} else {
				System.out.println("Echec de connexion");
				System.exit(-1);
			}
			System.out.println("Bienvenue Geoffrey");
			System.out.println("Vos infos persos sont : .........");
		}
	}
}
