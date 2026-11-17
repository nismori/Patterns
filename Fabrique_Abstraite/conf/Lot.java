package Fabrique_Abstraite.conf;

import java.util.ArrayList;
import java.util.List;


public class Lot implements Conf {  // un sous-ensemble assemblé
    private String libelle;
    //private List<Object> elements = new ArrayList<>();   // ← fr.cytech.conf.Composant OU fr.cytech.conf.Lot, d'où le Object
    private List<Conf> elements = new ArrayList<>();


    public Lot(String libelle) {
        this.libelle = libelle;
    }
    //public Lot ajouter(Object o) { elements.add(o); return this; }
    //public List<Object> getElements(){return this.elements;}

    public double getPrixHT() {
        double somme = 0;
        for (Conf c : elements)
            somme += c.getPrixHT();
        return somme;
    }

    public String getLibelle() {
        return libelle;
    }

    public Lot ajouter(Conf conf) {
        elements.add(conf);
        return this;
    }
}

