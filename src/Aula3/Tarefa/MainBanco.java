package Aula3.Tarefa;

public class MainBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        System.out.println("Saldo: "+conta.getSaldo());
        
        conta.sacar(50);
        System.out.println("Saldo: "+conta.getSaldo());
        
        conta.sacar(100);
        
        if (conta == null) {
            System.out.println("ok");
        }
    }
}
