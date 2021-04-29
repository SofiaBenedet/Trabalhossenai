package sample;

import java.util.Scanner;
import sample.model.ex2;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ex2 e = new ex2();
        ex2 e2 = new ex2();
        System.out.println("Nome do primeiro funcionário: ");
        e.nome = leitura.nextLine();
        System.out.println("Nome do segundo funcionário: ");
        e2.nome = leitura.nextLine();
        System.out.println("Salário de " + e.nome);
        e.salario = leitura.nextDouble();
        System.out.println("Salário de " + e2.nome);
        e2.salario = leitura.nextDouble();
        double media = (e.salario + e2.salario) / 2.0D;
        System.out.println("Dados do primeiro funcionário:");
        System.out.println(e.imprimir());
        System.out.println("Dados do segundo funcionário:");
        System.out.println(e2.imprimir());
        System.out.println("Salário médio = " + media);




    }
}
