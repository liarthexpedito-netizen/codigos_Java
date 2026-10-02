package exercicio_dois;

public class Funcionario {
    
    public String nome;
    public double salario_bruto;
    public double imposto;

    public Funcionario() {}

    public Funcionario(String nome, double salario_bruto, double imposto) {
        this.nome = nome;
        this.salario_bruto = salario_bruto;
        this.imposto = imposto;
    }

    public double Salario_liquido() {
        return salario_bruto -= imposto;
    }

    public void Aumento_salarial(double porcentagem) {
        salario_bruto += salario_bruto * porcentagem / 100.00;
    } 

    @Override 
    public String toString() {
        return "O funcionário " + nome + " recebe R$" + String.format("%.2f", Salario_liquido()) + "líquidos";
    }

    
}
