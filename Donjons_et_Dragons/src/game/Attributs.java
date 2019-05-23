package game;


public class Attributs {

    // ***********************
    // Variables de classe
    // ***********************
    private static final int warLifeMin = 5;
    private static final int warLifeMax = 10;
    private static final int warForceMin = 5;
    private static final int warForceMax = 10;
    private static final int magicLifeMin = 3;
    private static final int magicLifeMax = 6;
    private static final int magicForceMin = 8;
    private static final int magicForceMax = 15;
    private static final int mort = 0;
    private static final String warrior = ("Guerrier");
    private static final String magician = ("Magicien");
    // Lang FR
    private static final String fr_persoChoice = "Choisissez un type de personnage: Guerrier ou Magicien  ";
    private static final String fr_persoChoiceYes = "Vous avez choisi ";
    private static final String fr_exclam = " !";
    private static final String fr_persoDev = "Vous devez choisir un type de personnage!";
    private static final String fr_persoNameChoice = "Choisissez un nom pour votre personnage.";
    private static final String fr_persoNameDev = "Vous devez entrer un nom pour votre personnage!";
    private static final String fr_choice = "Vous avez choisi ";
    private static final String fr_pointsAt = "Vos points d'attaque: [";
    private static final String fr_pointsVie = "Votre niveau de vie: [";
    private static final String fr_fight = "Combatez !  ";
    private static final String fr_pointsFight = "Votre attaque: ";
    private static final String fr_forceFight = "Puissance de votre attaque: ";
    private static final String fr_advers = "Votre adversaire: ";
    private static final String fr_revenge = "La replique: ";
    private static final String fr_pointsAdv = "Celui de votre adversaire: [";
    private static final String fr_dead = "] Qui est mort!";
    private static final String fr_win = "Vous etes vainqueur !!!!!!!!!!!!!";
    private static final String fr_defat = "Vous avez perdu !!!!!!!!!!!!!";
    private static final String fr_youDead = "Vous etes mort!";
    // Univers
    private static final String vs = "                VS";
    private static final String line = "*****************************************************";
    private static final String crochFin = "]";
    private static final String crochFinExcl = "] !";
    

        // Accesseurs
        public int getWarLifeMin() {
            return this.warLifeMin ;
        }

        public int getWarLifeMax() {
            return this.warLifeMax ;
        }

        public int getWarForceMin() {
            return this.warForceMin ;
        }

        public int getWarForceMax() {
            return this.warForceMax ;
        }

        public int getMagicLifeMin() {
            return this.magicLifeMin ;
        }

        public int getMagicLifeMax() {
            return this.magicLifeMax ;
        }

        public int getMagicForceMin() {
            return this.magicForceMin ;
        }

        public int getMagicForceMax() {
            return this.magicForceMax ;
        }
    
        public int getMort() {
            return this.mort ;
        }

        public String getWarrior() {
            return this.warrior ;
        }

        public String getMagician() {
            return this.magician ;
        }

        // Accesseurs Lang Univers
        public String getVs() {
            return this.vs ;
        }

        public String getLine() {
            return this.line ;
        }

        public String getCrf() {
            return this.crochFin ;
        }
        
        public String getCrfx() {
            return this.crochFinExcl ;
        }

        // Accesseurs Lang Univers

        public String getPc() {
            return this.fr_persoChoice ;
        }
        
        public String getPcy() {
            return this.fr_persoChoiceYes ;
        }

        public String getExc() {
            return this.fr_exclam ;
        }

        public String getPdev() {
            return this.fr_persoDev ;
        }

        public String getPnc() {
            return this.fr_persoNameChoice ;
        }

        public String getPnd() {
            return this.fr_persoNameDev ;
        }

        public String getChic() {
            return this.fr_choice ;
        }

        public String getPnat() {
            return this.fr_pointsAt ;
        }

        public String getPtvi() {
            return this.fr_pointsVie ;
        }

        public String getFght() {
            return this.fr_fight ;
        }

        public String getVat() {
            return this.fr_pointsFight ;
        }

        public String getFft() {
            return this.fr_forceFight ;
        }

        public String getVadv() {
            return this.fr_advers ;
        }

        public String getLrp() {
            return this.fr_revenge ;
        }

        public String getCvad() {
            return this.fr_pointsAdv ;
        }

        public String getQem() {
            return this.fr_dead ;
        }

        public String getVev() {
            return this.fr_win ;
        }

        public String getVap() {
            return this.fr_defat ;
        }

        public String getVem() {
            return this.fr_youDead ;
        }

}
