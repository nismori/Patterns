package Factory_Method;

public abstract class Oiseau implements Volatile {
    @Override
    public void voler() {
        System.out.println("L'oiseau vole");
    }

    @Override
    public void atterir() {
        System.out.println("L'oiseau atterrit");
    }

    @Override
    public void decoller() {
        System.out.println("L'oiseau décolle");
    }

    public void picorer() {
        System.out.println("L'oiseau picore");
    }
}
