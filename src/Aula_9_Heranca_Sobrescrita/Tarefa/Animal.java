package Aula_9_Heranca_Sobrescrita.Tarefa;

public class Animal {
    private String nome;
    private int idade;

    public Animal() {
    }
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public String fala() {
        return "Animal falando...";
    }
    
    public String imprimir() {
        return "\nNome: "+ nome
                +"\nIdade: "+idade;
    }
}
