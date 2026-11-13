package linkedin.publi_tres;

public class Administracao extends Funcionario {

    public Administracao() {super();}

    public Administracao(String nome, Departamento departamento, Double valor_por_hora, Integer horas_trabalhadas) {
        super(nome, departamento, valor_por_hora, horas_trabalhadas);
    }
    
}
