package linkedin.publi_dois;

import java.util.Locale;
import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.println("Quantos alunos deseja registrar? ");
       int n = sc.nextInt();
       Sistema_de_notas[] vetor = new Sistema_de_notas[n];

       sc.nextLine();

       for (int i = 0; i < vetor.length; i++) {

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Nota #1: ");
            double nota_um = sc.nextDouble();
            System.out.print("Nota #2: ");
            double nota_dois = sc.nextDouble();
            System.out.print("Nota #3: ");
            double nota_tres= sc.nextDouble();

            sc.nextLine();

            vetor[i] = new Sistema_de_notas(nome, nota_um, nota_dois, nota_tres);

       }

       for (int i = 0; i < vetor.length; i++) {
            double media = vetor[i].Aprovado();
            System.out.println("Aluno: " + vetor[i].getNome() + " - Média: " + media);
       }

        sc.close();
    }
    
}
