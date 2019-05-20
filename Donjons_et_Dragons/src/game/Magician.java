package game;

class  Magician extends Personnage {

    // Variables de classe
    private static final int min = 3;
    private static final int max = 6;
    private static final int minForce = 8;
    private static final int maxForce = 15;
    private static int life = r.nextInt(max - min + 1) + min;
    private static int force = r.nextInt(maxForce - minForce + 1) + minForce;

    // Variables d'instance

    // Constructeur par defaut
    public Magician() {
        this("Merlin", "merlin.png", magician, life, force);
    }

    // Constructeur avec arguments
    public Magician(String nom, String image, String type) {
        this(nom, image, type, life, force);
        //this.nom = "Combatant" ;
    }

    public Magician(String nom, String image, String type, int life, int force) {
        this.setNom(nom) ;
        this.setImage(image) ;
        this.setType(type) ;
        this.setLife(life) ;
        this.setForce(force) ;
    }

        // Accesseurs
        // public String getNom() {
        //     return super.getNom() ;
        // }
    
        // public void setNom(String nom) {
        //     super.setNom(nom) ;
        // }
    
        // public String getImage() {
        //     return super.getImage() ;
        // }
    
        // public void setImage(String image) {
        //     super.setImage(image); ;
        // }
    
        // public String getType() {
        //     return super.getType() ;
        // }
    
        // public void setType(String type) {
        //     super.setType(type) ;
        // }
    
        // public int getLife() {
        //     return this.life ;
        // }
    
        // public void setLife(int life) {
        //     this.life = life ;
        // }
    
        // public int getForce() {
        //     return this.force ;
        // }
    
        // public void setForce(int force) {
        //     this.force = force ;
        // }

    // Methodes
    public int Attack(int adversMax, int adversMin) {
        int coups = r.nextInt(adversMax - adversMin + 1) + adversMin ;
        this.life -= coups;
        return coups ;
    }

    // public void Show() {
    //     super.Show() ;
    //     System.out.println(getNom()) ;
    //     System.out.println(getImage()) ;
    //     System.out.println(getType()) ;
    //     System.out.println(getLife()) ;
    //     System.out.println(getForce()) ;
    // }

    // public void Damage(int damage) {
    //     super.Damage() ;
    // }

}