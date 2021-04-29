public class HelloWorld {

    public static void main(String[] args) {
        
        int n = 5, aux = 0, resSoma = 0;
        for(int i=1; i<=20; i++, n+=5){
           
           if(i%2 == 1){//se é impar
               aux = n;
           }else{//se é par
               aux = (-1)*n;
           }
           resSoma += aux;
           System.out.println(aux);
        }
        System.out.println("Resultado da Soma é "+resSoma);
    }
}
