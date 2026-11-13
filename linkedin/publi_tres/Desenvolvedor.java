package linkedin.publi_tres;

enum Experiencia {
    JUNIOR,
    PLENO,
    SENIOR;
}

public final class Desenvolvedor extends Funcionario {

    public final Double BONUS_POR_PROJETO = 150.00;

    private Experiencia xp;

    public Desenvolvedor() {super();}

    public Desenvolvedor(String nome, Departamento departamento, Double valor_por_hora, Integer horas_trabalhadas, Experiencia xp) {
        super(nome, departamento, valor_por_hora, horas_trabalhadas);
        this.xp = xp;
    }

    public Experiencia getXp() {
        return xp;
    }

    public void setXp(Experiencia xp) {
        this.xp = xp;
    }

    @Override 
    public final double SalarioLiquido() {
        return super.SalarioLiquido() + BONUS_POR_PROJETO;
    }

}
