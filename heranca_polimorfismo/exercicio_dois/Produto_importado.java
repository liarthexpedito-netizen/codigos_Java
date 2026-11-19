package heranca_polimorfismo.exercicio_dois;

public final class Produto_importado extends Produto {

    private Double taxa_alfandegaria;

    public Produto_importado() {super();}

    public Produto_importado(String nome, Double preco, Double taxa_alfandegaria) {
        super(nome, preco);
        this.taxa_alfandegaria = taxa_alfandegaria;
    }

    public Double getTaxa_alfandegaria() {
        return taxa_alfandegaria;
    }

    public void setTaxa_alfandegaria(Double taxa_alfandegaria) {
        this.taxa_alfandegaria = taxa_alfandegaria;
    }

    public Double Preco_total() {
        return preco + taxa_alfandegaria;
    }

    @Override 
    public String Precotag() {
        return getNome() + " R$" + String.format("%.2f", Preco_total()) + " Taxa alfândegaria: R$" + this.taxa_alfandegaria;
    }

}