/**
 * "Magician" est une Classe fille de "Personnage" qui définit les caracteristiques du joueur
 * Cette classe est caractérisée par les informations suivantes :
 * <ul>
 * <li>"min" (Hérité) valeur minimum de la vie et de la force d'un personnage magicien.</li>
 * <li>"max" (Hérité) valeur maximum de la vie et de la force d'un personnage magicien.</li>
 * <li>"minForce" valeur maximum de la force d'un personnage magicien.</li>
 * <li>"maxForce" valeur maximum de la force d'un personnage magicien.</li>
 * <li>"mort" (Hérité) valeur de la fin de vie.</li>
 * <li>"r" (Hérité) initialise la fonction "Random"</li>
 * <li>"magician" (Hérité) defini la valeur du type:"Magicien"</li>
 * <li>"nom" (Hérité) defini le nom du personnage</li>
 * <li>"image" (Hérité) defini le chemin et le nom du bitmap du personnage</li>
 * <li>"type" (Hérité) defini le type "Magicien"</li>
 * <li>"life" (Hérité) valeur de la vie.</li>
 * <li>"force" (Hérité) valeur de la force.</li>
 * </ul>
 * "Magician" permet d'instancier des objets Magiciens, hérités de la SuperClass "Personnage",
 *  en calculant la force et la vie du joueur, 
 * ainsi que de definir son nom et son type.
 * </p>
 * Les attributs min et max sont surchargés.
 * </p>
 * @author CryptoDox
 * @version 1.0
 */
package game;

class  Magician extends Personnage {

    /** 
     * 
     * <b>Variables de class<b> 
     * 
     */

    /** 
     * Valeur min pour la vie. 
     */
    private int min = 3;
    /** 
     * Valeur max pour la vie. 
     */
    private int max = 6;
    /** 
     * Valeur min pour la force. 
     */
    private int minForce = 8;
    /** 
     * Valeur max pour la force. 
     */
    private int maxForce = 15;

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
    public Magician() {
        this("Merlin", "merlin.png", "Magicien", 0, 0);
    }

    /** 
     * <b>Constructeur avec arguments</b> 
     * 
     * Construit les instances de la Class fille "Magician"
     *  grace au constructeur suivant, 
     * en initialisant "life" et "force" avec
     * des valeurs null qui seront surchargées. 
     * 
     * @param nom 
     *     Nom du personnage 
     * @param image 
     *     Image du personnage 
     * @param type 
     *     Type: Magicien 
     */ 
    public Magician(String nom, String image, String type) {
        this(nom, image, type, 0, 0);
    }

    /** 
     * <b>Constructeur avec arguments</b> 
     * 
     * Construit les instances de la Class filles "Magician", 
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
     *     Type: Magicien. Type:<String>. 
     * @param life 
     *     Valeur de la vie. Type:<int>. 
     * @param force 
     *     Valeur de la force. Type:<int>.  
     */ 
    public Magician(String nom, String image, String type, int life, int force) {
        super( nom, image, type) ;
        this.setLife(r.nextInt(max - min + 1) + min) ;
        this.setForce(r.nextInt(maxForce - minForce + 1) + minForce) ;
    }

    /** 
     * <b>Accesseurs</b> 
     * 
     * interagissent avec les valeurs des attributs 
     * des objets instanciés.
     *  
     */

    /** 
     * Getter "minForce".  
     */
     public int getMinForce() {
            return this.minForce ;
        }
    
    /** 
     * Setter "minForce".  
     */
     public void setMinForce(int minForce) {
            this.minForce = minForce ;
        }

    /** 
     * Getter "maxForce".  
     */
    public int getMaxForce() {
            return this.maxForce ;
        }
    
    /** 
     * Setter "maxForce".  
     */
    public void setMaxForce(int maxForce) {
            this.maxForce = maxForce ;
        }

    /** 
     * <b>Méthodes</b> 
     *  
     */

}