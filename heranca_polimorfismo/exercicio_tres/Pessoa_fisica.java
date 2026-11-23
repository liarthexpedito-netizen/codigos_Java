package heranca_polimorfismo.exercicio_tres;

public class Pessoa_fisica extends Contribuinte {

    public final Double IMPOSTO_PF_UM = 0.15;
    public final Double IMPOSTO_PF_DOIS = 0.25;
    public final Double SAUDE = 0.5;

    private Double gastos_com_saude;

    public Pessoa_fisica() {super();}

    public Pessoa_fisica(String nome, Double renda_anual, Double gastos_com_saude) {
        super(nome, renda_anual);
        this.gastos_com_saude = gastos_com_saude;
    }

    public Double getGastos_com_saude() {
        return gastos_com_saude;
    }

    public void setGastos_com_saude(Double gastos_com_saude) {
        this.gastos_com_saude = gastos_com_saude;
    }

    @Override 
    public Double Imposto() {

        if (getRenda_anual() < 20000.00) {
            return (getRenda_anual() * IMPOSTO_PF_UM) - (getGastos_com_saude() * SAUDE);
        } else {
            return (getRenda_anual() * IMPOSTO_PF_DOIS) - (getGastos_com_saude() * SAUDE);
        }
    
    }
    
}
