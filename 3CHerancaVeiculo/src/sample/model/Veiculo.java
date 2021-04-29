package sample.model;

   /**Classe abstrata veículo */
    public abstract class Veiculo {
        /** Atributos */
        private String nome;
        private Marca marca;
        private String desc;

        /**Construtor da Classe ...*/
        public Veiculo(String nome) { this.nome = nome; }
        public Veiculo(String nome, String desc){
            this.nome = nome;
            this.desc = desc;
        }
        public Veiculo() {

        }

        //Getteres e setters
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public Marca getMarca() {
            return marca;
        }
        public void setMarca(String nome, String descricao) {
            Marca marca = new Marca();
            marca.setNome(nome);
            marca.setDesc(descricao);
            this.marca = marca;
        }

        public void setMarca(Marca marca){
            this.marca = marca;
        }

        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }

        /** ToString da classe ...*/
        @Override
        public String toString() {
            return nome + ", " + marca
            +((desc == null)? "": desc + "\n");

        }
    }

