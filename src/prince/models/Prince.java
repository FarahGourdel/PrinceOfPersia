package prince.models;

public class Prince extends Personnage {

    public Prince() {
        super();
    }

    public String prendre(Fiole fiole) {
        this.setPointDeVie(this.getPointDeVie() + fiole.getPointDeVie());
        return "";
    }
}
