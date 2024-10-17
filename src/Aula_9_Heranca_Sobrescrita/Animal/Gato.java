package Aula_9_Heranca_Sobrescrita.Animal;


public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }
    
    @Override
    public void falar() {
        System.out.println("Miau miau miau....");
    }
    
    
}
