package linkedin.publi_dois;

public class Sistema_de_notas {
    
    private String nome;
    private double nota_um;
    private double nota_dois;
    private double nota_tres;

    public Sistema_de_notas() {}

    public Sistema_de_notas(String nome, double nota_um, double nota_dois, double nota_tres) {
        setNome(nome);
        setNota_um(nota_um);
        setNota_dois(nota_dois);
        setNota_tres(nota_tres);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }

    public double getNota_um() {
        return nota_um;
    }

    public void setNota_um(double nota_um) {
        if (nota_um < 0.0 || nota_um > 10.0) {
            throw new IllegalArgumentException("A nota #1 deve estar entre 0.0 e 10.0!");
        }
        this.nota_um = nota_um;
    }

    public double getNota_dois() {
        return nota_dois;
    }

   public void setNota_dois(double nota_dois) {
        if (nota_dois < 0.0 || nota_dois > 10.0) {
            throw new IllegalArgumentException("A nota #2 deve estar entre 0.0 e 10.0!");
        }   
        this.nota_dois = nota_dois;
    }

    public double getNota_tres() {
        return nota_tres;
    }

    public void setNota_tres(double nota_tres) {
        if (nota_tres < 0.0 || nota_tres > 10.0) {
            throw new IllegalArgumentException("A nota #3 deve estar entre 0.0 e 10.0!");
        }
        this.nota_tres = nota_tres;
    }
   
    public double Aprovado() {
        return (this.nota_um + this.nota_dois + this.nota_tres) / 3.00;
    }
    
}
