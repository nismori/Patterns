package Decorateur;

public class PizzaCreme extends Pizza {
    public PizzaCreme() {
        super();
    }

    @Override
    public double getPrix() {
        return 10;
    }
}
