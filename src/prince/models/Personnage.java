package prince.models;

public class Personnage {
    // Une propriété de la classe (toujours en privé)
    private String name;
    // Le getter de la propriété
    public String getName() { return name; }
    // Le setter de la propriété
    public void setName(String name) { this.name = name; }

    private int pointDeVieMax;

    protected int pointDeVie;
    public int getPointDeVie() { return pointDeVie; }
    public void setPointDeVie(int nouveauPv) {
        if (nouveauPv >= 0 && nouveauPv <= pointDeVieMax) {
            this.pointDeVie = nouveauPv;
        }
    }

    // Constructeur de la classe
    public Personnage() {
        this.name = "User";
        this.pointDeVie = 5;
        this.pointDeVieMax = this.pointDeVie;
    }

    // Constructeur surchargé
    public Personnage(String name, int pointDeVie) {
        this.name = name;
        this.pointDeVie = pointDeVie;
        this.pointDeVieMax = pointDeVie;
    }
    
    // Une méthode de la classe
    public String coupDePoing(Personnage autrePersonnage) {
        autrePersonnage.setPointDeVie(autrePersonnage.getPointDeVie() - 2);
        return "Le personnage " + autrePersonnage.getName() + " a perdu 2 points de vie";
    }

    // Une méthode surdéfinie (méthode hérité de la classe de base: la classe Object)
    @Override
    public String toString() {
        return "Je suis " + this.name + " avec " + this.pointDeVie + " points de vie";
    }
}
