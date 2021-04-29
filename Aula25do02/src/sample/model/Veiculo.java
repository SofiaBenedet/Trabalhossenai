package sample.model;

    public class Veiculo {

        //Atributos
        int velocidade;
        String placa;

        //Construtor
        public Veiculo(String placa) {
            this.placa = placa;
            this.velocidade = 0;
        }

        //Metodos
        public String consultarPlaca(){
            return placa;
        }

        public int acelerar(int valor){
            return this.velocidade += valor;
        }

        public int frear(int valor){
            if (this.velocidade > 0){
                this.velocidade -= valor;
                //this.velocidade - valor
                if (this.velocidade < 0) this.velocidade = 0;
            }
            return this.velocidade;
        }

        public int consultarVelocidade(){
            return this.velocidade;
        }
    }
