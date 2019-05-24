package game;

class  Magician extends Personnage {

    // ***********************
    // Variables de classe
    // ***********************
    // private final int min = 3;
    // private final int max = 6;
    // private final int minForce = 8;
    // private final int maxForce = 15;
    
    //private int life = r.nextInt(max - min + 1) + min;
    //private int force = r.nextInt(maxForce - minForce + 1) + minForce;
    /** 
     * Valeur min pour la vie et la force 
     */
    private int min = 3;
    /** 
     * Valeur max pour la vie et la force 
     */
    private int max = 6;
    /** 
     * Valeur min pour la vie et la force 
     */
    private int minForce = 8;
    /** 
     * Valeur max pour la vie et la force 
     */
    private int maxForce = 15;

    // ********************
    // Variables d'instance
    // ********************
    //private final int min;
    //private final int max;
    // private final int minForce;
    // private final int maxForce;

    // ***********************
    // Constructeur par defaut
    // ***********************
    public Magician() {
        this("Merlin", "merlin.png", "Magicien", 0, 0);
    }

    // ****************************
    // Constructeurs avec arguments
    // ****************************
    public Magician(String nom, String image, String type) {
        this(nom, image, type, 0, 0);
    }

    public Magician(String nom, String image, String type, int life, int force) {
        super(nom,image, type);
        // this.setNom(nom) ;
        // this.setImage(image) ;
        // this.setType(type) ;
        this.setLife(r.nextInt(max - min + 1) + min) ;
        this.setForce(r.nextInt(maxForce - minForce + 1) + minForce) ;
        // this.setLife(life) ;
        // this.setForce(force) ;
    }

    // **********
    // Accesseurs
    // **********
    // public int getLife() {
    //         return this.life ;
    //     }
    
    // public void setLife(int life) {
    //         this.life = life ;
    //     }
    
    // public int getForce() {
    //         return this.force ;
    //     }
    
    // public void setForce(int force) {
    //         this.force = force ;
    //     }

    public int getMinForce() {
            return this.minForce ;
        }
    
    public void setMinForce(int minForce) {
            this.minForce = minForce ;
        }

    public int getMaxForce() {
            return this.maxForce ;
        }
    
    public void setMaxForce(int maxForce) {
            this.maxForce = maxForce ;
        }

    // ********
    // Methodes
    // ********
    // public int Attack(int adversMax, int adversMin) {
    //     int coups = r.nextInt(adversMax - adversMin + 1) + adversMin ;
    //     this.life -= coups;
    //     return coups ;
    // }
}