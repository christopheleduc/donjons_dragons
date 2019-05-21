package game;

//import java.util.*;
import java.util.HashMap;
import java.util.Map;
//import java.lang.reflect.*;
import java.util.Random;
import java.util.Scanner;

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
		int attack;
		int mort = 0;
		//ArrayList attributs = new ArrayList<String>();
		Scanner capture = new Scanner(System.in);
		Map<String, String> attributs = new HashMap<>();
		Personnage combattant=null;
		Personnage adversaire=null;
		Attributs constant = new Attributs();
		
		//System.out.println("Niveau de vie: " + life);
		//System.out.println("Niveau de vie: " + force);

		// Choix du type de personnage
		while(verif != 1) {	
			System.out.println("Choisissez un type de personnage: Guerrier ou Magicien  ");
			//Scanner capture = new Scanner(System.in);
			type = capture.nextLine();
			
				if(type.equals(constant.getWarrior())) {
					//combattant = new Warrior();
					//Warrior combatant_01 = new Warrior();
					//combattant.setType(type);
					//System.out.println("Vous avez choisi " + combattant.getType() + " !");
					//attributs.add(warrior);
					attributs.put("type", constant.getWarrior());
					System.out.println("Vous avez choisi " + attributs.get("type") + " !");
					verif = 1;
					//System.out.println(attributs.get("type")); //debug
					//combattant.Show(); // debug
					//return;
				} else if (type.equals(constant.getMagician())){
					//combattant = new Magician();
					//Magician combattant = new Magician();
					//combattant.setType(type);
					//System.out.println("Vous avez choisi " + combattant.getType() + " !");
					//attributs.add(magician);
					attributs.put("type", constant.getMagician());
					System.out.println("Vous avez choisi " + attributs.get("type") + " !");
					verif = 1;					
					//System.out.println(attributs.get("type")); //debug
					//combattant.Show(); //debug
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
			// Scanner capture = new Scanner(System.in);
			nom = capture.nextLine();
				if(nom.equals("")) {
					System.out.println("Vous devez entrer un nom pour votre personnage!");
				} else {

					//Warrior combattant = new Warrior(nom, image, type);
					//Object get(combatant_01);
					//Object combatant_01.setNom(nom);
					attributs.put("nom", nom);
					System.out.println("Vous avez choisi " + attributs.get("nom") + " !");
					System.out.println(attributs.toString());// debug

					//System.out.println("Vous avez choisi " + combattant.getNom() + " !");
					//combattant.Show();
					verif = 1;
				}
		}

		verif = 0;

		// Instanciation des joueurs
		if(attributs.containsKey("type") && attributs.containsKey("nom") && attributs.get("type").equals(constant.getWarrior())) {
			combattant = new Warrior(attributs.get("nom"), "warrior.png", attributs.get("type")) ; //On instancie le joueur
			adversaire = new Magician() ; //On instancie l'ordinateur
			//Warrior combatant_01 = new Warrior();
			//combattant.setType(type);
			//System.out.println("Vous avez choisi " + combattant.getType() + " !");
			//attributs.add(warrior);
			//attributs.put("type", warrior);
			//System.out.println("Vous avez choisi " + attributs.get("type") + " !");
			//System.out.println(attributs.get("type")); //debug
			combattant.Show(); //debug
			System.out.println("VS"); //debug
			adversaire.Show(); //debug
		} else if (attributs.containsKey("type") && attributs.containsKey("nom") && attributs.get("type").equals(constant.getMagician())){
			combattant = new Magician(attributs.get("nom"), "magician.png", attributs.get("type")) ; //On instancie le joueur
			adversaire = new Warrior() ; //On instancie l'ordinateur
			//Magician combattant = new Magician();
			//combattant.setType(type);
			//System.out.println("Vous avez choisi " + combattant.getType() + " !");
			//attributs.add(magician);
			//attributs.put("type", magician);
			//System.out.println("Vous avez choisi " + attributs.get("type") + " !");
			//System.out.println(attributs.get("type")); //debug
			combattant.Show(); //debug
			System.out.println("VS"); //debug
			adversaire.Show(); //debug
		} 

		//String joueurType = attributs.get("type");
		//combattant = new joueurType();
		attributs.clear();
		//combattant.Show(); //debug
		
		// Routine Vie/Mort
		while(combattant.getLife() >= constant.getMort() || adversaire.getLife() >= constant.getMort()) {

			// Affiche la force et la vie
			System.out.println("*****************************************************");
			System.out.println("*****************************************************");
			System.out.println("Vos points d'attaque: [" + combattant.getForce() + "]");
			System.out.println("Votre niveau de vie: [" + combattant.getLife() + "]");
			System.out.println("*****************************************************");
			// Simule un combat
			System.out.println("Combatez !  ");
			System.out.println("*****************************************************");
			//Scanner tour = new Scanner(System.in);
			type = capture.next();
			System.out.println("Votre attaque: " + type);
			System.out.println("*****************************************************");
			//attack = r.nextInt(combattant.getForce() - min + 1) + min;
			//life = life - 1;
			//combattant.Damage(1);
			System.out.println("Puissance de votre attaque: " + adversaire.Attack(combattant.getForce(), 1));
			System.out.println("*****************************************************");
			System.out.println("Votre adversaire: ");
			adversaire.Show();
			System.out.println("*****************************************************");
			if(adversaire.getLife() > constant.getMort() ){
				System.out.println("La replique: " + combattant.Attack(adversaire.getForce(), 1));
				System.out.println("*****************************************************");
				//combattant.Attack();
			} else {
				System.out.println("Votre niveau de vie: [" + combattant.getLife() + "] !");
				System.out.println("Celui de votre adversaire: [" + adversaire.getLife() + "] Qui est mort!");
				System.out.println("Vous etes vainqueur !!!!!!!!!!!!!");
				System.out.println("*****************************************************");
				System.out.println("*****************************************************");
				return;
			}

			
		}
		
		capture.close();
		//tour.close();
		
	}

}
