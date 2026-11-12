package composicao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String nome_do_departamento = sc.nextLine();
        System.out.println("Entre com os dados do funcionário: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Experiência: ");
        String nivel_do_trabalhador = sc.nextLine();
        System.out.print("Base salarial: ");
        Double salario_base = sc.nextDouble();

        Funcionario empregado = new Funcionario(nome, Experiencia.valueOf(nivel_do_trabalhador), salario_base, new Departamento(nome_do_departamento));

        System.out.print("Quantos contratos o trabalhador possui? ");
        int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            
            System.out.print("Data (DD/MM/AAAA): ");
            // Lê a string digitada e converte diretamente para LocalDate usando o formatador
            LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
            
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();

            // Instancia o contrato usando o LocalDate moderno
            Contrato_por_hora contrato = new Contrato_por_hora(dataContrato, valorPorHora, horas);
            empregado.Adicionando_contrato(contrato);

        }

        System.out.println();
        System.out.print("Entre o mês e ano para calcular o salário (MM/YYYY): ");
        String mes_e_ano = sc.next();
        int mes = Integer.parseInt(mes_e_ano.substring(0, 2));
        int ano = Integer.parseInt(mes_e_ano.substring(3));

        IO.println("Nome: " + empregado.getNome());
        IO.println("Departamento: " + empregado.getDepartamento().getNome());
        IO.println("Ganho para " + mes_e_ano + ": " + String.format("%.2f", empregado.renda(mes, ano)));

        sc.close();
    }
}
