package Fabrique_Abstraite.conf;

public class Composant implements Conf { // une pièce élémentaire
    private String libelle;
    private double prixHT;
    private double poidsKg;
    private int delaiJours;

    public Composant(String libelle, double prixHT, double poidsKg, int delaiJours) {
        this.prixHT = prixHT;
        this.libelle = libelle;
        this.poidsKg = poidsKg;
        this.delaiJours = delaiJours;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public double getPoidsKg() {
        return poidsKg;
    }

    public void setPoidsKg(double poidsKg) {
        this.poidsKg = poidsKg;
    }

    public int getDelaiJours() {
        return delaiJours;
    }

    public void setDelaiJours(int delaiJours) {
        this.delaiJours = delaiJours;
    }
}
