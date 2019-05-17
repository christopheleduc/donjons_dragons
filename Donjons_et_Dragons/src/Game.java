import java.util.Random;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String nom = ("");
		String image = ("");
		int min = 5;
		int max = 10;
		int life = r.nextInt(max - min + 1) + min;
		int force = r.nextInt(max - min + 1) + min;
		int mort = 0;
		
		System.out.println("Niveau de vie: " + life);
		System.out.println("Niveau de vie: " + force);
		
		while(life != mort) {

		}
		
		System.out.println("Niveau de vie: " + force + "Vous etes mort!");
		
	}

}
