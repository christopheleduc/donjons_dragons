package game;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Menu {

    private static String type = null;
    private static String nom = null;
    private static int verif = 0;
    private static Scanner capture = new Scanner(System.in);
    private static Map<String, String> attributs = new HashMap<>();
    private static Attributs constant = new Attributs();
    private static Personnage combattant=null;
    private static Personnage adversaire=null;
    private static Epee epee=null;
    private static Electrocut sort=null;
    private ArrayList list = new ArrayList<Object>();


    // Choix du type de personnage
    public void persoChoice() {

        while(verif != 1) {	
			System.out.println(constant.getPc());
			//Scanner capture = new Scanner(System.in);
			type = capture.nextLine();
			
				if(type.equals(constant.getWarrior())) {
					attributs.put("type", constant.getWarrior());
					System.out.println(constant.getPcy() + attributs.get("type") + constant.getExc());
					verif = 1;
				} else if (type.equals(constant.getMagician())){
					attributs.put("type", constant.getMagician());
					System.out.println(constant.getPcy() + attributs.get("type") + constant.getExc());
					verif = 1;					
				} else {
					System.out.println(constant.getPdev());
				}
		}

		verif = 0;

    }

    // Choix du nom du personnage
    public void nameChoice() {
        
		while(verif != 1) {	
			System.out.println(constant.getPnc());
			nom = capture.nextLine();
				if(nom.equals("")) {
					System.out.println(constant.getPnd());
				} else {
					attributs.put("nom", nom);
					System.out.println(constant.getChic() + attributs.get("nom") + constant.getExc());
					//System.out.println(attributs.toString());// debug
					verif = 1;
				}
		}

        verif = 0;
        
    }

        // Instanciation des joueurs
        public void playersInstance() {

            if(attributs.containsKey("type") && attributs.containsKey("nom") && attributs.get("type").equals(constant.getWarrior())) {
                combattant = new Warrior(attributs.get("nom"), "warrior.png", attributs.get("type")) ; //On instancie le joueur
                epee = new Epee(); //On instancie l'epée
                list.add(epee.getName()); // Ajoute le nom de l'epee dans la list
                list.add(epee.getIsactive()); // Ajoute si l'epee est active dans la list
                list.add(epee.getForce()); // Ajoute les points d'attak de l'epee dans la list
                //epee.setIsactive(true); //test
                adversaire = new Magician() ; //On instancie l'ordinateur
                sort = new Electrocut(); //On instancie le sort
                list.add(sort.getName()); // Ajoute le nom de l'epee dans la list
                list.add(sort.getIsactive()); // Ajoute si l'epee est active dans la list
                list.add(sort.getForce()); // Ajoute les points d'attak de l'epee dans la list
                //sort.setIsactive(false); // test
                combattant.Show(); //debug
                epee.Show(); //debug: Votre arme...
                System.out.println(constant.getVs()); //debug
                adversaire.Show(); //debug
                sort.Show(); //debug: Son arme...
                System.out.println(list);// Test : affiche tous les elements de la liste
            } else if (attributs.containsKey("type") && attributs.containsKey("nom") && attributs.get("type").equals(constant.getMagician())){
                combattant = new Magician(attributs.get("nom"), "magician.png", attributs.get("type")) ; //On instancie le joueur
                sort = new Electrocut(); //On instancie le sort
                list.add(sort.getName()); // Ajoute le nom de l'epee dans la list
                list.add(sort.getIsactive()); // Ajoute si l'epee est active dans la list
                list.add(sort.getForce()); // Ajoute les points d'attak de l'epee dans la list
                adversaire = new Warrior() ; //On instancie l'ordinateur
                epee = new Epee(); //On instancie l'epée
                list.add(epee.getName()); // Ajoute le nom de l'epee dans la list
                list.add(epee.getIsactive()); // Ajoute si l'epee est active dans la list
                list.add(epee.getForce()); // Ajoute les points d'attak de l'epee dans la list
                combattant.Show(); //debug
                sort.Show(); //debug: Votre arme...
                System.out.println(constant.getVs()); //debug
                adversaire.Show(); //debug
                epee.Show(); //debug: Son arme...
                System.out.println(list);// Test : affiche tous les elements de la liste
            } 
    
            attributs.clear();
    
        }

        // Routine Vie/Mort
        public void fight() {

		while(combattant.getLife() >= constant.getMort() || adversaire.getLife() >= constant.getMort()) {

			// Affiche la force et la vie
			System.out.println(constant.getLine());
			System.out.println(constant.getLine());
			System.out.println(constant.getPnat() + combattant.getForce() + constant.getCrf());
			System.out.println(constant.getPtvi() + combattant.getLife() + constant.getCrf());
			System.out.println(constant.getLine());
			// Simule un combat
			System.out.println(constant.getFght());
			System.out.println(constant.getLine());
			type = capture.next();
			System.out.println(constant.getVat() + type);
			System.out.println(constant.getLine());
			System.out.println(constant.getFft() + adversaire.Attack(combattant.getForce(), 1));
			System.out.println(constant.getLine());
			System.out.println(constant.getVadv());
			adversaire.Show();
			System.out.println(constant.getLine());
			if(adversaire.getLife() > constant.getMort() ){
				System.out.println(constant.getLrp() + combattant.Attack(adversaire.getForce(), 1));
				System.out.println(constant.getLine());
				if(combattant.getLife() <= constant.getMort()){
					System.out.println(constant.getPtvi() + combattant.getLife() + constant.getCrfx());
					System.out.println(constant.getCvad() + adversaire.getLife() + constant.getCrfx());
					System.out.println(constant.getVem());
					System.out.println(constant.getVap());
					System.out.println(constant.getLine());
					System.out.println(constant.getLine());
					capture.close();
					break;
				}
				//combattant.Attack();
			} else {
				System.out.println(constant.getPtvi() + combattant.getLife() + constant.getCrfx());
				System.out.println(constant.getCvad() + adversaire.getLife() + constant.getQem());
				System.out.println(constant.getVev());
				System.out.println(constant.getLine());
				System.out.println(constant.getLine());
				capture.close();
				break;
				//return;
			}	
		}
		capture.close();
        }

}