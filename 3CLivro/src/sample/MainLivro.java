package sample;

import sample.model.Livro;

public class MainLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setTitulo("Senhor dos Aneis");
        livro.setAutor("J. R. R. Tolkien");
        livro.setEditora("HarperCollins Brasil");
        livro.setAno(2019);

        System.out.println(livro);


    }

}

