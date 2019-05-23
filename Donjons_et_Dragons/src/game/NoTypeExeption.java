package game;

public class NoTypeExeption extends Exception {

    private static final long serialVersionUID = 1L;

    // public NoTypeExeption() {
    //     super("Attention !!! Vous devez entrer un type de personnage valide: Guerrier ou Magicien !");
    // }

    public String toString()
    {
        return "Attention !!! Vous devez entrer un type de personnage valide: Guerrier ou Magicien !";
    }
}