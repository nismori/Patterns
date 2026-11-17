package Factory_Method;

public class Main {
    public static void factory() {
        BiomeNature nature = new BiomeNature("Désert");
        nature.construire();
        System.out.println(nature);
    }

    public static void main(String[] args) {
        factory();
    }
}
