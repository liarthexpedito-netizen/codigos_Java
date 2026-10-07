package membros_estaticos.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Comprar_dolar {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a contação atual do dolar? ");
        double cotacao_atual = sc.nextDouble();
        System.out.print("Quantos dolares deseja comprar? ");
        double reais = sc.nextDouble();
        
        double resultado = Conversao.real_para_dolar(cotacao_atual, reais);

        System.out.printf("%.2f", resultado);

        sc.close();
        
    }
}