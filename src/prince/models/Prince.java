package prince.models;

public class Prince extends Personnage {

    private Epee monEpee;

    public Prince(String name, int pointDeVie) {
        super(name, pointDeVie);
    }

    public String prendreFiole(Fiole fiole) {
        setPointDeVie(this.pointDeVie + fiole.getPointDeVie());
        return "Le prince a gagné " + fiole.getPointDeVie() + " points de vie";
    }

    public String prendreEpee(Epee epee) {
        this.monEpee = epee;
        return "Le prince " + this.getName() + " a pris " + epee;
    }

    public String coupDePoing(Garde garde) {
        garde.setPointDeVie(garde.getPointDeVie() - 5);
        return "Le garde " + garde.getName() + " a perdu 5 points de vie";
    }

    public String coupDEpee(Garde garde, Epee epee) {
        if (this.monEpee != null) {
            garde.setPointDeVie(garde.getPointDeVie() - epee.getDegats());
            return "Le garde " + garde.getName() + " a perdu 5 points de vie";
        }
        else return "Il faut prendre une épée !!!";
    }
}
