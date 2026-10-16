package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Altura_media {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //'n' para definir o tamanho do vetor
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        //Criando um vetor
        double[] vetor = new double[n];

        //'for' para viajar pelo vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a " + (i + 1) + "º altura: ");
            vetor[i] = sc.nextDouble();
        }

        //Medindo a média das alturas
        double soma = 0.0;

        //'for' para viajar pela vetor buscando seus valores
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }

        double resultado = soma / n;

        System.out.printf("A média das alturas é %.2f", resultado);

        sc.close();
    }
}