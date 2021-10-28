package prince.models;

public class Fiole extends Element {

    private int pointDeVie;

    public int getPointDeVie() { return pointDeVie; }
    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public Fiole() {
        this.pointDeVie = 5;
    }

    public Fiole(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
}
