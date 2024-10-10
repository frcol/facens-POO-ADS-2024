package Aula_8_Relacionamento;
public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Eliney", "Coordenado");
        Funcionario func2 = new Funcionario("Fabio", "Professor");
        
        func1.addSubordinado(func2);
        
        System.out.println(func1.print());
        func1.listarFuncionarios();
    }
}
