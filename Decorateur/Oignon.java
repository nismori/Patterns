package Decorateur;

public class Oignon extends LeTrucEnPlus {
    public Oignon(Pizza p) {
        super(p);
    }

    @Override
    public double getPrix() {
        return this.basePizza.getPrix();
    }
}
