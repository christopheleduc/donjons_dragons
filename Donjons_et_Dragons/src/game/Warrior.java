package game;

class Warrior extends Personnage {

    // Variables de classe

    // Variables d'instance

    // Constructeur par defaut
    public Warrior() {
        super() ;
        //this("Conan", "warrior.png", warrior, life, force);
    }

    // Constructeur avec arguments
    public Warrior(String nom, String image, String type) {
        super(nom, image, type) ;
        //this("Conan", "warrior.png", warrior, life, force);
    }

    public Warrior(String nom, String image, String type, int life, int force) {
        super(nom, image, type, life, force) ;
        //this.setNom(nom) ;
        // super(nom) ;// appel du constructeur de la super classe
        //this.setImage(image) ;
        //this.setType(type) ;
        //this.setLife(life) ;
        //this.setForce(force) ;
    }

    // Methodes
    // public void Show() {
    //     super.Show() ;
    //     System.out.println(getNom()) ;
    //     System.out.println(getImage()) ;
    //     System.out.println(getType()) ;
    //     System.out.println(getLife()) ;
    //     System.out.println(getForce()) ;
    // }

    // public void Damage(int damage) {
    //     super.Damage() ;
    // }

}