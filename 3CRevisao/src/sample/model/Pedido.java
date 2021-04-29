package sample.model;

import java.util.ArrayList;


public class Pedido {
    //ATRIBUTOS
    private String data;
    private ItensDoPedido itens;
    private Cliente cliente;

    //CONSTRUTORES
    public Pedido(){
        itens = new ItensDoPedido();
    }

    //GETTERS AND SETTERS
    public void setProduto(String nome, double preco){
        itens.setProdutos(nome, preco);
    }

    public ItensDoPedido getItens(){
        return itens;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //ToString
     @Override
    public String toString(){
        return "NOVO PEDIDO\nData da Compra: " + data + "\n" +itens + "\nCliente: " + cliente ;


    }
}
