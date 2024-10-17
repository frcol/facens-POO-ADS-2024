package Aula_9_Heranca_Sobrescrita;


public class Pessoa {
    // atributos
    private String nome;
    private String cpf;
    
    // construtores
    public Pessoa() { }
    
    public Pessoa(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // GETS AND SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String imprimir() {
        return "\nNome: "+getNome()
                +"\nCPF: "+getCpf();
    }
}
