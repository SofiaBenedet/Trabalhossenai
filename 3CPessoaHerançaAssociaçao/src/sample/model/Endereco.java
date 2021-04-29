package sample.model;

public class Endereco {
    /** Atributos */
  private String rua;
  private int numero;
  private String bairro;
  private String cep;

  //Getters e setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    //toString
    public String toString(){
        return "Endereço:" + rua
                + ", Nº. " + numero
                + ", Bairro: " + bairro
                + ", CEP: " + cep;
    }
}


