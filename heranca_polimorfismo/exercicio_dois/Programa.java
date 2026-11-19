package heranca_polimorfismo.exercicio_dois;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Produto> lista = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Produto #" + i + ":");
            System.out.print("O produto é comum, usado ou importado (c/u/i)? - ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            
            if (resposta == 'c' || resposta == 'C') {
                lista.add(new Produto(nome, preco));
            } else if (resposta == 'u' || resposta == 'U') {
                System.out.print("Data de fabricação: (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                lista.add(new Produto_usado(nome, preco, data));
            } else {
                System.out.print("Taxa alfândegaria: ");
                double taxa_alfandegaria = sc.nextDouble();
                lista.add(new Produto_importado(nome, preco, taxa_alfandegaria));
            }
            
        }

        System.out.println();
        System.out.println("Preços: ");
        for (Produto product : lista) {
            System.out.println(product.Precotag());
        }

        sc.close();
    }
}
