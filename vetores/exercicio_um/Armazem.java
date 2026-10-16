package vetores.exercicio_um;

import java.util.Locale;
import java.util.Scanner;

public class Armazem {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos deseja inserir: ");
        int n = sc.nextInt();
        Produtos[] vetor = new Produtos[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            Double preco = sc.nextDouble();
            vetor[i] = new Produtos(nome, preco);
        }
        
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("A média do preço dos produtos é: %.2f", media);


        sc.close();
    }
}
