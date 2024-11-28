package Aula_10_DB.view;

import Aula_10_DB.dao.ProdutoDAO;
import Aula_10_DB.entity.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto(0, "TV", 3, 1200);
        
        new ProdutoDAO().inserir(p);
    }
}
