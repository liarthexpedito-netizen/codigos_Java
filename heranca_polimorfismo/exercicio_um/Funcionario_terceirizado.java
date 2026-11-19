package heranca_polimorfismo.exercicio_um;

public class Funcionario_terceirizado extends Funcionarios {

    public final Double BONUS = 1.1; //Bônus de 110%
    
    private Double valor_adicional;

    public  Funcionario_terceirizado() {super();}

    public Funcionario_terceirizado(String nome, Integer horas_trabalhadas, Double valor_por_hora, Double valor_adicional) {
        super(nome, horas_trabalhadas, valor_por_hora);
        this.valor_adicional = valor_adicional;
    }

    public Double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(Double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }   

    //SOBREPOSIÇÃO DE MÉTODO
    @Override 
    public Double Salario() {
        double despesa_adicional = this.valor_adicional * BONUS;
        return super.Salario() + despesa_adicional;
    }

}
