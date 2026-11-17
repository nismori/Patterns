package Factory_Method;

public class RougeGorge extends Oiseau {
    private String nom;
    private int age;

    public RougeGorge(String nom) {
        this.nom = nom;
        this.age = 2;
    }

    @Override
    public String toString(){
        return super.toString() + " de type RougeGorge.";
    }
}
