public class Questao3 {

    public static void main(String[] args) {
        
        char categoria = 'e';
        int qtd = 1;
        double precoFinal = 0;
        
        if(categoria == 'a'){
            precoFinal = 4*qtd;    
        }else if(categoria == 'b'){
            precoFinal = 4.5*qtd;
        }else if(categoria == 'c'){
            precoFinal = 2*qtd;
        }else if(categoria == 'd'){
            precoFinal = 2*qtd;
        }else{
            precoFinal = 1.5*qtd;
        }
        
        System.out.println("O preço do produto é R$" + precoFinal);
     
    }
}

