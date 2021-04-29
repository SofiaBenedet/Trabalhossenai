package sample;


import sample.model.Receita;

public class MainReceita {


        public static void main(String[]args){
            Receita receita = new Receita();
            receita.setNome("Bolo da Marcia");
            receita.setDescricao("Foi a Laura que fez");
            receita.setIngrediente("Farinha", 300, "g");
            receita.setIngrediente("outros", 200, "g");
            System.out.println(receita);

        }
    }

