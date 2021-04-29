public class Questao4 {

    public static void main(String[] args) {
        
        double valor = 1000;
        char categoria = 'd';
        
        if(categoria == 'a'){
            double desconto = valor*0.1;
            double valorFinal = valor - desconto;
            System.out.println("Desconto de 10% e o valor final é R$" + valorFinal);
        }if(categoria == 'b'){
            double desconto = valor*0.15;
            double valorFinal = valor - desconto;
            System.out.println("Desconto de 15% e o valor final é R$" + valorFinal);
        }
        if(categoria == 'c'){
            double desconto = valor*0.2;
            double valorFinal = valor - desconto;
            System.out.println("Desconto de 20% e o valor final é R$" + valorFinal);
        }else{
            double acrescimo = valor*0.05;
            double valorFinal = valor + acrescimo;
            System.out.println("Acréscimo de 5% e o valor final é R$" + valorFinal);
        }
    }
}