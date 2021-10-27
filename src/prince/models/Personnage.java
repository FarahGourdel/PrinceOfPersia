package prince.models;

public class Personnage {

    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    private int pointDeVieMax;

    protected int pointDeVie;

    public int getPointDeVie() { return pointDeVie; }

    public void setPointDeVie(int nouveauPv) {
        if (nouveauPv >= 0 && nouveauPv <= pointDeVieMax) {
            this.pointDeVie = nouveauPv;
        }
    }

    public Personnage() {
        this.name = "User";
        this.pointDeVie = 5;
        this.pointDeVieMax = this.pointDeVie;
    }

    public Personnage(String name, int pointDeVie) {
        this.name = name;
        this.pointDeVie = pointDeVie;
        this.pointDeVieMax = pointDeVie;
    }

    public String coupDePoing(Personnage autrePersonnage) {
        autrePersonnage.setPointDeVie(autrePersonnage.getPointDeVie() - 2);
        return "Le personnage " + autrePersonnage.getName() + " a perdu 5 points de vie";
    }

    @Override
    public String toString() {
        return "Je suis " + this.name + " avec " + this.pointDeVie + " points de vie";
    }
}
