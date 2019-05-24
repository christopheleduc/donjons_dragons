package game;

// import java.util.Random;

public class Electrocut extends Arme{

    // ********************
    // Variables d'instance
    // ********************
    private final String type = "Sort";
    private String name = "Eclair";

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Electrocut() {
        super("Eclair", true) ;
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