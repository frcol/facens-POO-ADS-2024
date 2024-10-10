package Aula7_ArrayList;

import java.util.ArrayList;


public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> lstNomes = new ArrayList<String>();
        
        lstNomes.add("Darth Vader");
        lstNomes.add("Peter Parker");
        lstNomes.add("Dr Estranho");
        
        //System.out.println(lstNomes.get(2));
        
        //lstNomes.clear();
        //System.out.println(lstNomes.size());
        
        if (lstNomes.contains("Peter Parker")) {
            //System.out.println("Achou...");
        }
        
        
        for (int i=0; i < lstNomes.size(); i++) {
            System.out.println(lstNomes.get(i));
        }
        System.out.println("");
        lstNomes.remove(2);
        
        for (int i=0; i < lstNomes.size(); i++) {
            System.out.println(lstNomes.get(i));
        }
    }
}
