package Aula_10_DB.entity;

public class Animal {
    int id;
    private String nome;
    private String raca;

    public Animal() { }
    
    public Animal(int id, String nome, String raca) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
