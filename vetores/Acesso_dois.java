package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Acesso_dois {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numero = {1, 2, 3};

        System.out.println(numero[0]);
        System.out.println(numero[1]);
        System.out.println(numero[2]);

        sc.close();
    }
}
