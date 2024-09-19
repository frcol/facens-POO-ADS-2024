package Aula3;

public class MainAnimal {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.setNome("Xodó");
        ani.setIdade(12);
        ani.setRaca("Sem raça definida");
        ani.imprimir();
        
        Animal ani2 = new Animal();
        ani.setNome("Stefanni");
        ani.setIdade(18);
        ani.setRaca("Shitzu");
        ani.imprimir();
    }
}
