package sample.model;

//class Conta

public class Conta {

    //Atributos
    String agencia;
    String contaCorrente;
    double saldo;

    //Construtor
    public Conta(String agencia, String contaCorrente){
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
    }

    //Metodos
    public double consultarSaldo(){
        return this.saldo;
    }

    public String consultarExtrato(){
        return "Agência: " + agencia + "  Conta Corrente: " + contaCorrente + " Saldo: " + saldo;
    }
    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

}
