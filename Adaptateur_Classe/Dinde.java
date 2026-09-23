package Adaptateur_Classe;

public class Dinde extends Canard{
    private Turkey dinde;

    public Dinde(String nom){
        super(nom);
        this.dinde = new Turkey();
    }

    @Override
    public void coincoin(){
        dinde.glouglou();
    }

    @Override
    public void manger(){
        dinde.eat();
    }
}
