package prince;

import prince.models.Epee;
import prince.models.Fiole;
import prince.models.Garde;
import prince.models.Prince;

public class Jeu {
    public static void main(String[] args) {

        Prince prince = new Prince("Martin", 10);
        Fiole fiole1 = new Fiole(1);
        Garde garde = new Garde("Garcia", 10);
        Epee epee = new Epee();

        System.out.println(garde);
        System.out.println(prince.coupDePoing(garde));
        System.out.println(garde);
    }
}
