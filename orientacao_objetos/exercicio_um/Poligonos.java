package exercicio_um;

import java.util.Locale;
import java.util.Scanner;

public class Poligonos {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Logica_poligonos retangulo = new Logica_poligonos();
    
    System.out.println("Entre com o dados do retângulo:");

    System.out.println();
    System.out.print("Altura: ");
    retangulo.altura = sc.nextDouble();
    System.out.print("Largura: ");
    retangulo.largura = sc.nextDouble();

    System.out.printf("Área: %.2f %n", retangulo.Area());
    System.out.printf("Perímetro: %.2f %n", retangulo.Perimetro());
    System.out.printf("Diagonal: %.2f", retangulo.Diagonal());


    sc.close();
    }
}
