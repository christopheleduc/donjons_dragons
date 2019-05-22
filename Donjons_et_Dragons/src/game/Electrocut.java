package game;

// import java.util.Random;

public class Electrocut extends Arme{

    // Variables d'instance
    private static final String name = "Eclair";

    // Variables de classe

    // Constructeurs avec arguments
    public Electrocut() {
        super("Eclair") ;
    }
    
    public String name() {
        return ("Eclair");
    }

    // Accesseurs
    public void setName() {
        super.setName(name) ;
    }
}