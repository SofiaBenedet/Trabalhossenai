public class Questao7 {
  
  public static void main(String[] args) {

    int i = 0;
    int num1 = 0;
    int num2 = 0;
    int total1 = 0;
    int total2 = 0;
    while(i < 10){
      i++;
      num1 = num1 + 2;
      num2 = num2 + 1;

      if(num2%2 != 0){
          System.out.println(num1 + "/" + num2);
          total1 = total1 + num1;
          total2 = total2 + num2;
      }
      else{
        System.out.println("-" + num1 + "/" + num2);
        total1 = total1 - num1;
        total2 = total2 + num2;
      }
    }
    System.out.println("O valor de S é: " + total1 + "/" + total2 + "!");
  }

}
