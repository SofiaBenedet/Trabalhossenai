package sample.model;

/**Classe abstrata veículo */
public final class PessoaJuridica extends Pessoa{

    String cnpj;
    String ie;

    /**Construtor da Classe ...*/
    public PessoaJuridica(String nome, String cnpj, String ie) {
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }
    public PessoaJuridica(String nome) {
        super(nome);
    }

    //Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    //ToString
    @Override
    public String toString() {
        return "---Pessoa Juridica---\n" + super.toString() + "Cnpj: " + cnpj + ", ie: " + ie;
    }
}

