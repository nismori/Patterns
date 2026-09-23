package Factory_Method;


import javax.xml.stream.FactoryConfigurationError;

public class Main {
    public static void factory(){
        BiomeNature nature = new BiomeNature("Désert");
        nature.construire();
        System.out.println(nature);
    }

    public static void main(String[] args){
        factory();
    }
}
