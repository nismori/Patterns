package Adaptateur_Interface;

public class Dinde extends Turkey implements Canard {
    public Dinde() {
        super();
    }

    @Override
    public void coincoin() {
        this.glouglou();
    }

    @Override
    public void manger() {
        this.eat();
    }
}
