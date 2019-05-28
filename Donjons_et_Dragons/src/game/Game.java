package game;

import java.text.BreakIterator;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		String type = null;
		Menu play = new Menu();
		Chateaux lab = new Chateaux();
		Attributs constant = new Attributs();
		Scanner capture = new Scanner(System.in);

		int pass = 0;
		
		while(pass != 1) {
			try {
				play.persoChoice();
				pass = 1;
			} catch (NoTypeExeption e) {
				pass = 0;
				System.out.println(e);
				// e.printStackTrace();
			}
		}

		play.nameChoice();
		play.playersInstance();
		lab.s1();
		System.out.println(constant.getGo()); // Avancer
		System.out.println(constant.getLine());
		type = capture.next();
		lab.s2();
		int val = 0;
		int a = play.fight(val); // Combat
		// Si vivant
		if(a > constant.getMort()) {

			lab.s3(); // Affiche la piece 3
			System.out.println(constant.getGo()); // Avancer
			System.out.println(constant.getLine());
			type = capture.next();
		} else {
			System.out.println("Fin de partie");	
		}

		lab.s4(); // Affiche la piece 4
		val = 5; // potion de vie
		int b = play.fight(val); // Combat
		
		// Si vivant
		if(b > constant.getMort()) {
		
			lab.s5(); // Affiche la piece 5
			System.out.println(constant.getGo()); // Avancer
			System.out.println(constant.getLine());
			type = capture.next();
			System.out.println("Vous vous en etes sorti !!!");
			System.out.println("****** Fin de partie *******");
							
				
		} else {
			System.out.println("Fin de partie");
							
		}
	}
}
