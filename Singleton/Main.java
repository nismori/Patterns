package Singleton;

public class Main {
    public static void main() {
        FacadeMetier user1 = FacadeMetier.getLaFacade();
        user1.lire();
        FacadeMetier user2 = FacadeMetier.getLaFacade();
        user2.zoomer();
        FacadeMetier user3 = FacadeMetier.getLaFacade();
        user3.imprimer();
        System.out.println(user1 == user2 && user2 == user3); // ↔ Les trois utilisateurs ont la même instance de FacadeMetier.
    }
}
