package Aula7_ArrayList;

public class Arma {
    private String nome;
    private int dano;
    private String efeito;
    
    public String getNome() {
        return nome;
    }
    
    public void atira() {
        System.out.println(efeito);
    }
    
    public void print() {
        System.out.println("Nome: "+nome);
        System.out.println("Dano: "+dano);
        System.out.println("Efeito: "+efeito);
    }
}
