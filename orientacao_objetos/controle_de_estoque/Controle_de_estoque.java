package controle_de_estoque;

import java.util.Locale;
import java.util.Scanner;

public class Controle_de_estoque {
    public static void main(String [] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //Criando um objeto chamado 'produto'
    Logica_de_estoque produto = new Logica_de_estoque();

    System.out.println("Entre com os dados do produto:");
    System.out.printf("Nome: ");
    produto.nome = sc.nextLine();
    System.out.printf("Preço: ");
    produto.preco = sc.nextDouble();
    System.out.printf("Quantidade em estoque: ");
    produto.quantidade = sc.nextInt();

    System.out.println();
    System.out.println("Dados do produto: " + produto);

    System.out.println();
    System.out.print("Entre com o número de produtos que deseja adicionar no estoque: ");
    int n = sc.nextInt();
    produto.Adicionar_produtos(n);
    
    System.out.println();
    System.out.println("Dados do produto atualizados: " + produto);

    System.out.println();
    System.out.print("Entre com o números de produtos que deseja remover do estoque: ");
    n = sc.nextInt();
    produto.Remover_produto(n);

    System.out.println();
    System.out.println("Dados do produto atualizados: " + produto);

    sc.close();
    }
}
