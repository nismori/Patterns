package Observateur;

public class Main {
    static void main(String[] args) {
        SuperClasse s = new SuperClasse();
        s.addObservateur(new Stat());
        s.addObservateur(new Logger());
        s.show();
    }
}
