package sample.model;

public class Pessoa {
    String nome;
    //GETTERS AND SETTERS
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //ToString
    @Override
    public String toString() {
        return nome;
    }
}
