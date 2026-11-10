package Fabrique_Abstraite.facture;

import Fabrique_Abstraite.Facture;
import Fabrique_Abstraite.conf.Conf;

public class FactureFR implements Facture {
    public void editer(Conf conf){
        System.out.println("C'est edité putain !");
    }
}
