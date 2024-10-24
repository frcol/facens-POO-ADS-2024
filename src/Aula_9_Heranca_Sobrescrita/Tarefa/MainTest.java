package Aula_9_Heranca_Sobrescrita.Tarefa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Animal> lstAnimais =  new ArrayList<>();
        
        Cachorro dog = new Cachorro("Xodo", 12, 23);
        Gato cat = new Gato("Sol", 5, 1);
        Capivara capi = new Capivara("Sebastiao", 55, 230);
        
        lstAnimais.add(dog);
        lstAnimais.add(cat);
        lstAnimais.add(capi);
        
        String msg = "";
        for (Animal animal : lstAnimais) {;
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).getVelocidade();
            }
            msg += "\n"+animal.imprimir();
        }
        
        //JOptionPane.showMessageDialog(null, msg);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        JOptionPane.showMessageDialog(null, idade);
        
        
    }
}
