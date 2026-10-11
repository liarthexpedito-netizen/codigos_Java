package encapsulamento;

public class Produto {
    
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto() {}

    public Produto(String nome, Double preco, int quantidade) {

        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade); 
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {

        if (preco == null || preco <= 0 ) {
            throw new IllegalArgumentException("O preço não pode ser menor ou igual que zero");
        }

        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade < 0) {
            throw new IllegalArgumentException("O estoque não pode ser menor que zero");
        }

        this.quantidade = quantidade;
    }

    public String toString() {
        return "Nome do produto: " + nome + String.format(" Preço do produto: %.2f", preco) + " Quantidade em estoque: " + quantidade;
    }

}
