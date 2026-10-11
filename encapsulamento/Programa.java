package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        Double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println(produto);


        sc.close();
    }
    
}
