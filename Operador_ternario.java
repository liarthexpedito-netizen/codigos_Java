import java.util.Scanner;

public class Operador_ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        String resultado = (idade >= 18) ? "Você e maior de idade" : "Você não é maior de idade";
        System.out.println(resultado);




        sc.close();
    }
}
