package Fabrique_Abstraite.facture;

import Fabrique_Abstraite.Facture;
import Fabrique_Abstraite.conf.*;

public class FactureQc implements Facture {
    public void editer(Conf conf){
        System.out.println("C'est edité tabernak !");
    }
}