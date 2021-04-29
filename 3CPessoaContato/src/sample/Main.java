package sample;

import sample.model.Pessoa;

import sample.model.Pessoa;

public class Main {

    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("Marcelina");
       pessoa.setContato("89-999-11111", "email@email", "não tenho");
       System.out.println(pessoa);
    }
}