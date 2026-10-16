package vetores.exercicio_tres;

import java.util.Locale;
import java.util.Scanner;

public class Contador_de_idade {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        int[] vetor_idade = new int[n];

        //Utilizamos o 'for' tradicional para pecorrer quando precisamos dos índice.
        for (int i = 0; i < vetor_idade.length; i++) {
            System.out.print("Digite a " + (i + 1) + "º idade: ");
            vetor_idade[i] = sc.nextInt();
        }

        //Utilizamos o 'for-each' quando precisamos apenas do valores.
        System.out.println("As idades inseridas foram: ");
        for (int pecorrer : vetor_idade) {
            System.out.print(pecorrer + " ");
        }

        int contador = 0;

        for (int i = 0; i < vetor_idade.length; i++) {
            if (vetor_idade[i] >= 18) {
                contador++;
            } 
        }

        System.out.println();

        System.out.println("Há " + contador + " pessoa(s) maior(es) de idade.");

        sc.close();
    }
}