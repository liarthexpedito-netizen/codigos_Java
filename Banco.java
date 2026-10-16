import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero_da_conta = sc.nextInt();

        sc.nextLine(); //Para consumir o Enter

        System.out.print("Digite o nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Deseja realizar um depósito inicial? (s/n): ");
        char escolha = sc.next().charAt(0);

        Sistema_bancario titular;

        if (escolha == 's' || escolha == 'S') {

            System.out.print("Digite a quantia que deseja depositar: ");
            double deposito_inicial = sc.nextDouble();
            titular = new Sistema_bancario(numero_da_conta, nome, deposito_inicial);

        } else {
            titular = new Sistema_bancario(numero_da_conta, nome);
        }
        
        System.out.println();
        System.out.println("Dados da conta: " + titular);
        System.out.println();
        System.out.print("Digite a quantia que deseja depositar: ");
        double valor_do_deposito = sc.nextDouble();
        titular.Deposito(valor_do_deposito);
        System.out.println("Saldo da conta atualizado: ");
        System.out.println(titular);

        System.out.println();
        System.out.println("Dados da conta: " + titular);
        System.out.println();
        System.out.print("Digite a quantia que deseja saquar: ");
        double valor_do_saque = sc.nextDouble();
        titular.Saque(valor_do_saque);
        System.out.println("Saldo da conta atualizado: ");
        System.out.println(titular);

        sc.close();
    }
}
