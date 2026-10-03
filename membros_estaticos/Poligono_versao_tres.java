package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Poligono_versao_tres {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double c = Versao_tres.circunferencia(raio);
        double v = Versao_tres.volume(raio);

        System.out.printf("Circunferência: %.2f %n", c);
        System.out.printf("Volume %.2f", v);

        sc.close();
    }
}
