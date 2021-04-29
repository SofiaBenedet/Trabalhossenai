package sample;


import sample.model.Conta;

public class Main {


    public static void main(String[] args) {

        int numeroConta = 202030;
        String nomeTitular = "Sofia Benedet Brandl";
        char temDeposito = 's';
        double valor = 0.0;

        if (temDeposito == 's') {
            valor = 500.00;
        }

        Conta sofia = new Conta(numeroConta,nomeTitular,valor);
        System.out.println("Dados da Conta:");

        sofia.imprimir();

        sofia.deposito(200);
        System.out.println("Dados da Conta Atualizado:");
        sofia.imprimir();

        sofia.saque(300);
        System.out.println("Dados da Conta Atualizado:");
        sofia.imprimir();


        }
    }

