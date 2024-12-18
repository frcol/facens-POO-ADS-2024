package Aula_11_Static_Abstract;

import Aula_9_Heranca_Sobrescrita.*;

public class Aluno extends Pessoa {
    private String ra;
    private double nota1;
    private double nota2;
    
    public Aluno() { }
    
    public Aluno(String nome, String cpf, String ra) {
       super(cpf, nome);
       
       this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    // ================================
    public double media() {
        return (nota1 + nota2)/2;
    }
    
    @Override
    public String imprimir() {
        return "\n\n## ALUNO ##"
                +super.imprimir()
                
                +"\nRA: "+ra
                +"\nNota 1: "+nota1
                +"\nNota 2: "+nota2
                +"\nMedia: "+media();
    }

    public void teste() {
        
    }
}
