package Factory_Method;

public abstract class Aeronef implements Volatile {
    @Override
    public void voler() {
        System.out.println("L'aeronef vole");
    }

    @Override
    public void atterir() {
        System.out.println("L'aeronef atterrit");
    }

    @Override
    public void decoller() {
        System.out.println("L'aeronef décolle");
    }

    public void fairePlein() {
        System.out.println("Le prix du litre...");
    }
}
