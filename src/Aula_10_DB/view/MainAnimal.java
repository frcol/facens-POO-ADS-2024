package Aula_10_DB.view;

import Aula_10_DB.dao.AnimalDAO;
import Aula_10_DB.entity.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal ani = new Animal(1, "Xodo Colombini", "VL");
        
        Animal tmp = new AnimalDAO().getByField(Animal.class, "nome", "Xodo Colombini");
        System.out.println(tmp.getNome());
    }
}
