package Decorateur;

public abstract class LeTrucEnPlus extends Pizza{
    protected Pizza basePizza;

    public LeTrucEnPlus(Pizza p){
        this.basePizza = p;
    }

    public abstract double getPrix();
}
