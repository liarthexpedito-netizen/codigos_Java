package composicao;

public class Departamento {

    private String nome_do_departamento;

    public Departamento() {}

    public Departamento(String nome) {
        this.nome_do_departamento = nome;
    }

    public String getNome() {
        return nome_do_departamento;
    }

    public void setNome(String nome) {
        this.nome_do_departamento = nome;
    }
    
}
