package sample.model;

/** Classe Marca */
public class Marca {
    /** Atributos */
    private String nome;
    private String desc;

    /**
     * Getters and setters
     */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * ToString
     */
    @Override
    public String toString(){
        return "Marca: " + nome
                +  ((desc == null) ? "" : desc + "\n");
    }
}

