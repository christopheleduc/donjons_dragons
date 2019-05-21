package game;

import java.util.Random;

public abstract class Personnage {

    // Variables de classe
    private static final int min = 5;
    private static final int max = 10;
    private static final int mort = 0;
    //private static int coups;
    //private static int arme;
    //private static int bouclier;
    protected static final Random r = new Random();
    protected static final String warrior = ("Guerrier");
    protected static final String magician = ("Magicien");
    protected static int life = r.nextInt(max - min + 1) + min;
    protected static int force = r.nextInt(max - min + 1) + min;

    // Variables d'instance
    private String nom = (null);
    private String image = (null);
    private String type = (null);

    // Constructeur par defaut
    public Personnage() {
        this("Conan", "conan.png", warrior, life, force);
        //this.nom = "Combatant" ;
    }

    // Constructeur avec arguments
    public Personnage(String nom, String image, String type) {
        this(nom, image, type, life, force);
        //this.nom = "Combatant" ;
    }

    public Personnage(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(life) ;
        this.setForce(force) ;
    }

    // Accesseurs
    public String getNom() {
        return this.nom ;
    }

    public void setNom(String nom) {
        this.nom = nom ;
    }

    public String getImage() {
        return this.image ;
    }

    public void setImage(String image) {
        this.image = image ;
    }

    public String getType() {
        return this.type ;
    }

    public void setType(String type) {
        this.type = type ;
    }

    public int getLife() {
        return this.life ;
    }

    public void setLife(int life) {
        this.life = life ;
    }

    public int getForce() {
        return this.force ;
    }

    public void setForce(int force) {
        this.force = force ;
    }

    public int getMort() {
        return this.mort ;
    }

    // Methodes
    public void Show() {
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("* Nom: " + getNom() + "                                        *") ;
        System.out.println("* Image: " + getImage() + "                                  *") ;
        System.out.println("* Type: " + getType() + "                                    *") ;
        System.out.println("* Vie: " + getLife() + "                                            *") ;
        System.out.println("* Force: " + getForce() + "                                          *") ;
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
    }

    public void Damage(int damage) {
        this.life -= damage;
    }

    public int Attack(int adversMax, int adversMin) {
        int coups = r.nextInt(adversMax - adversMin + 1) + adversMin ;
        this.life -= coups;
        return coups ;
    }
}
