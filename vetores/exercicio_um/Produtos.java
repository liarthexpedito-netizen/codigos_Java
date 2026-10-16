package vetores.exercicio_um;

public class Produtos {
    
    private String nome;
    private Double preco;

    public Produtos() {}

    public Produtos(String nome, Double preco) {
        setNome(nome);
        setPreco(preco);
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo o igual a zero");
        }
        this.preco = preco;
    }

}
