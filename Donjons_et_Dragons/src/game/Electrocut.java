package game;

// import java.util.Random;

public class Electrocut extends Arme{

    // ********************
    // Variables d'instance
    // ********************
    private static final String type = "Sort";
    private static final String name = "Eclair";

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Electrocut() {
        super("Eclair") ;
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