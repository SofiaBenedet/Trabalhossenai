package sample;
import java.util.Scanner;
public class exercicio2 {

    public static double divisao(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o valor de a e b, ele sera dividido por b: ");
        double div = divisao(valores.nextDouble(), valores.nextDouble());
        System.out.println("Resultado da divisao: "+div);


    }
}