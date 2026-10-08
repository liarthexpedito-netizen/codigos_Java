package sobrecarga;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os dados do produto:");

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);

        System.out.println(produto1.nome);
        System.out.println(produto1.preco);
        System.out.println(produto1.quantidade);

        sc.nextLine(); // Consome o ENTER

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Quantidade: ");
        quantidade = sc.nextInt();

        Produto produto2 = new Produto(nome, quantidade);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidade);
        
        sc.close();
    }
}
