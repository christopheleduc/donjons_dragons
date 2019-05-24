/**
 * "Personnage" est la Superclasse abstract qui définit les caracteristiques du joueur
 * Cette classe est caractérisée par les informations suivantes :
 * <ul>
 * <li>"min" valeur minimum de la vie et de la force d'un personnage guerrier.</li>
 * <li>"max" valeur maximum de la vie et de la force d'un personnage guerrier.</li>
 * <li>"mort" valeur de la fin de vie.</li>
 * <li>"r" initialise la fonction "Random"</li>
 * <li>"warrior" defini la valeur du type:"Guerrier"</li>
 * <li>"magician" defini la valeur du type:"Magicien"</li>
 * <li>"nom" defini le nom du personnage</li>
 * <li>"image" defini le chemin et le nom du bitmap du personnage</li>
 * <li>"type" defini le type "Magicien" ou "Guerrier"</li>
 * <li>"life" valeur de la vie.</li>
 * <li>"force" valeur de la force.</li>
 * </ul>
 * "Personnage" permet d'instancier des objets Guerrier et Magicien par héritage,
 *  en calculant la force et la vie du joueur, 
 * ainsi que de definir son nom et son type.
 * Personnage est une Class abstract et ne peut etre instanciée!
 * </p>
 * Les attributs min et max sont surchargés dans la class fille "Magicien",
 * tandis que la class fille "Guerrier" herite de toutes les carractéristiques de "Personnage".
 * </p>
 * @author CryptoDox
 * @version 1.0
 */

package game;

import java.util.Random;

public abstract class Personnage {

    /** 
     * 
     * <b>Variables de class<b> 
     * 
     */

    /** 
     * Valeur min pour la vie et la force. 
     */
    private int min = 5;
    /** 
     * Valeur max pour la vie et la force. 
     */
    private int max = 10;
    /** 
     * Valeur pour la mort. 
     */
    private final int mort = 0;
    /** 
     * Initialise la fonction random pour le calcul aléatoire de la valeur de "life" & "force". 
     */
    protected final Random r = new Random();
    /** 
     * Valeur du type Guerrier. 
     */
    protected final String warrior = ("Guerrier");
    /** 
     * Valeur du type Magicien. 
     */
    protected final String magician = ("Magicien");

    /** 
     * Déclare l'attribut "nom". 
     */
    private String nom;
    /** 
     * Déclare l'attribut "image". 
     */
    private String image;
    /** 
     * Déclare l'attribut "type". 
     */
    private String type;
    /** 
     * Déclare l'attribut "life". 
     */
    protected int life;
    /** 
     * Déclare l'attribut "force". 
     */
    protected int force;

    /** 
     * 
     * <b>Variables d'instance<b> 
     * 
     */



    /** 
     * <b>Constructeur par defaut</b> 
     * 
     * Appel le constructeur suivant avec les paramètres par défaut
     *  
     */ 
    public Personnage() {
        this("Conan", "conan.png", "Guerrier", 0, 0);
    }

    /** 
     * <b>Constructeur avec arguments</b> 
     * 
     * Construit les instances des Class filles "Warrior" & "Magician"
     *  grace au constructeur suivant, 
     * en initialisant "life" et "force" avec
     * des valeurs null qui seront surchargées. 
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
    }

    /** 
     * <b>Constructeur avec arguments</b> 
     * 
     * Construit les instances des Class filles "Warrior" & "Magician", 
     * en initialisant "life" et "force" avec
     * des valeurs alléatoires comprises entre "min" et "max", 
     * lesquelles surchargent les valeurs transmises par les constructeurs
     * précédants. 
     * 
     * @param nom 
     *     Nom du personnage. Type:<String>. 
     * @param image 
     *     Image du personnage. Type:<String>. 
     * @param type 
     *     Type: Guerrier ou Magicien. Type:<String>. 
     * @param life 
     *     Valeur de la vie. Type:<int>. 
     * @param force 
     *     Valeur de la force. Type:<int>.  
     */ 
    public Personnage(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(r.nextInt(max - min + 1) + min) ;
        this.setForce(r.nextInt(max - min + 1) + min) ;
    }

    /** 
     * <b>Accesseurs</b> 
     * 
     * interagissent avec les valeurs des attributs 
     * des objets instanciés.
     *  
     */
    
    /** 
     * Getter "nom".  
     */
    public String getNom() {
        return this.nom ;
    }

    /** 
     * Setter "nom".  
     */
    public void setNom(String nom) {
        this.nom = nom ;
    }

    /** 
     * Getter "image".  
     */
    public String getImage() {
        return this.image ;
    }

    /** 
     * Setter "image".  
     */
    public void setImage(String image) {
        this.image = image ;
    }

    /** 
     * Getter "type".  
     */
    public String getType() {
        return this.type ;
    }

    /** 
     * Setter "type".  
     */
    public void setType(String type) {
        this.type = type ;
    }

    /** 
     * Getter "life".  
     */
    public int getLife() {
        return this.life ;
    }

    /** 
     * Setter "life".  
     */
    public void setLife(int life) {
        this.life = life ;
    }

    /** 
     * Getter "force".  
     */
    public int getForce() {
        return this.force ;
    }

    /** 
     * Setter "force".  
     */
    public void setForce(int force) {
        this.force = force ;
    }

    /** 
     * Getter "min".  
     */
    public int getMin() {
        return this.min ;
    }

    /** 
     * Setter "min".  
     */
    public void setMin(int min) {
        this.min = min ;
    }

    /** 
     * Getter "max".  
     */
    public int getMax() {
        return this.max ;
    }

    /** 
     * Setter "max".  
     */
    public void setMax(int max) {
        this.max = max ;
    }

    /** 
     * Getter "mort".  
     */
    public int getMort() {
        return this.mort ;
    }

    /** 
     * <b>Méthodes</b> 
     *  
     */
    
    /** 
     * Affiche les caracteristiques du joueur. 
     * 
     */ 
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

    /** 
     * Soustrait la valeur du paramètre passé, à la vie du joeur. 
     * @param damage 
     *     valeur de type <int>.
     *  
     */ 
    public void Damage(int damage) {
        this.life -= damage;
    }

    /** 
     * Soustrait une valeur aléatoire, comprise entre les paramètres passés, 
     * à la vie du joeur. 
     * @param adversMax 
     *     valeur maximum de type <int>.
     * @param adversMin 
     *     valeur minimum de type <int>.  
     * @return Valeur soustraite à la vie. 
     */ 
    public int Attack(int adversMax, int adversMin) {
        int coups = r.nextInt(adversMax - adversMin + 1) + adversMin ;
        this.life -= coups;
        return coups ;
    }
}
