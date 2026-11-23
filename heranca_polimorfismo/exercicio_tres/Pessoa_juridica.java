package heranca_polimorfismo.exercicio_tres;

public class Pessoa_juridica extends Contribuinte {

    public final Double IMPOSTO_UM = 0.16;
    public final Double IMPOSTO_DOIS = 0.14;

    private Integer numero_de_funcionarios;

    public Pessoa_juridica() {super();}

    public Pessoa_juridica(String nome, Double renda_anual, Integer numero_de_funcionarios) {
        super(nome, renda_anual);
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    
    public Integer getNumero_de_funcionarios() {
        return numero_de_funcionarios;
    }

    public void setNumero_de_funcionarios(Integer numero_de_funcionarios) {
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    @Override 
    public Double Imposto() {

        if (getNumero_de_funcionarios() < 10) {
            return renda_anual * IMPOSTO_UM;
        } else {
            return renda_anual * IMPOSTO_DOIS;
        }

    }
}
