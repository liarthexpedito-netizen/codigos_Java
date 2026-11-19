package heranca_polimorfismo.exercicio_um;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Funcionarios> lista = new ArrayList<>();

        System.out.print("Entre com o número de funcionários que deseja cadastrar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Funcionário #" + i);
            System.out.print("O funcionário é terceirizado? (s/n) - ");
            char resposta = sc.next().charAt(0);

            System.out.print("Nome do funcionário: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Quantas horas esse funcionário trabalha? - ");
            int horas_trabalhadas = sc.nextInt();
            System.out.print("Quanto ele recebe por hora? - ");
            Double valor_por_hora = sc.nextDouble();

            if (resposta == 's' || resposta == 'S') {
                System.out.print("Valor adiconal ao funcionário terceirizado: ");
                Double valor_adicional = sc.nextDouble();
                lista.add(new Funcionario_terceirizado(nome, horas_trabalhadas, valor_por_hora, valor_adicional));
            } else {
                lista.add(new Funcionarios(nome, horas_trabalhadas, valor_por_hora));
            }

        }

        System.out.println();
            System.out.println("Pagamentos: ");
            for (Funcionarios buscar : lista) {
                System.out.println(buscar.getNome() + " - $ " + String.format("%.2f", buscar.Salario()));
            }

        sc.close();
    }
}
