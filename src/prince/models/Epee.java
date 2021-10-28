package prince.models;

public class Epee extends Element {

    private int degats;

    public int getDegats() { return degats; }
    public void setDegats(int degats) { this.degats = degats; }

    public Epee() {
        this.setDegats(5);
    }

    @Override
    public String toString(){
        return "l'épée";
    }

}
