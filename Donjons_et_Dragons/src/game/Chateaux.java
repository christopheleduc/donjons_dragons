package game;

import java.io.UnsupportedEncodingException;

 // Plateau
public class Chateaux {

            
            public void s1() {

                Plateau position = Plateau.SALLE_01;
                System.out.println(
                        "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());

                SpecialCharacters unicar = new SpecialCharacters(); // Affiche la première salle (caractères Unicode)
                try {
                    unicar.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                    unicar.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                    unicar.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            public void s2() {

                Plateau position = Plateau.SALLE_02;
                System.out.println(
                        "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
    
                SpecialCharacters unicar = new SpecialCharacters(); // Affiche la première salle (caractères Unicode)
                try {
                    unicar.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                    unicar.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                    unicar.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            public void s3() {

                Plateau position = Plateau.SALLE_03;
                System.out.println(
                        "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
                SpecialCharacters unicar1 = new SpecialCharacters(); // Affiche la seconde salle (caractères Unicode)
                try {
                    unicar1.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                    unicar1.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                    unicar1.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            public void s4() {

                Plateau position = Plateau.SALLE_04;
                System.out.println(
                        "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
                SpecialCharacters unicar2 = new SpecialCharacters(); // Affiche la seconde salle (caractères Unicode)
                try {
                    unicar2.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                    unicar2.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                    unicar2.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            public void s5() {

                Plateau position = Plateau.SALLE_05;
                System.out.println(
                        "Vous etes dans la " + position.getSalle() + " " + position.getNum() + " " + position.getMessage());
                SpecialCharacters unicar3 = new SpecialCharacters(); // Affiche la seconde salle (caractères Unicode)
                try {
                    unicar3.startTest(position.getCar1(), position.getCar2(), position.getCar3(), position.getCar4(), position.getCar5()); // Première ligne de 3 cases
                    unicar3.startTest(position.getCar6(), position.getCar7(), position.getCar8(), position.getCar9(), position.getCar10()); // Deuxieme ligne de 3 cases
                    unicar3.startTest(position.getCar11(), position.getCar12(), position.getCar13(), position.getCar14(), position.getCar15()); // Troisième ligne de 3 cases
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
    
}