package heranca_polimorfismo;

public class Conta_cnpj extends Conta_cpf {

    private Double limite_de_emprestimo;

    public  Conta_cnpj () {super();}

    public Conta_cnpj(Integer numero_da_Conta, String titular, Double saldo, Double limite_de_emprestimo) {
        super(numero_da_Conta, titular, saldo); //Construtores da superclasse (Conta_cpf)
        this.limite_de_emprestimo = limite_de_emprestimo;
    }

    public Double getLimite_de_emprestimo() {
        return limite_de_emprestimo;
    }

    public void setLimite_de_emprestimo(Double limite_de_emprestimo) {
        this.limite_de_emprestimo = limite_de_emprestimo;
    }

    public void Emprestimo(Double quantia) {
        if (quantia <= limite_de_emprestimo) {
        saldo += quantia - 10.00; //protected no saldo
        }
    }

    @Override 
    public void Saque(double quantia) {
        super.Saque(quantia);
        saldo -= 2.0;
    }
    
}
