package construtores.validacao_de_argumentos;

/*
VALIDAÇÃO DE ARGUMENTOS:
O objetivo principal desta prática é garantir que um objeto nunca seja instanciado 
num estado inválido (por exemplo, um produto sem nome ou com preço negativo).
*/

public class Produto {
    
    public String nome;
    public Double preco;

    public Produto() {}

    public Produto(String nome, Double preco) {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }

        this.nome = nome;
        this.preco = preco;

    }

    public String toString() {
        return "Nome do produto: " + nome + " Preço: " + String.format("%.2f", preco);
    }

}
