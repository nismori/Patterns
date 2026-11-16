package Decorateur;

public class Promo extends LeTrucEnPlus{
    private double promo;

    public Promo(Pizza p, double promo){
        super(p);
        this.promo = promo;
    }

    @Override
    public double getPrix(){
        return this.basePizza.getPrix() * this.promo;
    }
}
