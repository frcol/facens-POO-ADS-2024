package Aula_9_Heranca_Sobrescrita;

public class MainPessoa {
    public static void main(String[] args) {
       Professor prof = new Professor("Fabio", "123123", "123");
       prof.setTipoVinculo('I');
       prof.setSalario(45000);
       System.out.println(prof.imprimir());
       
       Aluno alu = new Aluno("Maria", "45454", "345");
       alu.setNota1(8);
       alu.setNota2(4);
       System.out.println(alu.imprimir());
    }
}
