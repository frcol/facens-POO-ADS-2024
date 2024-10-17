package Aula_9_Heranca_Sobrescrita;

public class Professor extends Pessoa {
    private String cracha;
    private char tipoVinculo;
    private double salario;
    
    public Professor() { }
    
    public Professor(String nome, String cpf, String cracha) {
        super("123123", "Fabio");
        
        this.cracha = cracha;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String imprimir() {
        return  "\n\n## PROFESSOR ##"
                +"\nNome: "+getNome()
                +"\nCPF: "+getCpf()
                
                +"\nCracha: "+cracha
                +"\nTipo Vinculo: "+tipoVinculo
                +"\nSal�rio: "+salario;
    }
}
