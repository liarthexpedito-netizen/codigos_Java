package encapsulamento.imutabilidade;

public final class Pessoa {

    private final String nome;
    private final int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
     
    // Getters para permitir a leitura dos atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() { // Note: o tipo de retorno deve ser int
        return idade;
    }


    
}
