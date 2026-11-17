package Facade;

public class Authentification {
    public String connecter(String login, String password) {
        if ("admin".equals(login) && "1234".equals(password)) {
            return "Vous venez de passer admin";
        } else {
            return "Vous êtes connecté";
        }
    }

    public void deconnecter(String login) {
        System.out.println(login + " est déconnecté");
    }
}
