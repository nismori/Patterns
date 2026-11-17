package Factory_Method;

public class BiomeNature extends Biome {
    public BiomeNature(String type) {
        super(type);
    }

    public Volatile newVolatile() {
        return new RougeGorge("Ca fait quel bruit un rouge gorge ?");
    }
}
