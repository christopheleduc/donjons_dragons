class  Magician extends Personnage {

    // Variables de classe
    private static final int min = 3;
    private static final int max = 6;
    private static final int minForce = 8;
    private static final int maxForce = 15;
    private static final int force = r.nextInt(maxForce - minForce + 1) + minForce;

    // Variables d'instance

    // Constructeur par defaut
    public Magician() {
        this("Merlin", "magician.png", magician, life, force);
    }

    // Constructeur avec arguments
    public Magician(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(life) ;
        this.setForce(force) ;
    }

}