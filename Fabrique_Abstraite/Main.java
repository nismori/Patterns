package Fabrique_Abstraite;

import Fabrique_Abstraite.conf.Composant;
import Fabrique_Abstraite.conf.Conf;
import Fabrique_Abstraite.edition.EditionFR;
import Fabrique_Abstraite.edition.EditionQc;

public class Main {
    static void main(String[] args) {
        Conf conf = new Composant("Barrette 32 Go", 300, 0.05, 3);

        FabriqueEdition fr = new EditionFR();
        fr.createFacture().editer(conf);
        fr.createMentionLegale().afficher(conf);
        System.out.println();

        FabriqueEdition qc = new EditionQc();
        qc.createFacture().editer(conf);
        qc.createMentionLegale().afficher(conf);
    }
}
