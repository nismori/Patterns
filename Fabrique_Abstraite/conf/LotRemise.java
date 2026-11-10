package Fabrique_Abstraite.conf;

public class LotRemise extends Lot {
    private double remise;

    public LotRemise(String libelle, double remise){
        super(libelle);
        this.remise = remise;
    }

    @Override
    public double getPrixHT(){
        double resultat = super.getPrixHT();
        return resultat*(1-remise);
    }
}
