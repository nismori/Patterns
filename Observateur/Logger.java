package Observateur;

public class Logger implements Observateur {
    public void logInfo() {
        System.out.println("Ceci est un log.");
    }

    public void execute() {
        this.logInfo();
    }
}
