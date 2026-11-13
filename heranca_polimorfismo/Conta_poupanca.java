package heranca_polimorfismo;

//'final' evita que sejam criadas subclasses de Conta_poupanca
public final class Conta_poupanca extends Conta_cpf {

    private Double taxa_de_juros;

    public Conta_poupanca() {super();}

    public Conta_poupanca(Integer numero_da_Conta, String titular, Double saldo, Double taxa_de_juros) {
        super(numero_da_Conta, titular, saldo);
        this.taxa_de_juros = taxa_de_juros;
    }

    public Double getTaxa_de_juros() {
        return taxa_de_juros;
    }

    public void setTaxa_de_juros(Double taxa_de_juros) {
        this.taxa_de_juros = taxa_de_juros;
    }

    public void AtualizarSaldo() {
        saldo += saldo * taxa_de_juros;
    }

    //Sobreposição/sobrescrita
    //'final' evita que o método 'Saque' seja sobreposto
    @Override 
    public final void Saque(double quantia) {
        saldo -= quantia;
    }
}
