package Factory_Method;

public class BiomeMetropole extends Biome{
    public BiomeMetropole(String type){
        super(type);
    }

    public Volatile newVolatile(){
        return new Drone("Petite merde");
    }
}
