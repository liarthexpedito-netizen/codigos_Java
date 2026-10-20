import java.util.Locale;
import java.util.Scanner;

public class Armazem {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        Double preco = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Double resultado = Produto.Soma(preco, quantidade);

        System.out.println("======== NOTA FISCAL =========");

        System.out.printf("O produto " + nome + " possui %.2f investido em estoque %n", resultado);
        System.out.printf("Sendo aplicado um ICMS de %.2f%% sobre a compra = R$ %.2f\n", (Produto.ICMS_CE * 100), Produto.Imposto(preco, quantidade));

        sc.close();
    }
 
}
