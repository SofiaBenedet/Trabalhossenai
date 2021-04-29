package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Corsa", "Fiesta", 2);
        carro.setMarca("Ford", "A empresa....");
        carro.setDesc("Carro do prof");
        carro.setnPortas(4);

        System.out.println(carro + "\n\n");

        Carro carro2 = new Carro("Corsa", "Fiesta", 2);
        carro2.setMarca("Fiat","A empresa....");
        carro2.setnPortas(4);
        System.out.println(carro2 + "\n\n");

        Caminhao caminhao = new Caminhao("5460");
        caminhao.setMarca("Scania", "A empresa.....");
        caminhao.setnEixos(6);
        System.out.println(caminhao + "\n\n");

        Carro carro3 = new Carro("Corsa", "Meu corsinha", 2);
        carro3.setMarca("Chevrolet", "minha fábrica");
        System.out.println(carro3);
    }
}
