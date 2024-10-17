package Aula_9_Heranca_Sobrescrita.Animal;

public class Cachorro extends Animal {
    
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Au au au au....");
    }
    
    
}
