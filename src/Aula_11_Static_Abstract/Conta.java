package Aula_11_Static_Abstract;

public class Conta{
   private static int quantidadeContas=0;

   public Conta(){
      quantidadeContas++;
   } 
   
   public int getQtdeTotalContas(){
      return quantidadeContas;
   }
}
