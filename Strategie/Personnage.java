package Strategie;

import Strategie.Deplacement.Deplacement;

public abstract class Personnage {
    private int pv;
    private int pa;
    private String nom;
    private Deplacement monDeplacement;

    public void attaquer() {
        System.out.println("Prend ça !");
    }

    public void deplacer() {
        this.monDeplacement.faire();
    }

    public void mourir() {
        if (pv == 0)
            System.out.println("Je suis mort...");
    }

    public void manger() {
        System.out.println("Miam miam");
    }

    public void setDeplacement(Deplacement deplacement) {
        this.monDeplacement = deplacement;
    }
}
