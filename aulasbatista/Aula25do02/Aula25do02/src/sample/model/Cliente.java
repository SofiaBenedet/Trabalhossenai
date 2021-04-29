package sample.model;

public class Cliente {

    //Atributos
    String nome;
    String email;
    String telefone;
    int idade;

    //Metodo
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(String telefone){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(int idade){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return "Cliente: " + nome + ", email: " + email + ", telefone: " + telefone + ", idade: " + idade;
    }

}
