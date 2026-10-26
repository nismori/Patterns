package Strategie;
import Strategie.Deplacement.*;

public class Mage extends Personnage{
    public Mage(){
        this.setDeplacement(new DeplacementMage());
    }
}
