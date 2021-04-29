package sample.dominio;

public class ProdutoImportado extends Produto {

    private double taxa;

    public ProdutoImportado(){ }
    public ProdutoImportado(String nome, double preco,double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }
    @Override
    public String imprimir(){
        return getNome() + ", R$ " + totalPreco()
        + " (taxa aduaneira: R$"+getTaxa()+")";
    }

    public double totalPreco(){
        return getPreco() + getTaxa();
    }
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}