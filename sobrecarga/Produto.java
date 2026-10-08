package sobrecarga;

public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;

    public Produto() {}

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }   

}
