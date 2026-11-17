package Strategie;

import Strategie.Deplacement.DeplacementVillageois;

public class Villageois extends Personnage {
    public Villageois() {
        this.setDeplacement(new DeplacementVillageois());
    }
}
