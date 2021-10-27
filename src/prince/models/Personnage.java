package prince.models;

public class Personnage {
    private String name;
    private int pointDeVieMax;
    private int pointDeVie;

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int nouveauPv) {
        if (nouveauPv >= 0 && nouveauPv <= pointDeVieMax) {
            this.pointDeVie = nouveauPv;
        }
    }

    public Personnage() {
        this.name = "User";
        this.pointDeVie = 3;
        this.pointDeVieMax = this.pointDeVie;
    }

    public Personnage(String name, int pointDeVie) {
        this.name = name;
        this.pointDeVie = pointDeVie;
        this.pointDeVieMax = pointDeVie;
    }

    public void blessure() {
        // this.pointDeVie = this.pointDeVie - 1;
        this.setPointDeVie(this.pointDeVie - 1);
    }

    public String attaque(Personnage personnage) {
        // personnage.pointDeVie = personnage.pointDeVie - 2;
        personnage.setPointDeVie(personnage.pointDeVie - 2);
        return this.name + " vous avez attaqué " + personnage.name;
    }

    public String potion() {
        // this.pointDeVie = this.pointDeVieMax;
        this.setPointDeVie(this.pointDeVieMax);
        return "Vous avez récupéré la totalité de vos vies.";
    }

    @Override
    public String toString() {
        return "Je suis un personnage avec " + pointDeVie + " points de vie";
    }
}
