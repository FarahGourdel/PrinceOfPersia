package prince;

import prince.models.Fiole;
import prince.models.Garde;
import prince.models.Prince;

public class Jeu {
    public static void main(String[] args) {

        Prince prince = new Prince("Martin", 10);
        Fiole fiole1 = new Fiole(1);
        Garde garde = new Garde("Garcia", 10);

        System.out.println(prince);
        prince.blessure();
        System.out.println(prince);
        prince.prendre(fiole1);
        System.out.println(prince);

        System.out.println(garde);
        System.out.println(prince.coupDePoing(garde));
        System.out.println(garde);
    }
}
