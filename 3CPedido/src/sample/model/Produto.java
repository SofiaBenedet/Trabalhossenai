package sample.model;

public class Produto {
    //ATRIBUTOS
    private String nome;
    private double preco;

    //GETTERS ANS SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    //ToString
    @Override
    public String toString() {
        return "Produto: " +
                nome +
                ", preço R$" + preco;
    }
}

