package Adaptateur_Interface;

public class Turkey {
    private String nom;
    private int age = 2;

    public Turkey(){
        this.nom = "Dinde";
        this.age = age;
    }

    public void glouglou()
    {
        System.out.println("Glou glou");
    }

    public void eat()
    {
        System.out.println("La dinde mange des graines d'interface");
    }
}
