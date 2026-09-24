package controle_de_estoque;

import java.util.Locale;
import java.util.Scanner;

public class Controle_de_estoque {
    public static void main(String [] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Logica_de_estoque produto = new Logica_de_estoque();

    System.out.println("Entre com os dados do produto:");
    produto.nome = sc.nextLine();



    sc.close();
    }
}
