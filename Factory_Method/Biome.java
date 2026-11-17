package Factory_Method;

import java.util.ArrayList;
import java.util.List;

public abstract class Biome {
    private String type;
    private List<Volatile> listV;

    public Biome(String type) {
        this.type = type;
        this.listV = new ArrayList<>();
    }

    public abstract Volatile newVolatile();

    public void construire() {
        listV.add(this.newVolatile());
    }

    public void evoluer(String type) {
        System.out.println("Le Biome " + this.type + " est devenu un biome " + type);
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder c = new StringBuilder();
        for (Volatile v : listV) {
            c.append(v);
        }
        return c.toString();
    }
}
