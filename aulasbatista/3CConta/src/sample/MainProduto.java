package sample;

import sample.model.Produto;

import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {
        //Lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        //Produto 1
        Produto produto = new Produto();
        produto.setNome("Maça");
        produto.setPreco(3.6);

        //Produto 2
        Produto produto2 = new Produto();
        produto2.setNome("Laranja");
        produto2.setPreco(2.5);

        //Produto 3
        Produto produto3 = new Produto();
        produto3.setNome("Uva");
        produto3.setPreco(5.7);

        //add produtos ao arraylist
        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos);

        produtos.remove(produto2);
        System.out.println(produtos);


    }

}
