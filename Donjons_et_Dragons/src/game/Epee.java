package game;

public class Epee extends Arme{

    // Variables d'instance
    private static final String name = "Excalibur";
    
    // Variables de classe

    // Constructeur par defaut
    public Epee() {
        super(name) ;
    }

    // Accesseurs
    public int getForce() {
        return super.getForce() ;
    }
}