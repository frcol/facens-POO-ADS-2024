package Aula7_ArrayList;

import java.util.ArrayList;

public class Espaconave {
    private String nome;
    private ArrayList<Arma> lstArmas = new ArrayList<>();
    
    public void addArma(Arma arma) {
        lstArmas.add(arma);
    }
    
    public void removeArma(Arma arma) {
        lstArmas.remove(arma);
    }
    
    public void atira(String nome) {
        for (int i=0; i < lstArmas.size(); i++) {
            if (lstArmas.get(i).getNome().equals(nome)) {
                lstArmas.get(i).atira();
            }
        }
    }
    
    public void atiraTodas() {
        for (int i=0; i < lstArmas.size(); i++) {
            lstArmas.get(i).atira();
        }
    }
    
    public void listarArmas() {
        for (int i=0; i < lstArmas.size(); i++) {
            lstArmas.get(i).print();
            System.out.println("-----------");
        }
    }
}
