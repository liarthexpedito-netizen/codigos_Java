package linkedin;

public class Sistema_de_notas {
    
    private String nome;
    private double nota_um;
    private double nota_dois;
    private double nota_tres;

    public Sistema_de_notas() {}

    public Sistema_de_notas(String nome, double nota_um, double nota_dois, double nota_tres) {
        this.nome = nome;
        this.nota_um = nota_um;
        this.nota_dois = nota_dois;
        this.nota_tres = nota_tres;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota_um() {
        return nota_um;
    }
    public void setNota_um(double nota_um) {
        this.nota_um = nota_um;
    }
    public double getNota_dois() {
        return nota_dois;
    }
    public void setNota_dois(double nota_dois) {
        this.nota_dois = nota_dois;
    }
    public double getNota_tres() {
        return nota_tres;
    }
    public void setNota_tres(double nota_tres) {
        this.nota_tres = nota_tres;
    }

    public double Aprovado() {
        return (this.nota_um + this.nota_dois + this.nota_tres) / 3.00;
    }
    
}
