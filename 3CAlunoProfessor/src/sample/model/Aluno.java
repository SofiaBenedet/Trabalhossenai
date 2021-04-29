package sample.model;

public final class Aluno extends Pessoa {

 double nota1;
 double nota2;
 double media;
        //CONSTRUTORES
        public Aluno(String nome, double nota1, double nota2) {
            super(nome);
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.setMedia(nota1, nota2);
        }
         //GETTERS AND SETTERS
        public Aluno() {}

        public double getNota1() {
            return nota1;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public double getMedia() {
            return media;
        }

        public void setMedia(double nota1, double nota2) {
            this.media = (nota1 + nota2)/2;
        }

        //ToString
        @Override
        public String toString() {
            return "Aluno: " + super.toString() + "\n" +
                    "nota1: " + nota1 +
                    ", nota2: " + nota2 +
                    ", media: " + media;
        }
    }

