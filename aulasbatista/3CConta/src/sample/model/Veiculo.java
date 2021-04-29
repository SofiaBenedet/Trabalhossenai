package sample.model;

//classe veículo
public class Veiculo {

    //atributos
    int velocidade;
    String placa;

    //Construtor
    //placa é o parâmetro do método construtor
    public Veiculo(String placa){
        this.placa = placa;
        this.velocidade = 0;
    }

    //métodos
    public String consultarPlaca(){
        return this.placa;
    }

    public int acelerar(int valor){
        return this.velocidade += valor;
    }

    public int frear(int valor){
        if (this.velocidade > 0){
            this.velocidade -= valor;
            //this.velocidade = this.velocidade - valor
            if (this.velocidade < 0) {this.velocidade = 0;}
        }
        return this.velocidade;
    }

    public int consultarVelocidade(){
        return this.velocidade;
    }

}
