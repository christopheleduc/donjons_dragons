package game;


public class Attributs {

    // Variables de classe
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

}
