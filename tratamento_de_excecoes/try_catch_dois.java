package tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_dois {
    public static void main(String[] args) {

        Metodo1();

        System.out.println("Fim do programa!");

    }

    public static void Metodo1() {
        System.out.println("===INÍCIO DO MÉTODO 1===");
        Metodo2();
        System.out.println("===TÉRMINO DO MÉTODO 1===");
    }

    public static void Metodo2() {

        System.out.println("===INÍCIO DO MÉTODO 2===");

        Scanner sc = new Scanner(System.in);
        try {
            String[] vetor = sc.nextLine().split(" - ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException x) {
            System.out.println("Erro de entrada");
        }

        System.out.println("===TÉRMINO DO MÉTODO 2===");

        sc.close();
    }
    
}
