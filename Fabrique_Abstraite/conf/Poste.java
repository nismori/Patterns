package Fabrique_Abstraite.conf;

import java.util.ArrayList;
import java.util.List;

public class Poste {                           // le devis complet
    private String client;
    private List<Conf> lignes = new ArrayList<>();

    public Poste(String client) { this.client = client; }
    public List<Conf> getLignes(){return this.lignes;}
    public Poste ajouter(Conf o) { lignes.add(o); return this; }

    public double getPrixHT(){
        double somme = 0;
        for(Conf c : lignes)
            somme += c.getPrixHT();
        return somme;
    }
}
