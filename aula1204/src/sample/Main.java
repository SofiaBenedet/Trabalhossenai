package sample;

import sample.dominio.Produto;
import sample.dominio.ProdutoImportado;
import sample.dominio.ProdutoUsado;

public class Main {

    public static void main(String[] args) {

        Produto p = new Produto("Notebook", 1100);
        System.out.println(p.imprimir());

        ProdutoImportado pi= new ProdutoImportado("Tablet", 260, 20);
        System.out.println(pi.imprimir());

        ProdutoUsado pu = new ProdutoUsado("Iphone",400,"01/01/2008");
        System.out.println(pu.imprimir());


    }
}
