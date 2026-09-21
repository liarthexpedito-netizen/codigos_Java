import java.util.Locale;
import java.util.Scanner;

public class Problema_sem_OO {

    public static void main(String[] args) {
     
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    //Exemplo de código sem orientação a objetos: calculando o IMC de três pessoas.

    System.out.println("Digite a altura e peso de Ana:");
    Double altura_ana = sc.nextDouble();
    Double peso_ana = sc.nextDouble();
    System.out.println("Digite a altura e peso de Carlos");
    Double altura_carlos = sc.nextDouble();
    Double peso_carlos = sc.nextDouble();
    
    //Calculando a potenciação
    Double x = Math.pow(altura_ana, 2);
    Double y = Math.pow(altura_carlos, 2);
    
    //Obtendo o índice de massa corporal = Peso / altura ^ 2
    System.out.printf("O IMC da Ana é: %.2f %n", peso_ana / x);
    System.out.printf("O IMC de Carlos é: %.2f ", peso_carlos / y);

    sc.close();
    }

}