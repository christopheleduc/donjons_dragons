import java.util.*;
//import java.lang.reflect.*;
//import java.util.Random;
//import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String nom = null;
		String image = null;
		String type = null;
		String warrior = ("Guerrier");
		String magician = ("Magicien");
		int verif = 0;
		int min = 5;
		int max = 10;
		int life = r.nextInt(max - min + 1) + min;
		int force = r.nextInt(max - min + 1) + min;
		int mort = 0;
		
		//System.out.println("Niveau de vie: " + life);
		//System.out.println("Niveau de vie: " + force);

		Personnage combatant;
		// Choix du type de personnage
		while(verif != 1) {	
			System.out.println("Choisissez un type de personnage: Guerrier ou Magicien  ");
			Scanner capture = new Scanner(System.in);
			type = capture.nextLine();
			
				if(type.equals(warrior)) {
					combatant = new Warrior();
					combatant.setType(type);
					System.out.println("Vous avez choisi " + combatant.getType() + " !");
					verif = 1;
					System.out.println(combatant); //debug
					combatant.Show(); // debug
					//return;
				} else if (type.equals(magician)){
					combatant = new Magician();
					combatant.setType(type);
					System.out.println("Vous avez choisi " + combatant.getType() + " !");
					verif = 1;
					System.out.println(combatant); //debug
					combatant.Show(); //debug
					//Object get(combatant_01);
					//return;
				} else {
					System.out.println("Vous devez choisir un type de personnage!");
				}
		}

		verif = 0;

		// Choix du nom du personnage
		while(verif != 1) {	
			System.out.println("Choisissez un nom pour votre personnage.");
			Scanner capture = new Scanner(System.in);
			nom = capture.nextLine();
				if(nom.equals("")) {
					System.out.println("Vous devez entrer un nom pour votre personnage!");
				} else {

					Warrior combatant_01 = new Warrior(nom, image, type);
					//Object get(combatant_01);
					//Object combatant_01.setNom(nom);

					System.out.println("Vous avez choisi " + combatant_01.getNom() + " !");
					combatant_01.Show();
					verif = 1;
				}
		}

		verif = 0;

		// Routine Vie/Mort
		while(life != mort) {

			// Affiche la force et la vie
			System.out.println("Points d'attaque: [" + force + "]");
			System.out.println("Niveau de vie: [" + life + "]");
			// Simule un combat
			System.out.println("Combatez !  ");
			Scanner tour = new Scanner(System.in);
			type = tour.next();
			System.out.println("Votre attaque: " + type);
			life = life - 1;
			
		}
		
		System.out.println("Niveau de vie: [" + life + "] Vous etes mort!");
		
	}

}
