package game;

import java.util.Random;

public abstract class Arme {

    private static final int min = 2;
    private static final int max = 5;
    private static final Random r = new Random();
    private int damages = r.nextInt(max - min + 1) + min;
    private boolean isactive = false;
    private String name;

    // Constructeur par defaut
    public Arme() {
        this("Excalibur", true);
    }

    // Constructeurs avec arguments
    public Arme(String name) {
        this(name, true);
    }

    public Arme(String name, Boolean isactive) {
        this.setName(name) ;
        this.setIsactive(isactive) ;
    }

    // Accesseurs
    public String getName() {
        return name ;
    }

    protected void setName(String name) {
        this.name = name ;
    }

    public int getForce() {
        return this.damages ;
    }

    public void setIsactive(boolean isactive) {
         this.isactive = isactive ;
    }

    public boolean getIsactive() {
         return this.isactive ;
    }
    
    // Methodes
    public void Show() {
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("* Nom: " + getName() + "                                        *") ;
        System.out.println("* Actif: " + getIsactive() + "                                            *") ;
        System.out.println("* Force: " + getForce() + "                                          *") ;
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
    }
}