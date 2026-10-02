package exercicio_tres;

public class Estudante {
   
    public String nome;
    public double nota_um;
    public double nota_dois;
    public double nota_tres;

    public Estudante() {}

    public Estudante(String nome, double nota_um, double nota_dois, double nota_tres) {
        this.nome = nome;
        this.nota_um = nota_um;
        this.nota_dois = nota_dois;
        this.nota_tres = nota_tres;
    }

    public Double Nota_final() {
        return nota_um + nota_dois + nota_tres;
    }

}
