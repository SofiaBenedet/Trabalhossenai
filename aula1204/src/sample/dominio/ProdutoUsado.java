package sample.dominio;

public class ProdutoUsado extends Produto{
    private String dataFabricacao;

    public ProdutoUsado() { }
    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;

    }

    @Override
    public String imprimir() {
        return getNome()+"(usado), R$ " + getPreco()
                + "(data de fabricação: "+getDataFabricacao()+")";
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
