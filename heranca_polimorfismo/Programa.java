package heranca_polimorfismo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta_cpf cpf = new Conta_cpf(1001, "Alex", 0.0);
        Conta_cnpj cnpj = new Conta_cnpj(1002, "Maria", 0.0, 200.00);

        //UPCASTING
        
        Conta_cpf conversao1 = cnpj;
        Conta_cpf conversao2 = new Conta_cnpj(1003, "Bob", 0.0, 200.00); //Mesma situação do exemplo anterior
        Conta_cpf conversao3 = new Conta_poupanca(1004, "Anna", 0.0, 200.00);

        //DOWNCASTING

        //Para dar certo e necessário uma conversão explícita (Conta_cnpj)
        Conta_cnpj conversao4 = (Conta_cnpj)conversao2;
        conversao4.Emprestimo(100.00);

        //Conta_cnpj conversao5 = (Conta_cnpj)conversao3; //Erro! De filho para filho
        //Solução: usamos 'instanceof' para testar o tipo do objeto antes de fazer o cast
        if (conversao3 instanceof Conta_cnpj) {
            Conta_cnpj conversao5 = (Conta_cnpj)conversao3;
            conversao5.Emprestimo(100.00);
            System.out.println("Empréstimo realizado!");
        }

        if (conversao3 instanceof Conta_poupanca) {
            Conta_poupanca conversao5 = (Conta_poupanca)conversao3;
            conversao5.AtualizarSaldo();
            System.out.println("Saldo atualizado!");
        }

        //Apenas para o programa para de alertar
        System.out.println(cpf);
        System.out.println(conversao1);

        sc.close();
    }
}
