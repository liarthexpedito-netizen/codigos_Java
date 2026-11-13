package linkedin.publi_tres;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Quanto recebe por horas trabalhadas? - ");
        Double valor_por_hora = sc.nextDouble();
       
        System.out.print("É quantas horas trabalhadas? - ");
        Integer horas_trabalhadas = sc.nextInt();

        sc.nextLine();

        System.out.print("Nível de experiência (JUNIOR, PLENO, SENIOR)? - ");
        String xpStr = sc.nextLine().trim().toUpperCase();
        
        //UPCASTING: Funcionario <-- Desenvolvedor
        Funcionario empregado = new Desenvolvedor(nome, Departamento.valueOf(departamento), valor_por_hora, horas_trabalhadas, Experiencia.valueOf(xpStr));

        System.out.print("Salário do mês: ");
        System.out.println(empregado.SalarioLiquido());        


        sc.close();
    }
}
