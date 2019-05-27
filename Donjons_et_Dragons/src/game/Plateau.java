package game;

public enum Plateau {

    SALLE_01 (1, "Salle N°", "La voie est libre !", "\u250f", "\u2501", "\u21e1", "\u2501", "\u2513", "\u2503", " ", "\ud83d\udc68", " ", "\u2503", "\u2517", "\u2501", "\u2501", "\u2501", "\u251b", "\ud83d\udd7a"),
    SALLE_02 (2, "Salle N°", "Rencontre avec un loup-garrou !", "\u250f", "\u2501", "\u21e1", "\u2501", "\u2513", "\u2503", "\ud83d\udc7f", "\ud83d\udc68", " ", "\u2503", "\u2517", "\u2501", "\u2501", "\u2501", "\u251b", "\ud83d\udd7a"),
    SALLE_03 (3, "Salle N°", "Vous découvrez une potion de Vie !", "\u250f", "\u2501", "\u21e1", "\u2501", "\u2513", "\u2503", " ", "\ud83d\udc68", " ", "\u2503", "\u2517", "\u2501", "\u2501", "\u2501", "\u251b", "\ud83d\udd7a"),
    SALLE_04 (4, "Salle N°", "Rencontre avec un Elf maléfique !", "\u250f", "\u2501", "\u21e1", "\u2501", "\u2513", "\u2503", " ", "\ud83d\udc68", "\ud83d\udc7e", "\u2503", "\u2517", "\u2501", "\u2501", "\u2501", "\u251b", "\ud83d\udd7a"),
    SALLE_05 (5, "Salle N°", "La lumière est au bout du tunel !", "\u250f", "\u2501", "\u21e1", "\u2501", "\u2513", "\u2503", " ", "\ud83d\udc68", " ", "\u2503", "\u2517", "\u2501", "\u2501", "\u2501", "\u251b", "\ud83d\udd7a");

    private int num;
    private String salle;
    private String message;
    private String car1;
    private String car2;
    private String car3;
    private String car4;
    private String car5;
    private String car6;
    private String car7;
    private String car8;
    private String car9;
    private String car10;
    private String car11;
    private String car12;
    private String car13;
    private String car14;
    private String car15;
    private String car16;

    Plateau(int num, String salle, String message, String car1, String car2, String car3, String car4, String car5, String car6, String car7, String car8, String car9, String car10, String car11, String car12, String car13, String car14, String car15, String car16){
        this.num = num;
        this.salle = salle;
        this.message = message;
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.car4 = car4;
        this.car5 = car5;
        this.car6 = car6;
        this.car7 = car7;
        this.car8 = car8;
        this.car9 = car9;
        this.car10 = car10;
        this.car11 = car11;
        this.car12 = car12;
        this.car13 = car13;
        this.car14 = car14;
        this.car15 = car15;
        this.car16 = car16;
    }

    public int getNum() {
        return num;
    }

    public String getSalle() {
        return salle;
    }

    public String getMessage() {
        return message;
    }

    public String getCar1() {
        return car1;
    }

    public String getCar2() {
        return car2;
    }

    public String getCar3() {
        return car3;
    }

    public String getCar4() {
        return car4;
    }

    public String getCar5() {
        return car5;
    }

    public String getCar6() {
        return car6;
    }

    public String getCar7() {
        return car7;
    }

    public String getCar8() {
        return car8;
    }

    public String getCar9() {
        return car9;
    }

    public String getCar10() {
        return car10;
    }

    public String getCar11() {
        return car11;
    }

    public String getCar12() {
        return car12;
    }

    public String getCar13() {
        return car13;
    }

    public String getCar14() {
        return car14;
    }

    public String getCar15() {
        return car15;
    }

    public String getCar16() {
        return car16;
    }

}