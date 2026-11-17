package Observateur;

public class Main {
    static void main(String[] args) {
        SuperClasse s = new SuperClasse();
        s.show();
        System.out.println();
        s.addObservateur(new Stat());
        s.addObservateur(new Logger());
        s.show();
    }
}
