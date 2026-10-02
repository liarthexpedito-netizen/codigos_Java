package exercicio_dois;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario empregado = new Funcionario();

        System.out.println("Digite os dados do funcionário: ");

        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        empregado.salario_bruto = sc.nextDouble();
        System.out.print("Taxa de imposto: ");
        empregado.imposto = sc.nextDouble();

        System.out.println(empregado);

        System.out.print("Qual é a porcentagem de aumento salarial? ");
        Double n = sc.nextDouble();
        empregado.Aumento_salarial(n);

        sc.close();
    }
}
