
package Aula3.Tarefa;


public class ContaBancaria {
    private int id;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (saldo >= valor) {
           this.saldo += valor;
            System.out.println("Valor resgatado");
        }
        else {
            System.out.println("##Saldo insuficiente##");
        }
    }
    
    
}
