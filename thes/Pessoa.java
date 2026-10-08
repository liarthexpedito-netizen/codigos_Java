package thes;

public class Pessoa {
   
    public String nome;
    public int idade;

    public Pessoa() {
        //O this, nesta situação, é usado para fazer um construtor chamar outro construtor.
        this("Desconhecido", 0);
    }

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

    @Override 
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade;
    }

}
