package sample.model;

/**Classe abstrata veículo */
public abstract class Pessoa {
    /** Atributos */
    private String nome;
    private Endereco endereco;

    /**Construtor da Classe ...*/

    public Pessoa (String nome){
        this.nome = nome;
        this.endereco = new Endereco();
    }

    public Pessoa (String nome, Endereco endereco){
      this.nome = nome;
      this.endereco = endereco;
    }
    //Getters and Setters
    public String getNome() { return nome; }
        public void setNome (String nome) { this.nome = nome; }
        public Endereco getEndereco (){
            return endereco;
        }

        public void setEndereco(Endereco endereco){
        this.endereco = endereco;

        }

        public void setEndereco(
                String rua, int numero,
                String bairro,
                String cep ){
            this.endereco.setRua(rua);
            this.endereco.setNumero(numero);
            this.endereco.setBairro(bairro);
            this.endereco.setCep(cep);
        }
        public String toString(){return "Nome: " + nome + endereco + "\n";}
        }
    
