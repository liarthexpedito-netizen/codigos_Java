package heranca_polimorfismo;

public class Conta_cpf {
    
    private Integer numero_da_conta;
    private String titular;
    protected Double saldo;

    public Conta_cpf() {}

    public Conta_cpf(Integer numero_da_Conta, String titular, Double saldo) {
        this.numero_da_conta = numero_da_Conta;
        this.titular = titular;
        setSaldo(saldo);
    }

    public Integer getNumero_da_Conta() {
        return numero_da_conta;
    }

    public void setNumero_da_Conta(Integer numero_da_Conta) {
        this.numero_da_conta = numero_da_Conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo < 0 ) {
            throw new IllegalArgumentException("O saldo não pode ser nagativo");
        }
        this.saldo = saldo;
    }

    //Sacar dinheiro
    public void Saque(double quantia) {
        saldo -= quantia + 5.0;
    }

    //Depositar dinheiro
    public void Deposito(double quantia) {
        saldo += quantia;
    }

    @Override
    public String toString() {
        return "Numero_da_conta = " + numero_da_conta + ", Titular = " + titular + ", Saldo = " + saldo;
    }

}
