package prince;

import prince.models.Personnage;

public class Jeu {
    public static void main(String[] args) {
        Personnage p1,p2; //Déclaration
        p1 = new Personnage("User1", 10); //Instanciation
        p2 = new Personnage("User2", 3);
        System.out.println(p1);
        System.out.println(p2);
        for(int i=0; i<10; i++) {
            //System.out.println(new Personnage(i).toString());
        }

        p1.blessure();
        System.out.println(p1);

        System.out.println(p1.attaque(p2));
        System.out.println(p2);

        p1.setPointDeVie(-2);
        System.out.println(p1);
    }
}
