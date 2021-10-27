package prince.models;

public class Prince extends Personnage {

    public Prince(String name, int pointDeVie) {
        super(name, pointDeVie);
    }

    public String prendre(Fiole fiole) {
        setPointDeVie(this.pointDeVie + fiole.getPointDeVie());
        return "Le prince a gagné " + fiole.getPointDeVie() + " points de vie";
    }

    public String coupDePoing(Garde garde) {
        garde.setPointDeVie(garde.getPointDeVie() - 5);
        return "Le garde " + garde.getName() + " a perdu 5 points de vie";
    }
}
