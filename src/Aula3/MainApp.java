package Aula3;

public class MainApp {
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        alu.setNome("João");
        alu.setRa("2342342");
        alu.setCurso("ADS");
        
        System.out.println("Nome: "+alu.getNome());
        System.out.println("RA: "+alu.getRa());
        System.out.println("Curso: "+alu.getCurso());
        
        Aluno alu2 = new Aluno();
        alu2.setNome("Maria");
        alu2.setRa("000111");
        alu2.setCurso("Jogos");
        
        System.out.println("");
        System.out.println("Nome: "+alu2.getNome());
        System.out.println("RA: "+alu2.getRa());
        System.out.println("Curso: "+alu2.getCurso());
        
        Cadeira cad = new Cadeira();
        cad.numPernas = 3;
        cad.cor = "preto";
        cad.temEncosto = true;
        
        System.out.println("Num pernas: "+cad.numPernas);
        System.out.println("Cor: "+cad.cor);
        System.out.println("Tem encosto: "+cad.temEncosto);
        
    }
}
