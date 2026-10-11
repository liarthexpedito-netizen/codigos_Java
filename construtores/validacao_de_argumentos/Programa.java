package construtores.validacao_de_argumentos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço do produto: ");
        Double preco = sc.nextDouble();

        Produto produto = new Produto(nome, preco);

        System.out.println(produto);

        sc.close();
    }
}
