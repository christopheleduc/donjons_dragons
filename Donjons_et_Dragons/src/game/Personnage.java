/**
 * Personnage est la Superclasse abstract qui définit les carracteristiques du joueur
 * Cette classe est caractérisée par les informations suivantes :
 * <ul>
 * <li>min valeur minimum de la vie et de la force d'un personnage guerrier</li>
 * <li>max valeur maximum de la vie et de la force d'un personnage guerrier</li>
 * </ul>
 * Personnage permet de calculer la force et la vie d'un joueur, 
 * ainsi que de definir son nom et son type.
 * </p>
 * Les attributs min et max sont surchargés dans la class fille Magicien,
 * tandis que la class fille Guerrier herite de toutes les carractéristiques de Personnage.
 * </p>
 * @author CryptoDox
 * @version 1.0
 */

package game;

import java.util.Random;

public abstract class Personnage {

    // ***********************
    // Variables de classe
    // ***********************
    /** 
     * Valeur min pour la vie et la force 
     */
    private int min = 5;
    /** 
     * Valeur max pour la vie et la force 
     */
    private int max = 10;
    /** 
     * Valeur pour la mort 
     */
    private final int mort = 0;
        /** 
     * Valeur pour la mort 
     */
    protected final Random r = new Random();
        /** 
     * Valeur pour la mort 
     */
    protected final String warrior = ("Guerrier");
        /** 
     * Valeur pour la mort 
     */
    protected final String magician = ("Magicien");
        /** 
     * Valeur pour la mort 
     */
    /** 
     * Fonction random. Determine la force du personnage avec les attributs max et min
     */
    // protected static int force = r.nextInt(max - min + 1) + min;

    // ********************
    // Variables d'instance
    // ********************
    private String nom;
    private String image;
    private String type;
    protected int life;
    protected int force;



    /** 
     * <b>Constructeur par defaut de Personnage</b> 
     * 
     * Appel le constructeur avec paramètres suivant
     *  
     */ 
    public Personnage() {
        this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    /** 
     * <b>Constructeur avec arguments de Personnage</b> 
     * 
     * Construit l'instance de Personnage 
     * en initialisant "life" et "force" avec
     * des valeurs alléatoir comprises entre "min" et "max" 
     * 
     * @param nom 
     *     Nom du personnage 
     * @param image 
     *     Image du personnage 
     * @param type 
     *     Type: Guerrier ou Magicien 
     */ 
    public Personnage(String nom, String image, String type) {
        this(nom, image, type, 0, 0);
        //this.life = r.nextInt(max - min + 1) + min;

    }

    public Personnage(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(r.nextInt(max - min + 1) + min) ;
        this.setForce(r.nextInt(max - min + 1) + min) ;
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

    public int getMort() {
        return this.mort ;
    }

    // Methodes
    public void Show() {
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("* Nom: " + getNom() + "                                        *") ;
        System.out.println("* Image: " + getImage() + "                                  *") ;
        System.out.println("* Type: " + getType() + "                                    *") ;
        System.out.println("* Vie: " + getLife() + "                                            *") ;
        System.out.println("* Force: " + getForce() + "                                          *") ;
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
    }

    public void Damage(int damage) {
        this.life -= damage;
    }

    public int Attack(int adversMax, int adversMin) {
        int coups = r.nextInt(adversMax - adversMin + 1) + adversMin ;
        this.life -= coups;
        return coups ;
    }
}
