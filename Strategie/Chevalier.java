package Strategie;

import Strategie.Deplacement.DeplacementChevalier;

public class Chevalier extends Personnage {
    public Chevalier() {
        this.setDeplacement(new DeplacementChevalier());
    }
}
