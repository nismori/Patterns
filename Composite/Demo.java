package Composite;

import Composite.conf.Composant;
import Composite.conf.Lot;
import Composite.conf.LotRemise;
import Composite.conf.Poste;

public class Demo {
    static void main(String[] args) {
        Lot kitMemoire = new LotRemise("Kit mémoire 64 Go", 0.5)
                .ajouter(new Composant("Barrette 32 Go", 300, 0.05, 3))
                .ajouter(new Composant("Barrette 32 Go", 300, 0.05, 3));

        Lot uniteCentrale = new Lot("Unité centrale")
                .ajouter(new Composant("Boîtier", 70, 6.0, 2))
                .ajouter(new Composant("Carte mère", 150, 1.2, 5))
                .ajouter(new Composant("CPU", 320, 0.3, 7))
                .ajouter(kitMemoire);                      // ← un Lot dans un Lot

        Poste poste = new Poste("Mairie de Cergy")
                .ajouter(uniteCentrale)
                .ajouter(new Composant("Écran 27\"", 210, 5.4, 4))
                .ajouter(new Composant("Clavier", 25, 0.8, 1));

        System.out.println("Total HT : " + poste.getPrixHT() + " EUR");
    }
}