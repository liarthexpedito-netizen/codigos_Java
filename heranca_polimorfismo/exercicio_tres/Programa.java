package heranca_polimorfismo.exercicio_tres;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de contribuintes: ");
        int n = sc.nextInt();

        List <Contribuinte> lista = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("Pessoa física ou jurídica? (f/j) - ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double renda_anual = sc.nextDouble();

            if (resposta == 'j' || resposta == 'J') {
                System.out.print("Quantos funcionários a empresa possui? - ");
                int numero_de_funcionarios = sc.nextInt();
                lista.add(new Pessoa_juridica(nome, renda_anual, numero_de_funcionarios));
            } else {
                System.out.print("Despesas com saúde: ");
                double gastos_com_saude = sc.nextDouble();
                lista.add(new Pessoa_fisica(nome, renda_anual, gastos_com_saude));
            }
        }

        double soma = 0.0;

        System.out.println();

        System.out.println("IMPOSTOS PAGOS:");
        for (Contribuinte c : lista) {
            System.out.println(c.getNome() + ": R$ "+ String.format("%.2f", c.Imposto()));
            soma += c.Imposto();
        }

        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS ARRECADADOS: " + String.format("%.2f", soma));



        sc.close();
    }
}
