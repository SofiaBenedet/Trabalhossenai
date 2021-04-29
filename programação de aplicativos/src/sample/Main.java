package sample;

import java.util.Scanner;
import sample.model.ex1;


public class Main{
    public Main() {

    }


    public static void main(String[] args) {

            Scanner leitura = new Scanner(System.in);
            ex1 e = new ex1();
            ex1 e2 = new ex1();
            System.out.println("Digite o nome da primeira pessoa: ");
            e.nome = leitura.nextLine();
            System.out.println("Digite o nome da segunda pessoa: ");
            e2.nome = leitura.nextLine();
            System.out.println("Digite a idade de " + e.nome);
            e.idade = leitura.nextInt();
            System.out.println("Digite a idade de " + e2.nome);
            e2.idade = leitura.nextInt();
            System.out.println("Dados da Primeira pessoa:\n" + e.imprimir());
            System.out.println("Dados da Segunda pessoa:\n" + e2.imprimir());
            if (e.idade > e2.idade) {
                System.out.println("Pessoa mais velha: " + e.nome);
            } else if (e.idade == e2.idade) {
                System.out.println("As idades são iguais");
            } else {
                System.out.println("Pessoa mais velha: " + e2.nome);
            }

        }
    }


