package Observateur;

import java.util.ArrayList;
import java.util.List;

public class SuperClasse {
    private List<Observateur> listeDo;

    public SuperClasse() {
        listeDo = new ArrayList();
    }

    public void show() {
        if(listeDo.isEmpty()) {
            System.out.println("Il n'y a rien à afficher");
            return;
        }
        for (Observateur d : listeDo) {
            d.execute();
        }
    }

    public void addObservateur(Observateur o) {
        listeDo.add(o);
    }

    public void removeObservateur(Observateur o) {
        listeDo.remove(o);
    }
}
