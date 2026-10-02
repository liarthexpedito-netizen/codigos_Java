package membros_estaticos;

//Versão 2: classe versao_dois com membros de instância.

import java.util.Locale;
import java.util.Scanner;

public class Poligono_versao_dois {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Como no arquivo 'varsao_dois' não foi colocado 'static', então será necessário instaciar 'new'

        Versao_dois esfera = new Versao_dois();

        double raio = sc.nextDouble();
        esfera.circunferencia(raio);
        esfera.volume(raio);




        sc.close();
    }
    
}
