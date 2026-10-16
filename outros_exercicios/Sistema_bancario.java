package outros_exercicios;
public class Sistema_bancario {

    private int numero_da_conta;
    private String nome_do_titular;
    private Double saldo;

    public Sistema_bancario() {}

    public Sistema_bancario(int numero_da_conta, String nome_do_titular) {

        this.numero_da_conta = numero_da_conta;
        setNome_do_titular(nome_do_titular);

    }

    public Sistema_bancario(int numero_da_conta, String nome_do_titular, Double quantia_inicial) {
        this.numero_da_conta = numero_da_conta;
        setNome_do_titular(nome_do_titular);
        Deposito(quantia_inicial);
    }


    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public String getNome_do_titular() {
        return nome_do_titular;
    }

    public void setNome_do_titular(String nome_do_titular) {

        if (nome_do_titular == null || nome_do_titular. isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome_do_titular = nome_do_titular;
    }

    public Double getSaldo() {
        return saldo;
    }

   public void Deposito(Double quantia) {
        saldo += quantia;
   }

   public void Saque(Double quantia) {
        saldo -= quantia + 5.0;
   }

   public String toString() {
        return nome_do_titular + nome_do_titular + saldo;
   }

}
