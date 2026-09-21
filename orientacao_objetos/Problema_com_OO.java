
import java.util.Locale;
import java.util.Scanner;

public class Problema_com_OO {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        IMC ana, carlos;

        ana = new IMC(); //Cria o objeto 'ana'
        carlos = new IMC(); //Cria o objeto 'carlos'

        System.out.print("Digite o peso da Ana: ");
        ana.peso = sc.nextDouble();

        System.out.print("Digite a altura da Ana: ");
        ana.altura = sc.nextDouble();

        System.out.print("Digite o peso do Carlos: ");
        carlos.peso = sc.nextDouble();

        System.out.print("Digite a altura do Carlos: ");
        carlos.altura = sc.nextDouble();

        System.out.printf("IMC da Ana: %.2f %n", ana.calcularIMC());
        System.out.printf("IMC do Carlos: %.2f", carlos.calcularIMC());

        sc.close();
    }
    //Criação de uma classe estática
    public static class IMC {

    double peso;
    double altura;

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
}
