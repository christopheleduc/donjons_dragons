package game;

public class Game {

	public static void main(String[] args) {

		Menu play = new Menu();

		int pass = 0;
		
		while(pass != 1) {
			try {
				play.persoChoice();
				pass = 1;
			} catch (NoTypeExeption e) {
				pass = 0;
				e.printStackTrace();
			}
		}

		play.nameChoice();
		play.playersInstance();
		play.fight();

	}
}
