package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[3];

        // 1. Primeiro fazemos a atribuição
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30; 

        // 2. Depois fazemos a leitura para a variável
        int valor1 = numero[0]; 
        int valor2 = numero[1];
        int valor3 = numero[2];

        System.out.println(valor1);
        System.out.println(valor2);  
        System.out.println(valor3); 

        //Tamanho do vetor
        int tamanho = numero.length;
        System.out.println("Tamanho do vetor = " + tamanho); // Imprime: 3
        

        sc.close();
    }
}
