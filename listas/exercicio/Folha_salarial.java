package listas.exercicio;

public class Folha_salarial {
    
    private Integer id;
    private String nome;
    private Double salario;

    public Folha_salarial() {}

    public Folha_salarial(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void Aumento_salarial(double porcentagem) {
        salario += salario * porcentagem / 100.00;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }

}
