package game;

import java.util.Random;

public abstract class Arme {

    // ***********************
    // Variables de classe
    // ***********************
    private int min = 2;
    private int max = 5;
    private final Random r = new Random();
    private int damages = r.nextInt(max - min + 1) + min;
    private boolean isactive = false;

    // ********************
    // Variables d'instance
    // ********************
    private String type;
    private String name;

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Arme() {
        this("Excalibur", true);
    }

    // ****************************
    // Constructeurs avec arguments
    // ****************************
    public Arme(String name) {
        this(name, true);
    }

    public Arme(String name, Boolean isactive) {
        this.setName(name) ;
        this.setIsactive(isactive) ;
    }

    // **********
    // Accesseurs
    // **********
    
    // Get le type de l'arme
    public abstract String getType() ;
    
    // Get le nom de l'arme
    public String getName() {
        return name ;
    }

    // Set le nom de l'arme
    protected void setName(String name) {
        this.name = name ;
    }

    // Get la puissance de l'arme
    public int getForce() {
        return this.damages ;
    }

    // Set de Is Ative ?
    public void setIsactive(boolean isactive) {
         this.isactive = isactive ;
    }

    // Get de Is Ative ?
    public boolean getIsactive() {
         return this.isactive ;
    }
    
    // ********
    // Methodes
    // ********

    // Affiche les caracteristiques
    public void Show() {
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("* Type: " + getType() + "                                        *") ;
        System.out.println("* Nom: " + getName() + "                                        *") ;
        System.out.println("* Actif: " + getIsactive() + "                                            *") ;
        System.out.println("* Force: " + getForce() + "                                          *") ;
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
    }
}