package Strategie;

import Strategie.Deplacement.DeplacementChevalier;
import Strategie.Deplacement.DeplacementVillageois;

public class Main {
    public static void main(String[] args) {
        Personnage p1 = new Mage(); // Faire attention à prendre la classe la plus haute pour le typage.
        p1.deplacer();
        p1.setDeplacement(new DeplacementChevalier());
        p1.deplacer();
        p1.setDeplacement(new DeplacementVillageois());
        p1.deplacer();

    }
}
