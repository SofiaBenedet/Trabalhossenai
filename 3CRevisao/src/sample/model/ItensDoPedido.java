package sample.model;

import java.util.ArrayList;
import java.util.List;

public class ItensDoPedido {
    //ATRIBUTOS
    private List<Produto> produtos;
    private double total;

    //CONSTRUTOR
    public ItensDoPedido(){
        produtos = new ArrayList<>();
    }

    //GETTERS AND SETTERS
    public List<Produto> getProdutos(){
        return produtos;
    }
    public void setProdutos(String nome, double preco) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        this.produtos.add(produto);
        total += preco;
    }

    public void setProduto(Produto produto){
        this.produtos.add(produto);
        total += produto.getPreco();
    }

    //ToString
    @Override
    public String toString(){
        return produtos + "\nTotal: " + total;
    }
}
