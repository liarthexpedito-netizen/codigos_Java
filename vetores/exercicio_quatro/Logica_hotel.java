package vetores.exercicio_quatro;

public class Logica_hotel {

    private String nome;
    private String email;
    
    public Logica_hotel() {}

    public Logica_hotel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + email;
    }
    
}
