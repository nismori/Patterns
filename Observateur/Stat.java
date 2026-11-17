package Observateur;

public class Stat implements Observateur {
    public void ajouterInfoProduit() {
        System.out.println("Ceci est une info du produit.");
    }

    public void execute() {
        this.ajouterInfoProduit();
    }
}
