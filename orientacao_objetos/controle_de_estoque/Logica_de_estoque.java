package controle_de_estoque;

public class Logica_de_estoque {
    
    public String nome;
    public Double preco;
    public int quantidade;

    //Contrutor padrão
    public Logica_de_estoque() {}

    //Construtor com parâmetros
    public Logica_de_estoque(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double Valor_do_estoque() {
        return preco * quantidade;
    }

    public void Adicionar_produtos(int adicionar) {
        quantidade += adicionar;
        //quantidade = quantidade + adicionar
    }

    public void Remover_produto(int subtrair) {
        quantidade -= subtrair;
        //quantidade = quantidade - subtrair 
    }
   
    /*=======ANOTAÇÕES=========
    1 - void não tem return.
    
    */

}
