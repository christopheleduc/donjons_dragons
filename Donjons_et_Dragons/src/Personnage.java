import java.util.Random;

public abstract class Personnage {

    // Variables de classe

    private static final int min = 5;
    private static final int max = 10;
    private static final int mort = 0;
    protected static final Random r = new Random();
    protected static int life = r.nextInt(max - min + 1) + min;
    protected static int force = r.nextInt(max - min + 1) + min;
    protected static final String warrior = ("Guerrier");
    protected static final String magician = ("Magicien");

    // Variables d'instance
    private String nom = ("");
    private String image = ("");
    private String type = ("");

    // Constructeur par defaut
    public Personnage() {
        this("Conan", "warrior.png", warrior, life, force);
        //this.nom = "Combatant" ;
    }

    // Constructeur avec arguments
    public Personnage(String nom, String image, String type) {
        this(nom, image, type, life, force);
        //this.nom = "Combatant" ;
    }

    public Personnage(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(life) ;
        this.setForce(force) ;
    }

    // Accesseurs
    public String getNom() {
        return this.nom ;
    }

    public void setNom(String nom) {
        this.nom = nom ;
    }

    public String getImage() {
        return this.image ;
    }

    public void setImage(String image) {
        this.image = image ;
    }

    public String getType() {
        return this.type ;
    }

    public void setType(String type) {
        this.type = type ;
    }

    public int getLife() {
        return this.life ;
    }

    public void setLife(int life) {
        this.life = life ;
    }

    public int getForce() {
        return this.force ;
    }

    public void setForce(int force) {
        this.force = force ;
    }

    // Methodes
    public void Show() {
        System.out.println(getNom()) ;
        System.out.println(getImage()) ;
        System.out.println(getType()) ;
        System.out.println(getLife()) ;
        System.out.println(getForce()) ;
    }
}
