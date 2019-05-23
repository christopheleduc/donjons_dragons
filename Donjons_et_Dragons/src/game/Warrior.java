package game;

class Warrior extends Personnage {

    // ***********************
    // Variables de classe
    // ***********************

    // ********************
    // Variables d'instance
    // ********************

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Warrior() {
        super() ;
    }

    // ****************************
    // Constructeurs avec arguments
    // ****************************
    public Warrior(String nom, String image, String type) {
        super(nom, image, type) ;
    }

    public Warrior(String nom, String image, String type, int life, int force) {
        super(nom, image, type, life, force) ;
    }
}