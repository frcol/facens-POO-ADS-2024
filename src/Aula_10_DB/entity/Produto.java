package Aula_10_DB.entity;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public Produto(int id, String nome, int quantidade, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
}
