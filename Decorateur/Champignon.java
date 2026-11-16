package Decorateur;

public class Champignon extends LeTrucEnPlus{
    public Champignon(Pizza p){
        super(p);
    }

    @Override
    public double getPrix(){
        return this.basePizza.getPrix() + 2;
    }
}
