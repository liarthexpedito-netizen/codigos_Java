package heranca_polimorfismo.exercicio_um;

public class Funcionarios {
    
    private String nome;
    private Integer horas_trabalhadas;
    private Double valor_por_hora;

    public Funcionarios() {}

    public Funcionarios(String nome, Integer horas_trabalhadas, Double valor_por_hora) {
        setNome(nome);
        setHoras_trabalhadas(horas_trabalhadas);
        setValor_por_hora(valor_por_hora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public Integer getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(Integer horas_trabalhadas) {
        if (horas_trabalhadas < 0) {
            throw new IllegalArgumentException("Horas trabalhadas incorreto!");
        }
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public Double getValor_por_hora() {
        return valor_por_hora;
    }

    public void setValor_por_hora(Double valor_por_hora) {
        if (valor_por_hora < 0) {
            throw new IllegalArgumentException("Valor por hora incorreto!");
        }
        this.valor_por_hora = valor_por_hora;
    }
    
    public Double Salario() {
        return horas_trabalhadas * valor_por_hora;
    }

}
