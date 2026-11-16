package Decorateur;

public class Main {
    static void main(String[] args){
        Pizza p = new PizzaTomate();
        p = new Burrata(p);
        p = new Oignon(p);
        p = new Champignon(p);
        p = new Promo(p, 0.8);
        System.out.println("Ca fera " + p.getPrix() + " euros.");
    }
}
