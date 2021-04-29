public class Questao1 {

    public static void main(String[] args) {
        
        double p1 = 10, p2 = 3;
        double media = (p1 + p2)/2;
        
        System.out.println("Média " + media);
        
        if(media >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Exame");
            
            double novaP = 7, novoMedia = (media+novaP)/2;
            System.out.println("Nova média " + novoMedia);
            
            if(novoMedia >= 6){
                System.out.println("Aprovado em Exame");
            }else{
                System.out.println("Reprovado");
            }
        }
        
    }
}