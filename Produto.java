public class Produto {

    public static final double ICMS_CE = 0.2; 

    private String nome;
    private Double preco;
    private int quantidade;

    public Produto() {}

    public Produto(String nome, Double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public static double Soma(double preco, int quantidade) {
        return (preco * quantidade ) + (preco * quantidade) * ICMS_CE;
    }

    public static double Imposto(double preco, int quantidade) {
        return (preco * quantidade) * ICMS_CE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco == null || preco <= 0.0) {
            throw new IllegalArgumentException("O preço inválido!");
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade de produtos inválida!");
        }
        this.quantidade = quantidade;
    }

}
