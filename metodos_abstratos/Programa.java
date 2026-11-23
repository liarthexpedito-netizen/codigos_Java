package metodos_abstratos;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Forma> lista = new ArrayList<>();

        System.out.print("Entre com o número de forma: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Forma #" + i + ":");
            System.out.print("Retângulo ou circulo (r/c)? - ");
            char resposta = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor color = Cor.valueOf(sc.next()); //MEMORIZAR FORMA

            if (resposta == 'r' || resposta == 'R') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                lista.add(new Retangulo(color, largura, altura));

            } else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                lista.add(new Circulo(color, raio));
            }

        }

        System.out.println("Área das formas: ");
        for (Forma f : lista) {
            System.out.println(String.format("%.2f", f.Area()));
        }

        sc.close();
    }

}
