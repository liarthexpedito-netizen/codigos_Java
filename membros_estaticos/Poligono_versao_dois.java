package membros_estaticos;

//Versão 2: classe versao_dois com membros de instância.

import java.util.Locale;
import java.util.Scanner;

public class Poligono_versao_dois {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Como no arquivo 'varsao_dois' não foi colocado 'static', então será necessário instaciar 'new'
        System.out.print("Digite o raio de uma esfera: ");
        Versao_dois esfera = new Versao_dois();

        double raio = sc.nextDouble();
        double c = esfera.circunferencia(raio);
        double v = esfera.volume(raio);

        System.out.printf("Circunferência: %.2f %n", c);
        System.out.printf("Volume %.2f", v);

        sc.close();
    }
    
}
