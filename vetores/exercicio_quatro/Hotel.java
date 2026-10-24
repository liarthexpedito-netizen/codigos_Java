package vetores.exercicio_quatro;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando um hotel com 10 quartos (índices de 0 a 9)
        Logica_hotel[] vetor = new Logica_hotel[10];

        System.out.print("Quantos quartos serão alugados? "); // ou System.out.print
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Limpa o buffer do teclado

            System.out.println("\nDigite os dados do " + (i + 1) + "º hóspede:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            int quarto;

            // Validação: repete até que o usuário escolha um quarto válido e desocupado
            while (true) {
                System.out.print("Número do quarto que será alugado (0 a 9): ");
                quarto = sc.nextInt();

                // Verifica se está dentro do limite do vetor e se está nulo (livre)
                if (quarto >= 0 && quarto < vetor.length && vetor[quarto] == null) {
                    vetor[quarto] = new Logica_hotel(nome, email);
                    break; // Sai do while interno e vai para o próximo hóspede
                } else {
                    System.out.println("Quarto inválido ou já ocupado! Escolha outro.");
                }
            }
        }

        System.out.println("\nQuartos ocupados:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println("Quarto " + i + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
        }

        sc.close();
    }
}