package Strategie;

import Strategie.Deplacement.DeplacementMage;

public class Mage extends Personnage {
    public Mage() {
        this.setDeplacement(new DeplacementMage());
    }
}
