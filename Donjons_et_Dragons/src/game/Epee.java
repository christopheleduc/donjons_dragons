package game;

public class Epee extends Arme{

    // ********************
    // Variables d'instance
    // ********************
    private final String type = "Epee";
    private String name = "Excalibur";

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Epee() {
        super("Excalibur", true) ;
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