
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
    //Parâmetro
    double peso;
    double altura;
    //Método
    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
}

/*==========ANOTAÇÕES============

1 - Quando for criado uma classe dentro do mesmo arquivo, como no caso de IMC, deve-se -
nomeá-la como 'public static', pois a classe pertence a ela mesma, é não a um objeto.
2 - Para imprimir coloca-se o objeto seguido de um ponto '.' e o nome da classe. Como em -
ana.calculandoIMC()

new = Cria um objeto a partir de uma classe, resenvando um espaço de memória (HEAP)

IMC ana, carlos;

ana = new IMC();
carlos = new IMC(); 

   Stack  |
          |                 |  HEAP             |
ana ------|---------------> |  altura, peso     |
carlos ---|---------------> |  altura, peso     |
          |                 |                   |

*/