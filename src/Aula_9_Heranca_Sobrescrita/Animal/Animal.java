package Aula_9_Heranca_Sobrescrita.Animal;

public class Animal {
    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void falar() {
        System.out.println("Falando como ANIMAL......");
    }
}
