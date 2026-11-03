package matriz.exercicioum;

import java.util.Scanner;

public class Numeros_negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas e colunas terá a matriz?");
        int n = sc.nextInt();
        int[][] numeros = new int[n][n];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }

        System.out.println();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] < 0) {
                    contador++;
                }
            }
        }

        System.out.println("Números negativos = " + contador);

        sc.close();

    }
}
