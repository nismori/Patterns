package Decorateur;

public class Burrata extends LeTrucEnPlus {
    public Burrata(Pizza p) {
        super(p);
    }

    @Override
    public double getPrix() {
        return this.basePizza.getPrix() + 4;
    }
}
