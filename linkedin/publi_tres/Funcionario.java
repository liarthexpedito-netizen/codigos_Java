package linkedin.publi_tres;

public class Funcionario {

    public final Double DESCONTO_VALE_ALIMENTACAO = 0.06;

    private String nome;
    private Departamento departamento;
    protected Double valor_por_hora;
    protected Integer horas_trabalhadas;

    public Funcionario() {}

    public Funcionario(String nome, Departamento departamento, Double valor_por_hora, Integer horas_trabalhadas) {
        setNome(nome);
        setDepartamento(departamento);
        setValor_por_hora(valor_por_hora);
        setHoras_trabalhadas(horas_trabalhadas);
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(Integer horas_trabalhadas) {
        if (horas_trabalhadas < 0) {
            throw new IllegalArgumentException("Valor por hora incorreto!");
        }
        this.horas_trabalhadas = horas_trabalhadas;
    }

    //Calcular o salário líquido
    public double SalarioLiquido() {
        double salario_bruto = valor_por_hora * horas_trabalhadas;
        return salario_bruto - (salario_bruto * DESCONTO_VALE_ALIMENTACAO);
    }

}

    

    