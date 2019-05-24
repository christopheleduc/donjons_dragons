/**
 * NoTypeExeption est la classe qui définit les messages d'erreurs utilisateur
 * Cette classe est caractérisée par les informations suivantes :
 * <ul>
 * <li>serialVersionUID</li>
 * </ul>
 * Surcharge la fonction "toString".
 * </p>
 * Renvoi un message personalisé lors d'un input, si l'utilisateur entre une valeur éronnée.
 * </p>
 * @author CryptoDox
 * @version 1.0
 */

package game;

public class NoTypeExeption extends Exception {

    /** 
     * serialVersionUID. 
     */
    private static final long serialVersionUID = 1L;


    /** 
     * Retourne le message utilisateur et le message d'erreur
     * en surchargeant "ArrayIndexOutOfBoundsException". 
     * @param N/A
     *   
     * @return Message d'erreur et personnalisé  
     * @throws InterruptedException 
     *     l'utilisateur entre une valeur éronée! 
     * La méthode est commenté car elle n'est pas utilisée.
     */
    // public NoTypeExeption() {
    //     super("Attention !!! Vous devez entrer un type de personnage valide: Guerrier ou Magicien !");
    // }

    /** 
     * Surcharge de la méthode "toString" pour afficher le message personalisé.
     * @param N/A 
     *  
     * @return Message personalisé! 
     * @throws InterruptedException 
     *     L'input ne doit recevoir que l'une des deux string: "Guerrier" ou "Magicien"! 
     */ 
    public String toString()
    {
        return "Attention !!! Vous devez entrer un type de personnage valide: Guerrier ou Magicien !";
    }
}