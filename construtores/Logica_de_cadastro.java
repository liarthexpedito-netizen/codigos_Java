package construtores;

public class Logica_de_cadastro {

    public String nome;
    public String email;
    public int idade;

    //Contrutor padrão sem argumento/parâmetros
    public Logica_de_cadastro() {}

    //Contrutor com argumentos
    public Logica_de_cadastro(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    @Override 
    public String toString() {
        return "Nome: " + nome + 
               " Email: "+ email + 
               " Idade: " + idade;
    }

    
}
