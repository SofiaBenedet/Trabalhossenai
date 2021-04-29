package sample;

import sample.model.Conta;

public class MainConta {


    public static void main(String[] args) {
        Conta conta1 = new Conta(5678, 123456);


        if (conta1.sacar(100)) {
            System.out.println("Sacou R$200,00 ");
        } else {
            System.out.println("Não tem limite");
        }
        System.out.println(conta1);

        conta1.depositar(300);
        //conta1.depositar(200);

        System.out.println(conta1);



    }
}