package Aula_9_Heranca_Sobrescrita.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal ani = new Animal("Sol");
        ani.falar();
        
        Gato cat1 = new Gato("Mel");
        cat1.falar();
        
        Cachorro dog1 = new Cachorro("Stefanni");
        dog1.falar();
    }
}
