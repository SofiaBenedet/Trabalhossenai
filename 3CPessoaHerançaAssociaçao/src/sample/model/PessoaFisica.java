package sample.model;

/**Classe abstrata veículo */
public final class PessoaFisica extends Pessoa{
    /** Atributos */
    private String cpf;
    private String rg;

    /**Construtor da Classe ...*/
   public PessoaFisica(String nome){
       super(nome);
    }

    public PessoaFisica(String nome, Endereco endereco){
       super(nome, endereco);
    }

    //Getters and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()
                + " CPF: " + cpf
                + " RG: " + rg;
    }
}
