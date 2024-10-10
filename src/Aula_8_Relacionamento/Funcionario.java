package Aula_8_Relacionamento;

import java.util.ArrayList;


public class Funcionario {
    private String nome;
    private String cargo;
    ArrayList<Funcionario> lstFuncionarios;
    
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        lstFuncionarios = new ArrayList<>();
    }
    
    public void addSubordinado(Funcionario func) {
        lstFuncionarios.add(func);
    }
    
    public void listarFuncionarios() {
        for (Funcionario func : lstFuncionarios) {
            System.out.println(func.print());
        }
    }
    
    public String print() {
        String mensagem = "Nome: "+nome
                        +"Cargo: "+cargo;
        return mensagem;
    }
}
