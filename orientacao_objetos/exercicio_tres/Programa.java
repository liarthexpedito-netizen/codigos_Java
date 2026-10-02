package exercicio_tres;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante aluno = new Estudante();

        System.out.println("A nota máxima para cada bimestre é: ");
        System.out.println("1ºB = 30.00, 2ºB = 35.00, 3ºB = 35.00 = 100.00");

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        aluno.nota_um = sc.nextDouble();
        System.out.print("Digite a primeira segunda: ");
        aluno.nota_dois = sc.nextDouble();
        System.out.print("Digite a primeira terceira: ");
        aluno.nota_tres = sc.nextDouble();

        if (aluno.nota_um > 30.00 || aluno.nota_dois > 35.00 || aluno.nota_tres > 35.00) {
            System.out.println("Erro! As notas não foram digitadas incorretamente.");
        } 

        System.out.printf("Nota final: %.2f %n", aluno.Nota_final());

        if (aluno.Nota_final() > 60.00) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno não foi aprovado!");
            double diferenca = 60.00 - aluno.Nota_final();
            System.out.println("Faltaram " + diferenca + " para alcançar a média (60.00)");
        }

        sc.close();
    }
}
