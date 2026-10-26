package Strategie;
import Strategie.Deplacement.*;

public class Villageois extends Personnage{
    public Villageois(){
        this.setDeplacement(new DeplacementVillageois());
    }
}
