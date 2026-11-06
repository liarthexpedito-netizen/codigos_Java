package data_hora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Preços dos produtos
        double arroz = 4.50;
        double feijao = 3.80;
        double macarrao = 2.60;
        double banana = 2.00;
        double laranja = 2.20;
        //Contadores
        int unidades_arroz = 0;
        int unidades_feijao = 0;
        int unidades_macarrao = 0;
        int unidades_banana = 0;
        int unidades_laranja = 0;

        System.out.println("===== BEM VINDO AO MERCADINHO =====");
        System.out.println("===== Tabela de preços =====");
        System.out.println("Arroz = R$ " + arroz);
        System.out.println("Feijão = R$ " + feijao);
        System.out.println("Macarrão = R$ " + macarrao);
        System.out.println("Banana = R$ " + banana);
        System.out.println("Laranja = R$ " + laranja);
        System.out.println("===================================");

        // A variável 'conta' fica FORA do loop para acumular o valor total
        double conta = 0.0;
        String resposta;

        do {
            System.out.print("O que deseja adicionar ao carrinho? - ");
            String escolha = sc.nextLine();

            // Usando equalsequalsIgnoreCase para aceitar "arroz", "Arroz", "ARROZ", etc.
            if (escolha.equalsIgnoreCase("arroz")) {
                conta += arroz;
                unidades_arroz++;
                System.out.println("-> Arroz adicionado (+R$ " + arroz + ")");
            } else if (escolha.equalsIgnoreCase("feijao")) {
                conta += feijao;
                unidades_feijao++;
                System.out.println("-> Feijão adicionado (+R$ " + feijao + ")");
            } else if (escolha.equalsIgnoreCase("macarrao")) {
                conta += macarrao;
                unidades_macarrao++;
                System.out.println("-> Macarrão adicionado (+R$ " + macarrao + ")");
            } else if (escolha.equalsIgnoreCase("banana")) {
                conta += banana;
                unidades_banana++;
                System.out.println("-> Banana adicionada (+R$ " + banana + ")");
            } else if (escolha.equalsIgnoreCase("laranja")) {
                conta += laranja;
                unidades_laranja++;
                System.out.println("-> Laranja adicionada (+R$ " + laranja + ")");
            } else {
                System.out.println("Produto não encontrado na tabela!");
            }

            System.out.print("Deseja adicionar mais algo ao carrinho? (Sim/Não) - ");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        // Exibindo o total formatado com 2 casas decimais
        System.out.printf("\n===== NOTA FÍSCAL =====\n");

        // Exibindo o total formatado com 2 casas decimais
        System.out.println("\n===================================");
        System.out.println("========= NOTA FISCAL =============");
        
        LocalDateTime data_hora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data/Hora: " + formato.format(data_hora));
        System.out.println("-----------------------------------");

        // Usamos 'if' independentes para listar todos os produtos que tiveram unidades > 0
        if (unidades_arroz > 0) {
            System.out.printf("Arroz (%dx): R$ %.2f\n", unidades_arroz, (unidades_arroz * arroz));
        }
        if (unidades_feijao > 0) {
            System.out.printf("Feijão (%dx): R$ %.2f\n", unidades_feijao, (unidades_feijao * feijao));
        }
        if (unidades_macarrao > 0) {
            System.out.printf("Macarrão (%dx): R$ %.2f\n", unidades_macarrao, (unidades_macarrao * macarrao));
        }
        if (unidades_banana > 0) {
            System.out.printf("Banana (%dx): R$ %.2f\n", unidades_banana, (unidades_banana * banana));
        }
        if (unidades_laranja > 0) {
            System.out.printf("Laranja (%dx): R$ %.2f\n", unidades_laranja, (unidades_laranja * laranja));
        }

        System.out.println("-----------------------------------");
        System.out.printf("Total da compra: R$ %.2f\n", conta);
        System.out.println("===================================");

        sc.close();
    }
}
