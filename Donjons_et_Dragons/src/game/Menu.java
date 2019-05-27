package game;

import java.util.Scanner;
import java.io.UnsupportedEncodingException;
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
    private static Personnage combattant = null;
    private static Personnage adversaire = null;
    private static Epee epee = null;
    private static Electrocut sort = null;
    private static String[] typesTab = { "Guerrier", "Magicien" };
    private ArrayList list = new ArrayList<Object>();

    // Choix du type de personnage
    public void persoChoice() throws NoTypeExeption {

        while (verif != 1) {

            System.out.println(constant.getPc());
            // Scanner capture = new Scanner(System.in);
            type = capture.nextLine();

            if (type.equals(constant.getWarrior())) {
                attributs.put("type", constant.getWarrior());
                System.out.println(constant.getPcy() + attributs.get("type") + constant.getExc());
                verif = 1;
            } else if (type.equals(constant.getMagician())) {
                attributs.put("type", constant.getMagician());
                System.out.println(constant.getPcy() + attributs.get("type") + constant.getExc());
                verif = 1;
            } else {
                // Gestion des exeptions
                // try{
                // System.out.println( typesTab[2]); // on provoque une erreur
                // //System.out.println("Vous devez choisir entre " + typesTab[0] + " et " +
                // typesTab[1] + " !!!");
                // throw new NoTypeExeption();
                // //System.out.println(constant.getPdev());
                // } catch(ArrayIndexOutOfBoundsException e) {
                // System.out.println("Vous devez choisir entre " + typesTab[0] + " et " +
                // typesTab[1] + " !!!");
                // //System.out.println(constant.getPdev());
                // //e.printStackTrace();
                // } finally {
                // System.out.println("La compétance devrait EXCEPTIONS etre validée !");
                // }
                // System.out.println("Vous devez choisir entre " + typesTab[0] + " et " +
                // typesTab[1] + " !!!");
                verif = 0;
                throw new NoTypeExeption();
                // System.out.println(constant.getPdev());

            }
        }

        verif = 0;

    }

    // Choix du nom du personnage
    public void nameChoice() {

        while (verif != 1) {
            System.out.println(constant.getPnc());
            nom = capture.nextLine();
            if (nom.equals("")) {
                System.out.println(constant.getPnd());
            } else {
                attributs.put("nom", nom);
                System.out.println(constant.getChic() + attributs.get("nom") + constant.getExc());
                // System.out.println(attributs.toString());// debug
                verif = 1;
            }
        }

        verif = 0;

    }

    // Instanciation des joueurs
    public void playersInstance() {

        if (attributs.containsKey("type") && attributs.containsKey("nom")
                && attributs.get("type").equals(constant.getWarrior())) {

            combattant = new Warrior(attributs.get("nom"), "warrior.png", attributs.get("type")); // On instancie le
                                                                                                  // joueur
            epee = new Epee(); // On instancie l'epée

            list.add(epee.getType()); // Ajoute le type de l'arme dans la list
            list.add(epee.getName()); // Ajoute le nom de l'arme dans la list
            list.add(epee.getIsactive()); // Ajoute si l'arme est active dans la list
            list.add(epee.getForce()); // Ajoute les points d'attak de l'arme dans la list
            // epee.setIsactive(true); //test

            adversaire = new Magician(); // On instancie l'ordinateur
            sort = new Electrocut(); // On instancie le sort

            list.add(sort.getType()); // Ajoute le type de l'arme dans la list
            list.add(sort.getName()); // Ajoute le nom de l'arme dans la list
            list.add(sort.getIsactive()); // Ajoute si l'arme est active dans la list
            list.add(sort.getForce()); // Ajoute les points d'attak de l'arme dans la list

            // sort.setIsactive(false); // test
            combattant.Show(); // debug
            epee.Show(); // debug: Votre arme...

            System.out.println(constant.getVs()); // debug

            adversaire.Show(); // debug
            sort.Show(); // debug: Son arme...

            System.out.println(list);// Test : affiche tous les elements de la liste

        } else if (attributs.containsKey("type") && attributs.containsKey("nom")
                && attributs.get("type").equals(constant.getMagician())) {

            combattant = new Magician(attributs.get("nom"), "magician.png", attributs.get("type")); // On instancie le
                                                                                                    // joueur
            sort = new Electrocut(); // On instancie le sort

            list.add(sort.getType()); // Ajoute le type de l'arme dans la list
            list.add(sort.getName()); // Ajoute le nom de l'arme dans la list
            list.add(sort.getIsactive()); // Ajoute si l'arme est active dans la list
            list.add(sort.getForce()); // Ajoute les points d'attak de l'arme dans la list

            adversaire = new Warrior(); // On instancie l'ordinateur
            epee = new Epee(); // On instancie l'epée

            list.add(epee.getType()); // Ajoute le type de l'arme dans la list
            list.add(epee.getName()); // Ajoute le nom de l'arme dans la list
            list.add(epee.getIsactive()); // Ajoute si l'arme est active dans la list
            list.add(epee.getForce()); // Ajoute les points d'attak de l'arme dans la list

            combattant.Show(); // debug
            sort.Show(); // debug: Votre arme...

            System.out.println(constant.getVs()); // debug

            adversaire.Show(); // debug
            epee.Show(); // debug: Son arme...

            System.out.println(list);// Test : affiche tous les elements de la liste

        }

        attributs.clear();

    }

    // Routine Vie/Mort
    public void fight() {

        while (combattant.getLife() >= constant.getMort() || adversaire.getLife() >= constant.getMort()) {

            // Affiche la force et la vie
            System.out.println(constant.getLine());
            System.out.println(constant.getLine());
            System.out.println(constant.getPnat() + combattant.getForce() + constant.getCrf());
            System.out.println(constant.getPtvi() + combattant.getLife() + constant.getCrf());
            System.out.println(constant.getLine());

            // Plateau
            Plateau position = Plateau.SALLE_01;
            System.out.println(
                    "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
            position = Plateau.SALLE_02;
            System.out.println(
                    "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());

            SpecialCharacters unicar = new SpecialCharacters(); // Affiche la première salle (caractères Unicode)
            try {
                unicar.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                unicar.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                unicar.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            
            position = Plateau.SALLE_03;
            System.out.println(
                    "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
            SpecialCharacters unicar1 = new SpecialCharacters(); // Affiche la seconde salle (caractères Unicode)
            try {
                unicar1.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                unicar1.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                unicar1.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            position = Plateau.SALLE_04;
            System.out.println(
                    "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
            SpecialCharacters unicar2 = new SpecialCharacters(); // Affiche la seconde salle (caractères Unicode)
            try {
                unicar2.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                unicar2.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                unicar2.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            position = Plateau.SALLE_05;
            System.out.println(
                    "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
            SpecialCharacters unicar3 = new SpecialCharacters(); // Affiche la seconde salle (caractères Unicode)
            try {
                unicar3.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                unicar3.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                unicar3.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
            
            // Simule un combat
			System.out.println(constant.getFght()); // Combatez!
			System.out.println(constant.getLine());
			type = capture.next();
			System.out.println(constant.getVat() + type); // Votre attaque?
			System.out.println(constant.getLine());
			System.out.println(constant.getFft() + adversaire.Attack(combattant.getForce(), 1)); // Puissance de votre attaque:
			System.out.println(constant.getLine());
			System.out.println(constant.getVadv()); // Votre adversaire:
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