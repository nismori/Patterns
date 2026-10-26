package Strategie;
import Strategie.Deplacement.*;

public class Chevalier extends Personnage{
    public Chevalier(){
        this.setDeplacement(new DeplacementChevalier());
    }
}
