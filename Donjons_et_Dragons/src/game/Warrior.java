/**
 * "Warrior" est une Classe fille de "Personnage" qui définit les caracteristiques du joueur
 * Cette classe est caractérisée par les informations suivantes :
 * <ul>
 * <li>"min" (Hérité) valeur minimum de la vie et de la force d'un personnage guerrier.</li>
 * <li>"max" (Hérité) valeur maximum de la vie et de la force d'un personnage guerrier.</li>
 * <li>"mort" (Hérité) valeur de la fin de vie.</li>
 * <li>"r" (Hérité) initialise la fonction "Random"</li>
 * <li>"magician" (Hérité) defini la valeur du type:"Guerrier"</li>
 * <li>"nom" (Hérité) defini le nom du personnage</li>
 * <li>"image" (Hérité) defini le chemin et le nom du bitmap du personnage</li>
 * <li>"type" (Hérité) defini le type "Guerrier"</li>
 * <li>"life" (Hérité) valeur de la vie.</li>
 * <li>"force" (Hérité) valeur de la force.</li>
 * </ul>
 * "Warrior" permet d'instancier des objets guerriers, hérités de la SuperClass "Personnage",
 *  en calculant la force et la vie du joueur, 
 * ainsi que de definir son nom et son type.
 * </p>
 * 
 * </p>
 * @author CryptoDox
 * @version 1.0
 */
package game;

class Warrior extends Personnage {

    /** 
     * 
     * <b>Variables de class<b> 
     * 
     */

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
    public Warrior() {
        super() ;
    }

    /** 
     * <b>Constructeur avec arguments</b> 
     * 
     * Construit les instances de la Class fille "Warrior"
     *  grace au constructeur suivant, 
     * en initialisant "life" et "force" avec
     * des valeurs null qui seront surchargées. 
     * 
     * @param nom 
     *     Nom du personnage 
     * @param image 
     *     Image du personnage 
     * @param type 
     *     Type: Guerrier 
     */ 
    public Warrior(String nom, String image, String type) {
        super(nom, image, type) ;
    }

    /** 
     * <b>Constructeur avec arguments</b> 
     * 
     * Construit les instances de la Class filles "Warrior", 
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
     *     Type: Guerrier. Type:<String>. 
     * @param life 
     *     Valeur de la vie. Type:<int>. 
     * @param force 
     *     Valeur de la force. Type:<int>.  
     */ 
    public Warrior(String nom, String image, String type, int life, int force) {
        super(nom, image, type, life, force) ;
    }
}