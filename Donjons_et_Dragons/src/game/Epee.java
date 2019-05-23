package game;

public class Epee extends Arme{

    // ********************
    // Variables d'instance
    // ********************
    private static final String type = "Epee";
    private static final String name = "Excalibur";

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Epee() {
        super(name, true) ;
    }

    // **********
    // Accesseurs
    // **********

    // Get le type de l'arme
    @Override
    public String getType() {
        return type ;
    }
}