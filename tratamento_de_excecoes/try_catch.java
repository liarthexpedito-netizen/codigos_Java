package tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        try - Contém o código que representa a execução normal do trecho de código que 
        podeacarretar em uma exceção

        catch - Contém o código a ser executado caso uma exceção ocorra
        Deve ser especificado o tipo da exceção a ser tratada (upcastingé permitido)
        */

        try {
            String[] vetor = sc.nextLine().split(" - ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        }
        catch (InputMismatchException x) {
            System.out.println("Erro de entrada");
        }

        System.out.println("Fim do programa!");

        sc.close();
    }
}

