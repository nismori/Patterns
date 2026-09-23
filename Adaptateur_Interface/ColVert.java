package Adaptateur_Interface;

public class ColVert implements Canard {
    public ColVert(){
        String nom = "Petit piaf";
        int age = 3;
    }

    @Override
    public void coincoin()
    {
        System.out.println("J'ai beaucoup d'argent, je suis Picsou");
    }

    @Override
    public void manger(){
        System.out.println("C'est quoi ce poulet là");
    }
}
