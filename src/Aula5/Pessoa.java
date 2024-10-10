package Aula5;

public class Pessoa
{
    private String nome;
    private int idade;
    private String livro;
    private int diasDevolucao;
    
    public Pessoa() { }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, String livro, int dias) {
        this.nome = nome;
        this.idade = idade;
        this.livro = livro;
        this.diasDevolucao = dias;
    }
    
    
}
