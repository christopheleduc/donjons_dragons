class Warrior extends Personnage {

    // Variables de classe

    // Variables d'instance

    // Constructeur par defaut
    public Warrior() {
        this("Conan", "warrior.png", warrior, life, force);
    }

    // Constructeur avec arguments
    public Warrior(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(life) ;
        this.setForce(force) ;
    }

}