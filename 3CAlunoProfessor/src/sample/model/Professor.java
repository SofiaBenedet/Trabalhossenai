package sample.model;

public final class Professor extends Pessoa{

    double horasTrabalhadas;
    double valorHora;
    double salario;

    //CONSTRUTORES
    public Professor(String nome, double horas, double preco) {
        super(nome);
        this.horasTrabalhadas = horas;
        this.valorHora = preco;
        this.setSalario(this.horasTrabalhadas, this.valorHora);
    }

    public Professor() {};

    //GETTERS AND SETTERS
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double horas, double valor) {
        this.horasTrabalhadas = horas;
        this.valorHora = valor;
        this.salario = horas * valor;
    }
    //ToString
    @Override
    public String toString() {
        return "Professor: " + super.toString() + "\nhorasTrabalhadas: " + horasTrabalhadas +
                ", valorHora: " + valorHora +
                ", salario: " + salario;
    }


}
