package Composite.conf;

public class GestionDivers {

    /*public static double calculerPrix(Object o) {
        if (o instanceof Composant) {
            return ((Composant) o).getPrixHT();
        }
        if (o instanceof Lot) {
            Lot lot = (Lot) o;
            double total = 0;
            for (Object e : lot.getElements()) {
                if (e instanceof Composant) {
                    total += ((Composant) e).getPrixHT();
                }
            }
            return total;
        }
        if (o instanceof Poste) {
            Poste p = (Poste) o;
            double total = 0;
            for (Object ligne : p.getLignes()) {
                total += calculerPrix(ligne);
            }
            return total;
        }
        return 0;
    }

    public static double calculerPoids(Object o) {
        if (o instanceof Composant) {
            return ((Composant) o).getPoidsKg();
        }
        if (o instanceof Lot) {
            double total = 0;
            for (Object e : ((Lot) o).getElements()) {
                total += calculerPoids(e);
            }
            return total;
        }
        if (o instanceof Poste) {
            double total = 0;
            for (Object l : ((Poste) o).getLignes()) {
                total += calculerPoids(l);
            }
            return total;
        }
        return 0;
    }

    public static int calculerDelai(Object o) {
        if (o instanceof Composant) {
            return ((Composant) o).getDelaiJours();
        }
        if (o instanceof Lot) {
            int total = 0;
            for (Object e : ((Lot) o).getElements()) {
                total += calculerDelai(e);        // Quel est le problème ici ?
            }
            return total;
        }
        return 0;
    }

    */
}
