package Singleton;

public class FacadeMetier {
    private static FacadeMetier laFacade;
    private Lecture lire = new Lecture();
    private Zoom zoom = new Zoom();
    private Impression impression = new Impression();

    private FacadeMetier(){}// Contructeur privé pour éviter une instanciation de Facade depuis l'extérieur. On cache la clé du coffre-fort dans le coffre-fort. Une absence de constructeur pour FacadeMetier implique un constructeur avec la même visibilité que la classe

    public void lire(){lire.lire();}
    public void zoomer(){zoom.zoomer();}
    public void imprimer(){impression.imprimer();}

    public static synchronized FacadeMetier getLaFacade(){ // synchronized : garantit la sécurité en cas de multiples appels
        if(FacadeMetier.laFacade == null){
            FacadeMetier.laFacade = new FacadeMetier();
        }
        return FacadeMetier.laFacade;
    }
}
