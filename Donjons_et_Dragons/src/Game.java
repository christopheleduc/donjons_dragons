import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String nom = ("");
		String image = ("");
		String type = ("");
		int min = 5;
		int max = 10;
		int life = r.nextInt(max - min + 1) + min;
		int force = r.nextInt(max - min + 1) + min;
		int mort = 0;
		
		System.out.println("Niveau de vie: " + life);
		System.out.println("Niveau de vie: " + force);
		
		while(life != mort) {
			
			System.out.println("Choisissez un type de personnage: Guerrier ou Magicien  ");
			Scanner capture = new Scanner(System.in);
			type = capture.next();
			
			if(type == "Guerrier") {
				System.out.println("Vous avez choisi Guerrier!");
			} else if (type == "Magicien"){
				System.out.println("Vous avez choisi Magicien!");
			} else {
				System.out.println("Vous devez choisir un type de personnage!");
			}
		}
		
		System.out.println("Niveau de vie: " + force + "Vous etes mort!");
		
	}

}
