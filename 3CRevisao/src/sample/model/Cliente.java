package sample.model;

public class Cliente extends Pessoa{
    //ATRIBUTO
    private String email;

    //CONSTRUTORES
    public Cliente(String nome) {
        super(nome);
    }
    public Cliente(String nome, String cpf){
        super(nome, cpf);
    }


    public Cliente(String nome, String cpf, String email){
        super(nome, cpf);
        this.email = email;
    }

    //ToString
    @Override
    public void setEmail(String s) {

    }

}


